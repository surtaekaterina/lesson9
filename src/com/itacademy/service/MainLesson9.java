package com.itacademy.service;
import com.itacademy.library.*;

public class MainLesson9 {

	public static void main(String[] args) {
		
		Country belarus = new Country();
		belarus.addNewLibrary(new ChildrenLibrery());
		belarus.addNewLibrary(new TechLibrary());
		belarus.addNewLibrary(new ArtsLibrary());
		
		belarus.printAllBook();
		belarus.printAllReadingCityzens();

		
		
		String str = "Hello";
		 
	}

}
