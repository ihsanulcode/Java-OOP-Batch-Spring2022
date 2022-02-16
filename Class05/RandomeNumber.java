package Lecture5;

import java.util.Scanner;

public class RandomeNumber {

	public static void main(String[] args) {
	
		// formula (upper-lower+1)+lower
//		int lower=1;
//		int upper=6;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter your range: ");
//		int lower=sc.nextInt();
//		int upper=sc.nextInt();
//		int rum=(int) (Math.random()*(upper-lower+1)+lower);
//		System.out.println(rum);
		
		int rum=(int) (Math.random()*6);// 0 include
		System.out.println(rum);
		
		

	}

}
