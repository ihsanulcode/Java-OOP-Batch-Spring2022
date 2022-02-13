package Lecture5;

import java.util.Scanner;

public class Promlem1 {

	public static void main(String[] args) {
	/*
	 * 
	 * 1
	 * 2 2
	 * 3 3 3
	 * 4 4 4 4
	 * 5 5 5 5 5
	 * 
	 */
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of rown");
		int row=sc.nextInt();
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		

	}

}
