package org.llamas.readingapp;

public class Page {
private Integer id;
private String image;
private String text;
private String audioFile;
private Integer pageNumber;
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
