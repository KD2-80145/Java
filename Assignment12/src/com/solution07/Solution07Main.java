package com.solution07;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Solution07Main {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		
		Stream<Integer> stream =list.stream();
		
		Random r=new Random();
		
		int sum=Stream
				.generate(()->r.nextInt())
				.limit(10)
				.reduce(0,(x,y)->x+y);
		
		/*
		 * Sum of Numbers from 1 to 5
		int sum=Stream
					.iterate(1,x->x+1)
					.limit(5)
					.reduce(0, (x,y)->x+y);
		*/
		System.out.println(sum);
		
		
			  	

	}

}
