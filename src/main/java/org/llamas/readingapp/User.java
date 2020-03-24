package org.llamas.readingapp;

import java.util.Set;

import javax.persistence.OneToMany;

public class User {
private Integer id;
private String name; 
private String pass;
private Set<Book> books;
@OneToMany
public Set<Book> getBooks() {
	return books;
}
public void setBooks(Set<Book> books) {
	this.books = books;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
}
