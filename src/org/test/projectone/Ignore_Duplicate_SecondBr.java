package org.test.projectone;

import java.util.Scanner;

public class Ignore_Duplicate_SecondBr{
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number for swapping:");
		System.out.println("Entter first number");
		int a=sc.nextInt();
		
		System.out.println("Enter Second number");
		int b = sc.nextInt();
	
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("First Number after swapping is a: "+a);
		System.out.println("Second Number after swapping is b: "+b);
		
	}

	
	
	


	}
