package com.SpringDataJpaDemo;

import java.util.TreeSet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext con = SpringApplication.run(SpringDataJpaApplication.class, args);
//	EntityManagerFactory emf =	Persistence.createEntityManagerFactory("TestPersistence");
//		EntityManager em= emf.createEntityManager();
//	EntityTransaction et =	em.getTransaction();
	
//	em.persist(ed);
//	et.begin();
//	
//	em.close();
//	emf.close();

	EntityDemo ed = new EntityDemo(5, "Ajay");
//	RepoDemo demo =	con.getBean(RepoDemo.class);
	ServiceDemo demo=con.getBean(ServiceDemo.class);
//	demo.save(ed);
//	System.out.println(demo.findEntity(ed));
//	===============================================
	System.out.println(demo.insertEntity(ed));
	
//	System.out.println(demo.readEntity(ed));
	
//	System.out.println(demo.updateEntity("Narendra Babu", 5));
	
//	demo.deleteEntity(4);
	
//	System.out.println(demo.readAllEntities());
	
	TreeSet<Integer> tst = new TreeSet<Integer>();
	tst.add(1);
	tst.add(2);
	tst.add(3);
	tst.add(4);
	tst.add(5);
	tst.add(6);
	
//	System.out.println(demo.readAll(tst));
	
// demo.deleteAll();
	
	}

}
