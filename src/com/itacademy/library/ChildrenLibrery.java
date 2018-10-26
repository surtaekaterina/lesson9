package com.itacademy.library;

import java.util.List;

import com.itacademy.service.*;
import java.util.ArrayList;

//import com.itacademy.service;

public class ChildrenLibrery implements BookService, RiderService {

	private List<Book> books;

	{
		books = new ArrayList<>();
		books.add(new Book("ChildrenBook1"));
		books.add(new Book("ChildrenBook2"));
		books.add(new Book("ChildrenBook3"));

	}

	/*public Book[] getChildrenBooks() {
		return new Book[] { new Book() };
	}*/

	@Override
	public List<Book> getBookCatalog() {
		// TODO Auto-generated method stub
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
