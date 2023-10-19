package com.assignment11;

import java.util.Scanner;

public class Student {
	private int rollNo;
	private String name;
	private double marks;
	
	public void accept()
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Student rollNo : ");
		this.rollNo=in.nextInt();
		
		in.nextLine();
		System.out.print("Enter Student Name : ");
		this.name=in.nextLine();
		
		System.out.print("Enter Student marks : ");
		this.marks=in.nextDouble();
		
	}
	public int getRollNo() {
		return rollNo;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
