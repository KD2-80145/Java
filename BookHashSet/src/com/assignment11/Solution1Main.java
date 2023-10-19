package com.assignment11;

import java.util.HashSet;
import java.util.Set;

public class Solution1Main {
	
	public static void main(String[] args) {
		Set<Book> bookSet=new HashSet<>();
		
		bookSet.add(new Book("QR1",200.0,"Abhey",2));
		bookSet.add(new Book("QR1",200.0,"Abhey",2));
		
//		System.out.println(bookSet);
		
		//HashSet T must implement equals and hashCode to avoid duplicacy
		//after implementing hashcode
		
//		HashSet stores elements in hasCode order
		
		
		System.out.println(bookSet);
	}
}
