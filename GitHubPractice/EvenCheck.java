package com.Program;

import java.util.Scanner;

public class EvenCheck {
	Boolean CheckNumEven(int Num){
		
		if(Num%2==0)
		{
			
			return true;
		}
		return false;
	}
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int Num = in.nextInt();
		EvenCheck obj = new EvenCheck();
		boolean result= obj.CheckNumEven(Num);
		if(result==true){
			System.out.print("The given number is Even.");
		}
		else
		{
			System.out.print("The given number is not Even.");
		}

	}


	

}
