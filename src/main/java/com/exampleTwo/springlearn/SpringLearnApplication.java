package com.exampleTwo.springlearn;

import com.exampleTwo.springlearn.service.Phone;
import com.exampleTwo.springlearn.service.PhoneController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.Annotation;
@Configuration
@ComponentScan
public class SpringLearnApplication {

	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringLearnApplication.class);

		PhoneController pc = (PhoneController) context.getBean("phoneController");
		Phone user = pc.getPhone();

		user.calling();
		user.messaging();
		user.photoClick();

	}

}
