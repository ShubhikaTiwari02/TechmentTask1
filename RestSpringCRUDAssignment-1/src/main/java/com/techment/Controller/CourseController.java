package com.techment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.Service.ICourseService;

/*import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;*/

import com.techment.entity.Course;

@RestController
@RequestMapping(value = "/courseController")
public class CourseController {

	@Autowired
	ICourseService dao;

	//For viewing All Courses
	@GetMapping(value = "/viewAllCourses")
	public List<Course> viewCourse()
	{
		return dao.viewAllCourse();
	}

	//For Viewing Course By Specific Id
	@GetMapping(value = "/courseById/{id}")
	public Course getById(@PathVariable int id)
	{
		Course c = dao.getCourseById(id);
		return c;
	}
	
	//For Inserting A new Course
	@PostMapping(value = "/InsertCourse")
	public String addNewCourse(@RequestBody Course course) {
		dao.saveCourse(course);

		return "Insertion Done";
	}

	// For Deleting Course By Id and USE DELETE in PostMan
	
	@DeleteMapping("/DeleteById/{id}")
	public String deleteId(@PathVariable int id)
	{
		dao.deleteCourseById(id);
		return "Course Deleted";
	}

	//For Updating Use PUT method in the postman otherwise it will pop up the error
	@PutMapping("/CourseUpdateById/{id}")
	public String updateCourse(@PathVariable int id,@RequestBody Course course)
	{
		try
		{
			Course c = dao.getCourseById(id);
			c.setName(course.getName());
			c.setPrice(course.getPrice());			
			dao.saveCourse(c);
			return "Course Updated";
		}
		catch(Exception e)
		{
			return e.toString();
		}
	}


}
