package com.techment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.google.common.util.concurrent.Service;
import com.techment.dao.ICustomerDao;
import com.techment.entity.Customer;
import com.techment.service.ICustomerService;

@RunWith(SpringRunner.class)
@SpringBootTest
class RestWithDtoExampleApplicationTests {
   
	/*
	 * @Test public void Mockitoloads() { when(ICustomerDao.findAll())
	 * .thenReturn(Stream .of(new
	 * Customer(333,"shubhika",31,"USA","shubhika@gmail.com","8888599988"), (new
	 * Customer(444, "shubhum",32,"UAE","shubhum@gmail.com","9994488866"))
	 * .collect(Collectors.toList()));
	 * 
	 * assertEquals(2,ICustomerService.viewAllCustomers().size()); }
	 * 
	 * @Autowired private ICustomerService ICustomerService;
	 * 
	 * @MockBean private ICustomerDao ICustomerDao;
	 */
	 @Test
	 void contextLoads() {
	 }

}
