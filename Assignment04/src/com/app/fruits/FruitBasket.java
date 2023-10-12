package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
	static Scanner in = new Scanner(System.in);

	public static int menu() {
		System.out.println("-------------------------------");
		System.out.println("0. EXIT");
		System.out.println("1. Add Mango.");
		System.out.println("2. Add Orange.");
		System.out.println("3. Add Apple.");
		System.out.println("4. Display all fruits.");
		System.out.println("5. Display details of all fruits.");
		System.out.println("6. Display details of Stale fruits.");
		System.out.println("7. Mark Fruit as Stale.");
		System.out.println("8. Mark all fruits Stale.");
		System.out.println("-------------------------------");

		System.out.println("Enter your choice");
		int choice = in.nextInt();

		return choice;

	}

	public static void main(String[] args) {

		System.out.println("Welcome to Fruit Shop.");
		System.out.println("Enter the size of the Basket.");

		int basketSize = in.nextInt();

		Fruit[] basket = new Fruit[basketSize];

		int choice, count = 0, idx = 0;
		Fruit fruit;
		while ((choice = menu()) != 0) {

			switch (choice) {
			case 1:
				if (count < basketSize) {
					fruit = new Mango("Mango");
					fruit.acceptData();
					basket[count++] = fruit;
				} else {
					System.out.println("Basket is Full You can not add More.");
				}
				break;
			case 2:
				if (count < basketSize) {
					fruit = new Orange("Orange");
					fruit.acceptData();
					basket[count++] = fruit;
				} else {
					System.out.println("Basket is Full You can not add More.");
				}
				break;
			case 3:
				if(count<basketSize) {
				fruit = new Apple("Apple");
				fruit.acceptData();
				basket[count++] = fruit;
				}
				else {
					System.out.println("Basket is Full You can not add More.");
				}
				break;
			case 4:
				for (Fruit temp : basket) {
					if (temp != null) {
						System.out.println(temp.getName());
					}
				}
				break;
			case 5:
				idx = 0;
				for (Fruit temp : basket) {
					if (temp != null) {
						System.out.println("-------------------");
						System.out.println("FRUIT " + idx + " : " + temp.toString());
						System.out.println("-------------------");
					}
					idx++;
				}
				break;
			case 6:
				idx = 0;
				for (Fruit temp : basket) {
					if (!temp.getFresh()) {
						System.out.println("FRUIT " + idx + " : " + temp.toString());
					}
					idx++;
				}
				break;

			case 7:
				System.out.println("Enter Fruit indedx to mark stale : ");
				int staleIdx = in.nextInt();
				if (staleIdx < 0 || staleIdx >= basketSize) {
					System.out.println("Invalid index");
				} else {
					basket[staleIdx].setFresh(false);
				}
				break;
			case 8:
				for (Fruit temp : basket) {
					if (temp.taste().contains("Sour")) {
						temp.setFresh(false);
					}
				}

			}
		}

	}

}
