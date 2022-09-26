package com.Bonus;

import java.util.Scanner;

/*
 * Write a program that has variables to store Car data like: carModel, carName, carPrice
and carOwner. The program should include functions to assign user defined values to the
above mentioned variable and a display function to show the values. Write a main that
calls these functions. Now write another runner class that declares three Car objects and
displays the data of all three.
 */
class Cars
{
	double carPrice;
	String carName, carOwner,carModel;
	void veriabelInitialize(String CM, String CN, double CP, String CO)
	{
		carModel=CM;
		carName=CN;
		carPrice=CP;
		carOwner=CO;
		
	}
	void display()
	{
		System.out.println("\nCarModel: "+carModel+"\nCar Name: "+carName+"\nCar Price: "+carPrice+"\nCar Owner: "+carOwner);
	}
}
class Runner
{
	public static void main(String[] args)
	{
		
	
	Cars obj = new Cars ();
	Scanner in = new Scanner(System.in);
	System.out.print("Enter the Model of Car:");
	String CM = in.nextLine();
	System.out.print("Enter the Car Name: ");
	String CN = in.nextLine();
	System.out.print("Enter the Name of car owner: ");
	String CO =in.nextLine();
	System.out.print("Enter the Price of car: ");
	double CP = in.nextDouble();
	obj.veriabelInitialize(CM, CN, CP, CO);
	obj.display();
}
}

public class Car {

	public static void main(String[] args) {
		Runner Run = new Runner();
		Run.main(args);

	}
 
}
