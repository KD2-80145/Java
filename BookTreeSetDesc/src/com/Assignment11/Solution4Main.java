package com.Assignment11;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Solution4Main {

	static class PriceCompare implements Comparator<Book> {
		
		@Override
		public int compare(Book a, Book b) {
			return -Double.compare(a.getPrice(), b.getPrice());
		}
	}
	
	public static void main(String[] args) {
		
		Set<Book> bookSet = new TreeSet<>(new PriceCompare());

		bookSet.add(new Book("1", 2501.22, "Abhey", 10));
//		bookSet.add(new Book("1",250.22,"Abhey",10));
//		bookSet.add(new Book("1",250.22,"Abhey",10));
//		bookSet.add(new Book("1",250.22,"Abhey",10));

//		System.out.println(bookSet);

		// To achieve descending order of price we need to use Comparator

		
		bookSet.add(new Book("1", 500.00, "Abhey", 10));
		bookSet.add(new Book("2", 100.00, "Ansh", 10));
		bookSet.add(new Book("3", 2502.22, "Raj", 10));
		
		
		Iterator<Book> itr=bookSet.iterator();
		
		while(itr.hasNext())
		{
			Book b=itr.next();
			System.out.println(b);
		}
		
		
		/*TreeSet will work either on logic of Comparable or Comparator
		 * Now we have implemented Comparator so it is displaying in 
		 * descending of price and is inserting duplicate values as now it is not checking compareable
		*/
		
		//To use Descending Iterator we need refrence of TreeSet
		
		TreeSet<Book> set=new TreeSet<>(new PriceCompare());
		
		set.add(new Book("1", 500.00, "Abhey", 10));
		set.add(new Book("2", 100.00, "Ansh", 10));
		set.add(new Book("3", 2502.22, "Raj", 10));
		
		System.out.println("Displaying in Reverse order");
		
		Iterator<Book> itr2=set.descendingIterator();
		
		while(itr2.hasNext())
		{
			Book b=itr2.next();
			System.out.println(b);
		}
	}

}
