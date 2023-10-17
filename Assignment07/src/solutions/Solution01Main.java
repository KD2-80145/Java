package solutions;
import java.util.Scanner;

public class Solution01Main {
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please size of Array : ");
		int n = sc.nextInt();
		sc.nextLine();
		String [] arr = new String[n];
		
		for(int i = 0 ; i < n ; i++)
		{
			System.out.print("Enter a string ");
			arr[i] = sc.nextLine();
		}
		
		for(int i = 0 ; i < n ; i++)
		{
			for(int j = i+1 ; j < n ; j++)
			if(arr[i].equals(arr[j]))
			{
				System.out.println("Duplicate : " + arr[i]);
			}
				
		}
		
		
	}
}