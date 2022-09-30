package com.Program;
import java.util.Scanner;

public class SwitchAdd {
	

		public static void main(String[] args) {
			int a=0,b=0,c = 0,d=0;
			Scanner in = new Scanner(System.in);
			System.out.print("Enter the value of a: ");
			a=in.nextInt();
			System.out.print("Enter the value of b: ");
			b=in.nextInt();
			System.out.println("\n1.Addition \n2.Subtraction \n3.Multiplication "
					+ "\n4.Division and Remainder\n5.All");
			System.out.println("Choose the case: ");
			c=in.nextInt();
			switch(c)
			{
				case 1:
					c=a+b;
					System.out.println("The Addition of the numbers is: "+c );
					break;
				case 2:
					c=a-b;
					System.out.println("The Subtraction of the numbers is: "+c );
					break;
				case 3:
					c=a*b;
					System.out.println("The Multiplication of the number is: "+c );
					break;
				case 4:
					c=a/b;
					d=a%b;
					System.out.println("The Division of the number is: "+c );
					System.out.println("The Remainder of the number is: "+d );
					break;
				case 5:
					c=a+b;
					System.out.println("The Addition of the numbers is: "+c );
					c=a-b;
					System.out.println("The Subtraction of the numbers is: "+c );
					c=a*b;
					System.out.println("The Multiplication of the number is: "+c );
					c=a/b;
					d=a%b;
					System.out.println("The Division of the number is: "+c );
					System.out.println("The Remainder of the number is: "+d );
					break;
				default:
					System.out.println("The given number is invalid");
					
			}
		}

	}


