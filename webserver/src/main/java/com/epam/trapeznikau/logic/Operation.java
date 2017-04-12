package com.epam.trapeznikau.logic;

import com.epam.trapeznikau.bean.Book;

public interface Operation {
	
	boolean create(Book book);
	boolean read();
	boolean update(Book book);
	boolean delete(Book book);

}
