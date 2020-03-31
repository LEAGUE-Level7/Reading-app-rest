package org.llamas.readingapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Page {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private Integer id;
private String image;
private String text;
private String audioFile;
private Integer pageNumber;
@ManyToOne()
private Book book;
public Book getBook() {
	return book;
}
public void setBook(Book book) {
	this.book = book;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}
public String getAudioFile() {
	return audioFile;
}
public void setAudioFile(String audioFile) {
	this.audioFile = audioFile;
}
public Integer getPageNumber() {
	return pageNumber;
}
public void setPageNumber(Integer pageNumber) {
	this.pageNumber = pageNumber;
}
}
