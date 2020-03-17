package org.llamas.readingapp;

public class Page {
private Integer id;
private String image;
private String text;
private String audioFile;
private Integer bookID;
private Integer pageNumber;
private Book book;
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
public Integer getBookID() {
	return bookID;
}
public void setBookID(Integer bookID) {
	this.bookID = bookID;
}
public Integer getPageNumber() {
	return pageNumber;
}
public void setPageNumber(Integer pageNumber) {
	this.pageNumber = pageNumber;
}
}
