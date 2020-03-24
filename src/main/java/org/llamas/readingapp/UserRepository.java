package org.llamas.readingapp;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>{
Iterable<User> FindByID(Integer id);
Iterable<User> FindByName(String name);
}
