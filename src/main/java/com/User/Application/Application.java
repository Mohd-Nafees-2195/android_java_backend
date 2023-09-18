package com.User.Application;

import java.io.ObjectInputFilter.Config;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//import com.User.Application.model.FacultyData;
//import com.User.Application.model.StudentData;
//import com.User.Application.service.FacultyService;
//import com.User.Application.service.StudentService;

@SpringBootApplication
public class Application extends SpringBootServletInitializer   {

//	@Autowired
//	private StudentService studentService;
//	@Autowired
//	private FacultyService facultyService;
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	

	//implements CommandLineRunner 
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		
//	}
}
