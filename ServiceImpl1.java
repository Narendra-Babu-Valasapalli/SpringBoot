package AnnotationConfiguration.Service;

import AnnotationConfiguration.Repository.Repository;

public class ServiceImpl1 implements ServiceInterface {

	private Repository repository;

	public void setRepo(Repository repository) {
		this.repository = repository;
	}

	public void service() {

		System.out.println("this is service");

		repository.repository();
	}
}
