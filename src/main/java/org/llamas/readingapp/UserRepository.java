package org.llamas.readingapp;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>{
//Iterable<User> findByID(Integer id);
//Iterable<User> findByName(String name);
}
