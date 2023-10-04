package com.SpringDataJpaDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "ServiceDemo")
public class ServiceDemo {
@Autowired
	private RepoDemo repodemo;

public String insertEntity(EntityDemo entity) {
	repodemo.save(entity);
	return "Entity Inserted Successfully";
}
//	public String findEntity(EntityDemo e) {
//		Optional<EntityDemo> o = repodemo.findById(e.getId());
//		 em.find(EntityDemo.class,e.getId)
//		if(o.isPresent()) {
//			EntityDemo el = o.get();
//			return el.toString();
//		}
//		else
//			return "No entity found with " +e.getId();
//		
//		
//}
//	
	public EntityDemo readEntity(EntityDemo entity) {
		Optional<EntityDemo> opt = repodemo.findById(entity.getId());
		
		if(opt.isPresent())
			return opt.get();
		
		else
			return null;
	}
	
	public EntityDemo updateEntity(String name, Integer id) {
		Optional<EntityDemo> optional = repodemo.findById(id);
		if (optional.isPresent()) {
			EntityDemo dm = optional.get();
			dm.setName(name);
			repodemo.save(dm);
			return dm;
		} else
			throw new RuntimeException("no entity found with id " + id);
	}
	
	public void deleteEntity(Integer id) {
//		repodemo.deleteById(id);
		Optional<EntityDemo> dm = repodemo.findById(id);
		// Supplier
		EntityDemo e = dm.orElseThrow(() -> new RuntimeException("no entity found with id " + id));

		repodemo.delete(e);
		System.out.println("deleted successfully");
		
	}
	public List<EntityDemo> readAllEntities() {
		Iterable<EntityDemo> it = repodemo.findAll();
		List<EntityDemo> li = new ArrayList<EntityDemo>();
		for (EntityDemo i : it) {
			li.add(i);
		}
		return li;
	}
	
	public List<EntityDemo> readAll(Set<Integer> s) {

		Iterable<EntityDemo> it = repodemo.findAllById(s);
		List<EntityDemo> li = new ArrayList<EntityDemo>();
		for (EntityDemo i : it) {
			li.add(i);
		}
		return li;

	}
	
	public void deleteAll() {
		repodemo.deleteAll();
		
		System.out.println("All entities deleted Successfully");
	}
}
