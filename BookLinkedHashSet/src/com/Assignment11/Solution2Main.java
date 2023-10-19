package com.Assignment11;

import java.util.LinkedHashSet;
import java.util.Set;

public class Solution2Main {

	
	public static void main(String[] args) {
		Set<Book> bookSet=new LinkedHashSet<>();
		bookSet.add(new Book("ISBN1",200.20,"Abhey",1));
		bookSet.add(new Book("ISBN15",200.20,"Abhey",1));
		bookSet.add(new Book("ISBN3",200.20,"Abhey",1));
		bookSet.add(new Book("ISBN10",200.20,"Abhey",1));
//		bookSet.add(new Book("ISBN1",200.20,"Abhey",1));
//		bookSet.add(new Book("ISBN1",200.20,"Abhey",1));
		
		//Now there will be no duplicate entries as we have implemneted hasCoce and equals method in Book Class
		
		//In LinkedListHashSet Books are stored in insertion order
		
		System.out.println(bookSet);
	}
	
}
