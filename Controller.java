package AnnotationConfiguration.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import AnnotationConfiguration.Service.ServiceInterface;

@Component(value="Controller")
public class Controller {

//	@Autowired
//	private ServiceImpl2 service;
	
	@Autowired
	
//	@Qualifier(value = "ServiceImpl1")
	@Qualifier(value = "ServiceImpl2")
	
	private ServiceInterface service;
	
	public void controller() {
		System.out.println("This is controller");
//		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
//		
//		ServiceImpl2 s = context.getBean(ServiceImpl2.class);
		service.service();
	}
}
