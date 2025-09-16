package com.Hibernate.HiberneteDemo;

import com.Hibernate.HiberneteDemo.Service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HiberneteDemoApplication {

	public static void main(String[] args) {
		 ApplicationContext context=SpringApplication.run(HiberneteDemoApplication.class, args);
		UserService userService = context.getBean(UserService.class);
		userService.insertSampleData();
		System.out.println(userService.getUserData());


	}

}
