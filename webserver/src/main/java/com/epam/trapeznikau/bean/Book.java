package com.epam.trapeznikau.bean;

import java.util.Date;

public class Book {
	private String author;
	private String title;
	private Date yearPublish;
	
	public Book(){}
	
	public Book(String author,String title, Date yearPublish ){
		this.author = author;
		this.title = title;
		this. yearPublish = yearPublish;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getYearPublish() {
		return yearPublish;
	}

	public void setYearPublish(Date yearPublish) {
		this.yearPublish = yearPublish;
	}
	
	

}
