package com.spring.jdbc;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.AppConfig;

public class MainLogic {
	
	public static void main(String args[]) throws InterruptedException, SQLException{
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		StudentService studentService = ac.getBean(StudentService.class);
		studentService.insert(new Student(1,380,"Mastan"));
		studentService.delete(3);
		studentService.update(new Student(6,980,"samantha"));
		studentService.list();
		
        ac.close(); 
//		SpringJdbcSelect sj = ac.getBean(SpringJdbcSelect.class);
//		sj.select();
		//sj.insert();
	}

}
