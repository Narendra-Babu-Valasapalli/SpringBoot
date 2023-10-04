package AnnotationConfiguration.Repository;

import org.springframework.stereotype.Component;

@Component(value="Repository")
public class Repository {

	public void repository() {
	
		System.out.println("This is repository");
	}
}
