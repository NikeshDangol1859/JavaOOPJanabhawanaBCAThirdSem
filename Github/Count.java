package com.Assignment;
/*
 * Write a program in Java to count number of objects created by using static data and use
of default constructor. [Hint: create instance variable say ‘count’ as static and in no-args
constructor just increment count by 1]
 */
public class Count {
	static int counter=0;
	Count ()
	{
		counter++;
	}
	void display()
	{
		System.out.println("There are "+counter+" object in the program");
	}

	public static void main(String[] args) {
		Count obj1= new Count();
		Count obj2= new Count();
		Count obj3= new Count();
		Count obj4= new Count();
		obj4.display();
	

	}

}
