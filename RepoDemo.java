package com.SpringDataJpaDemo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface RepoDemo extends CrudRepository<EntityDemo, Integer>{

}
