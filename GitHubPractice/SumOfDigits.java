package com.Program;

import java.util.Scanner;

public class SumOfDigits {
	int sum(int a)
	{
		int count=0;
		int rev=0;
		while(a!=0){
		int d= a%10;
		 rev=rev+d;
		 a=a/10;
		 count ++;
		}
		System.out.print("There are " +count+ " numbers in total");
		System.out.println("\nAnd The sum of numbers is: " + rev);
		
		return rev;
	}

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int a= in.nextInt();
		SumOfDigits obj =new SumOfDigits();
		 obj.sum(a);

	}

}
