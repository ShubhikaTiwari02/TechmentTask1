package com.techment.Service;

import java.util.List;
import com.techment.entity.Course;
public interface ICourseServiceImpl {

		public List<Course> viewAllCourse();
		public String saveCourse(Course course);
		public Course getCourseById(int id);
		public String deleteCourseById(Integer id);
	}


