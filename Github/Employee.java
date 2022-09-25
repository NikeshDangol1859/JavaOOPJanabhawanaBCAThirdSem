package com.Bonus;

import java.util.Scanner;

public class Employee {
	float Salary;
	int Work;
	void getInfo(float S,int W)
	{
		Salary=S;
		Work=W;
	}
	void addSalary()
	{
		if(Salary<500)
		{
			Salary=Salary+100;
		//	System.out.println("The Salary of Employer: "+Salary);
		}
		
	}
	void addWork()
	{
		if(Work<6)
		{
			System.out.println("The  Final salary is: "+Salary);
		}
		else
		{
			Salary=Salary+50;
			System.out.println("The Final Salary is: "+Salary);
		}
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Salary: ");
		float S= in.nextFloat();
		System.out.println("Enter the work of Hours: ");
		int W = in.nextInt();
		Employee E = new Employee();
		E.getInfo(S, W);
		E.addSalary();
		E.addWork();
		

	}

}
