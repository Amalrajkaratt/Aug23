package task;

import java.util.Scanner;

//One dimensional array
public class Array {

	public static void main(String[] args) {
		
		int a[]=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		
		for(int i=0;i<6;i++)
		{
			a[i]=sc.nextInt();
			
		}
		
		System.out.println("The numbers are");
		
		for(int i=0;i<6;i++)
		{
			System.out.println(a[i]);
		}
		

	}

}
