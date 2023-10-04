package AnnotationConfiguration.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import AnnotationConfiguration.Repository.Repository;

@Component(value="ServiceImpl2")
// @Primary
public class ServiceImpl2 implements ServiceInterface {

	@Autowired
	private Repository repository;
	public void service() {

		System.out.println("This is new ServiceImpl2");
			repository.repository();
	}
}
