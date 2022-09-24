package com.Assignment;
// Write a program to solve quadratic equations (use if, else if and else).

import java.util.Scanner;

public class QuadraticEquation {
	double x, x1;
	void quad(int a, int b,int c)
	{
		x=(-b+Math.sqrt(b*b-4*a*c))/2*a;
		x1=(-b-Math.sqrt(b*b-4*a*c))/2*a;
	}
	void display()
	{
		System.out.println("The value of x is \nEither= "+x+"\nOr= "+x1);
	}
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the equation(ax^2+bx+c):");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		QuadraticEquation QD = new QuadraticEquation();
		QD.quad(a, b, c);
		QD.display();
		
		

	}

}

/*
double x;
int b=12,a=1,c=32;
x=(-b+Math.sqrt(b*b-4*a*c))/2*a; -4

	System.out.println(x);

x=(-b-Math.sqrt(b*b-4*a*c))/2*a; -8

	System.out.println(x);
*/