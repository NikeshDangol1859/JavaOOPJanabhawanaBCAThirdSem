package com.Bonus;
/*
  Print the average of three numbers entered by user by creating a class named ‘Average’
having a method to calculate and print the average.
 */
import java.util.Scanner;
class FindAverage
{
	int first,second,third;
	float average;
	void calculation()
	{
		average=(first+second+third)/3;
		
	}
	void display()
	{
		System.out.println("The average of given numbers is: "+average);
	}
}

public class Average {

	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		System.out.print("Enter the Number for a: ");
		int a= in.nextInt();
		System.out.print("Enter the Number for b: ");
		int b= in.nextInt();
		System.out.print("Enter the Number for c: ");
		int c= in.nextInt();
		FindAverage ave = new FindAverage();
		ave.first=a;
		ave.second=b;
		ave.third=c;
		ave.calculation();
		ave.display();

	}
 
}
