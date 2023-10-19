package com.Assignment11;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SolutionMain3 {
	
	public static void main(String[] args) {
		Set<Book> bookSet=new TreeSet<>();
		
		//We don't need to implement equals and hashCode in TreeSet 
		// We only need compareTo method
		
		bookSet.add(new Book("ISBN1",2050.12,"Abhey",2));
		bookSet.add(new Book("ISBN10",2050.12,"Abhey",2));
		bookSet.add(new Book("ISBN1",2050.12,"Abhey",2));
		
		//It will throw classCastException as 
		
//		System.out.println(bookSet);
		
		Iterator<Book> itr=bookSet.iterator();
		
		while(itr.hasNext())
		{
			Book b=itr.next();
			System.out.println(b);
		}
		
		//In TreeSet the order of elements will be sorted order of natural ordering(Comparable)
	}
}
