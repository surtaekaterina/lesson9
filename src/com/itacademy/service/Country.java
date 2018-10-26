package com.itacademy.service;

//import
public class Country {

	// private BookService[] libraries;
	private LibraryService[] libraries;
	private int count = 0;

	public Country() {
		libraries = new BookService[5];
	}

	// public void addNewLibrary(Object obj) {
	public void addNewLibrary(BookService bookService) {
		if (bookService != null) {
			libraries[count] = bookService;
			count++;

		}
	}

	public void printAllBook() {
		for (LibraryService ls : libraries) {
			if (ls != null) {
				System.out.println(ls.getBookCatalog().toString());

			}
		}
	}

	public void printAllReadingCityzens() {
		for (LibraryService ls : libraries) {
			if (ls != null) {
				if (ls.getReader() != null) {
					System.out.println(ls.getReader().toString());

				} else {
					System.out.println("No readers for such library type");
				}
			}
		}
	}
}
