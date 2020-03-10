package org.llamas.readingapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	private Integer reviews;
	
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
	public Integer getReviews() {
		return reviews;
	}
	public void setReviews(Integer reviews) {
		this.reviews = reviews;
	}
}