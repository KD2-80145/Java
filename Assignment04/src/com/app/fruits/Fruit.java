package com.app.fruits;

import java.util.Scanner;

public class Fruit {
	
	static Scanner in= new Scanner(System.in);
	private String color;
	private double weight;
	private String name;
	private boolean isFresh;
	
	public Fruit(String name)
	{
		this.name=name;
	}
	public void acceptData()
	{
		System.out.println("Enter Weight of Fruit : ");
		this.weight=in.nextDouble();
		
		System.out.println("Enter Color of Fruit : ");
		this.color=in.next();
		
		this.isFresh=true;
		
	}
	
	public String taste()
	{
		return "no Specific taste";
	}
	
	public String getName()
	{
		return this.name;
	}
	public boolean getFresh()
	{
		return this.isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	
	
	public String toString()
	{
		return "Name : "+this.getName()+" : color = "+this.color+"Weight : "+this.weight+" Taste : "+this.taste();
	}
	
	
	
}
