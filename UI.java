package AnnotationConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import AnnotationConfiguration.Controller.Controller;


public class UI {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		Controller c = context.getBean(Controller.class);
		c.controller();
	Environment env =context.getEnvironment();
	String fname = env.getProperty("f_name");
	String lname = env.getProperty("l_name");
	System.out.println("The full name is "+fname +" "+lname);
}
}