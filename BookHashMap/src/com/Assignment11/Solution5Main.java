package com.Assignment11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution5Main {

	public static void main(String[] args) {

		/*
		 * HashMap works on equals and hasCode we can delete compareTo method from Book
		 * class
		 */

		/*
		 * In this case we do not need equals and hashCode as String is a Wrapper class
		 * and String already has equals and hashCode
		 */
		Map<String, Book> bookMap = new HashMap<>();

		int choice;
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("0. Exit");
			System.out.println("1. Add Book");
			System.out.println("2. Find Book by entering Isbn");

			System.out.print("Enter Choice : ");
			choice = in.nextInt();
			switch (choice) {
			case 1:
				Book b = new Book();
				b.accept();
				bookMap.put(b.getIsbn(), b);
				break;
			case 2:
				in.nextLine();
				System.out.println("Enter Isbn to find Book");
				String findIsbn = in.nextLine();
//				Book temp=new Book();
				Book foundBook = bookMap.get(findIsbn);// get returns null if not found

				if (foundBook == null) {
					System.out.println("Book Not found with isbn."+findIsbn);
				} else {
					System.out.println("Details of Book found: ");
					System.out.println(foundBook);
				}
				break;
			default:
				System.out.println("Wrong Choice Entered.");
				break;
			}
		} while (choice != 0);


	}

}
