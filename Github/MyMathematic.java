package com.Bonus;

import java.util.Scanner;

/*
 * Write a Console based application. Create a class MyMath. Within the Class write three
overloaded methods add(). The First method takes two integer parameters and adds them
and returns result. The second overloaded method takes three parameters and adds them.
The third one takes four parameters and adds them and returns the sum. Create a another
class CallMyMath and call the overloaded methods of MyMath class with suitable
arguments and prints each results there.
 */
class MyMath
{
	static int add(int a, int b)
	{
		return a+b;
	}
	static int add(int a, int b, int c)
	{
		return a+b+c;
	}
	static int add( int a, int b, int c, int d)
	{
		return a+b+c+d;
	}
		
}
class CallMyMath
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value for a: ");
		int a = in.nextInt();
		System.out.println("Enter the value for b: ");
		int b = in.nextInt();
		System.out.println("Enter the value for c: ");
		int c = in.nextInt();
		System.out.println("Enter the value for d: ");
		int d = in.nextInt();
		MyMath obj = new MyMath();
		int addab=obj.add(a, b);
		System.out.println("The addtion of a and b is: "+addab);
		int addabc=obj.add(a, b, c);
		System.out.println("The addtion of a, b and c is: "+addabc);
		int addabcd=obj.add(a, b, c, d);
		System.out.println("The addition of a,b ,c and b is: "+addabcd);
	}
}

public class MyMathematic {

	public static void main(String[] args) {
		CallMyMath MT = new CallMyMath();
		MT.main(args);
		
	}

}
