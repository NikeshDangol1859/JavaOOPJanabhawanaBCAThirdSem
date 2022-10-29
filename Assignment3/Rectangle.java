/*
 * Create a class named ‘Rectangle’ with two data members ‘length’ and 
 * ‘breadth’ and two methods to print the area and perimeter of the 
 * rectangle respectively. Its constructor having parameters for length 
 * and breadth is used to initialize length and breadth of the rectangle. 
 * Let class ‘Square’ inherit the ‘Rectangle’ class with its constructor 
 * having a parameter for its side (suppose s) calling the constructor of 
 * its parent class as ‘super(s,s)’. Print the area and perimeter of a 
 * rectangle and a square. [ Hint: if length=breadth=s then rectangle is 
 * square. Area = l x b = s2 and Perimeter = 2(l+b) = 2x2s = 4s => 
 * equivalent to square].
 */
package com.Assignment3;

import java.util.Scanner;

class Rectangles
{
	int length, breadth,peri,area;
	Rectangles(int l,int b)
	{
		length = l;
		breadth = b;
		
	}
	void perimeter()
	{
		peri= 2*(length+breadth);
		System.out.println("The Perimeter of rectangle is: "+peri);
	}
	void area()
	{
		area= length*breadth;
		System.out.println("The area of rectangle is: "+area);
		
	}
}

class Square extends Rectangles
{	
	Square(int l, int b) {
		super(l, b);
		
	}

	void squarecheck()
	{
	if(length==breadth)
	{
		System.out.println("The given sides of a rectangle is square");
	}
	}
	
}


public class Rectangle {	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the length: ");
		int l = in.nextInt();
		System.out.print("Enter the breadth: ");
		int b=in.nextInt();
		Square S = new Square(l, b);
		S.squarecheck();
		S.area();
		S.perimeter();
		
		
		
		

	}

}
