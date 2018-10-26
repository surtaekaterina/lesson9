package com.itacademy.library;

import com.itacademy.service.*;

import java.util.ArrayList;
import java.util.List;

public class ArtsLibrary implements BookService, RiderService {

	private List<Book> books;

	{
		books = new ArrayList<>();
		books.add(new Book("ArtsBook1"));
		books.add(new Book("ArtsBook2"));
		books.add(new Book("ArtsBook3"));
		books.add(new Book("ArtsBook4"));
		books.add(new Book("ArtsBook5"));
	}

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
