package com.itacademy.service;
import java.util.ArrayList;
import java.util.List;

import Util.BookArrayList;
import Util.StringTitle;


public class MainAppString {

	public static void main(String[] args) {
	
		String str1 = new String("I'mdddddddddddd");
		
		
		System.out.println(str1.length());
		System.out.println(str1.charAt(8));
		
		
		//StringTitle str2;
		
		
		StringTitle str2 = new StringTitle("I'mfdfertgsetr");
		
		System.out.println(str2.length());
		System.out.println(str2.charAt(8));
		
		List books1 = new BookArrayList();
		books1.add(new Book ("Book1"));
		System.out.println(books1.size());
		
		
		List books2 = new BookArrayList();
		System.out.println(books2.size());
		
	}

}
