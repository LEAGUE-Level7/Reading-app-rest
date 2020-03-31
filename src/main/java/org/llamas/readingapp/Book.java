package org.llamas.readingapp;

import java.util.ArrayList;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String title;
	private String author;
	private String image;
	private String description;
	private Integer copyright;
<<<<<<< HEAD

	
=======
	private Integer pageNumber;
>>>>>>> 0e7d762167e4504b2ba56b0e748223093f5b655f
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getCopyright() {
		return copyright;
	}
	public void setCopyright(Integer copyright) {
		this.copyright = copyright;
	}
<<<<<<< HEAD

	
=======
	public Integer getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}
>>>>>>> 0e7d762167e4504b2ba56b0e748223093f5b655f
}
