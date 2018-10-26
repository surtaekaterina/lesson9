package com.itacademy.service;

import java.util.List;

public interface LibraryService {
	List<Book> getBookCatalog();

	Book getBook(int id);

	void addBook(Book book);

	List<Reader> getReader();
}
