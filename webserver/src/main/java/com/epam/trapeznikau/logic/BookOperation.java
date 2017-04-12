package com.epam.trapeznikau.logic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

import com.epam.trapeznikau.bean.Book;

public class BookOperation{

	public static boolean create(Book book) {
		
		return false;
	}

	public static InputStreamReader read(String uri) throws FileNotFoundException {
		InputStreamReader input = null;
		if (uri.equals("/book")){
		input = new InputStreamReader(new FileInputStream("D:\\Siarhei_Trapeznikau\\Java Automation\\Web service\\Tasks\\Tasks 01 BookWebService\\Data\\book\\books.xml"));}
		return input;
	}

	public static boolean update(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	public static boolean delete(Book book) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
