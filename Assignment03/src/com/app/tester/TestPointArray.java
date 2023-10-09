package com.app.tester;

import java.util.Scanner;
import com.app.geometry.Point2D;

public class TestPointArray {
	static Scanner in = new Scanner(System.in);
//	1. Display details of a specific point
//	User i/p : index
//	O/p : x & y co-ordinates should be displayed. or error message(eg : Invalid index , pls retry!!!!)
//	2) Display x, y co-ordinates of all points
//	Hint : for-each
//	3) User i/p : 2 indices for the points , validate the indices
//	Display distance between specified points (iff they are not located at the same position)
//	eg : sop("Enter index of strt point n end point");
//	validation : boundary condition (0<=index<length-1)

	public static int menu() {
		System.out.println("-------------------------------");
		System.out.println("1. Display Details of Specific Point.");
		System.out.println("2. Display All points.");
		System.out.println("3. Find Distance Between two points.");
		System.out.println("4. EXIT");

		System.out.println("-------------------------------");

		int choice;

		System.out.println("Enter Your Choice : ");
		choice = in.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		
		
		
		System.out.println("Enter no of points : ");
		int noOfPoints=in.nextInt();
		
		Point2D points[] = new Point2D[noOfPoints];
		
		for(int i=0;i<noOfPoints;i++)
		{
			int x,y;
			System.out.println("Enter x co-ordinate of "+(i+1)+"Point: ");
			x=in.nextInt();
			System.out.println("Enter y co-ordinate of "+(i+1)+"Point: ");
			y=in.nextInt();
			
			Point2D temp=new Point2D(x,y);
			points[i]=temp;
		}
		int choice;
		
		while((choice=menu())!=4) {
			
			switch(choice)
			{
			case 1:
				int idx;
				System.out.println("Enter Idx of Point between 0 to "+(noOfPoints-1));
				idx=in.nextInt();
				if(idx>=points.length) {
					System.out.println("Invalid Index Entered.");
					break;
				}
				System.out.println( points[idx].getDetails());
				break;
				
			case 2:
				for(Point2D p:points)
					System.out.println(p.getDetails());
				break;
			case 3:
				System.out.println("Enter two indices from 0 to "+(noOfPoints-1));
				
				System.out.println("Enter idx of first Point : ");
				int idx1=in.nextInt();
				
				System.out.println("Enter idx of second Point : ");
				int idx2=in.nextInt();
				
				if(points[idx1].isEqual(points[idx2]))
				{
					System.out.println("Points coincide each other.");
					break;
				}
				
				double ans=points[idx1].calculateDistance(points[idx2]);
				System.out.println("Distance between "+points[idx1].getDetails()+" and "+points[idx2].getDetails()+" = "+ans);
				
				break;
				
			default:
				System.out.println("Wrong choice Entered.");
				
			}
			
		}
		
		
	}

}
