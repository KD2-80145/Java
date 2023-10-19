package com.assignment11;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution6Main {

	public static void main(String[] args) {
		
		Map<Integer,Student> map=new LinkedHashMap<>();
		
		/* In this Map also we don't need to implement equals and hashcode method
		 * as the key is a Wrapper class and it has its own hashcode and equals methods
		 */
		
		Scanner in=new Scanner(System.in);
		Student s=new Student();
		s.accept();
		
		map.put(s.getRollNo(), s);
		
		System.out.println("Enter rollNo to get Student details : ");
		int key=in.nextInt();
		
		Student foundStudent=map.get(key);
		
		if(foundStudent!=null)
		{
			System.out.println("Student Found : ");
			System.out.println(foundStudent);
		}
		else {
			System.out.println("Student not found.");
		}

	}

}
