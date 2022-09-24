package com.Assignment;
/*
 * Write a program to print the area of a rectangle by creating a class named ‘Area’ taking
the values of its length and breadth as parameters of its constructor and having a method
named ‘returnArea’ which returns the area of the rectangle. Length and breadth of
rectangle are entered through keyboard.
 */
import java.util.Scanner;


public class Area {
	float area;
	int Length,Breadth;
	Area(int l,int b)
	{
		Length=l;
		Breadth=b;
	}
	float returnArea()
	{
		return Length*Breadth;	
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Length: ");
		int l=in.nextInt();
		System.out.print("Enter the Breadth: ");
		int b=in.nextInt();
		Area obj = new Area(l,b);
		float Area=obj.returnArea();
		System.out.println("The area of Rectangle is:"+Area);
		

	}

}
