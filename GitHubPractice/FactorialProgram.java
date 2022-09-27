package com.Program;

import java.util.Scanner;

public class FactorialProgram {
	int fact(int a)
	{
		if(a==0)
		{
			return 1;
		}
		return (a*fact(a-1));
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int a= in.nextInt();
		FactorialProgram obj = new FactorialProgram();
		int b= obj.fact(a);
		System.out.print("The Factorial of the given number is: "+b);
		
	}

}


 
