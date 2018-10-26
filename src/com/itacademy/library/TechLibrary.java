package com.itacademy.library;

import com.itacademy.service.*;

import java.util.ArrayList;
import java.util.List;

public class TechLibrary implements BookService, RiderService {
	
	private List<Book> books;

	{
		books = new ArrayList<>();
		books.add(new Book("TechBook1"));
		books.add(new Book("TechBook2"));
		books.add(new Book("TechBook3"));
		books.add(new Book("TechBook4"));
		books.add(new Book("TechBook5"));

	}
	


	/*public List<Book> getBooks() {
		return new ArrayList<>();

	}*/

	
	
	@Override
	public List<Book> getBookCatalog() {

		return books;
	}

	@Override
	public Book getBook(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Reader> getReader() {
		// TODO Auto-generated method stub
		return null;
	}

}
