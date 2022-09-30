package com.Program;

import java.util.Scanner;

public class ReverseProgram {
	int Rev(int Num)
	{
		
		
		
		int d=0,rev=0,count=0;
		while(Num!=0)
		{
			d=Num%10;
			rev=rev*10+d;
			Num=Num/10;
			count ++;
		}
		System.out.println("There are "+count+" Numbers in total");
		return rev;
	}
	
	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);
		System.out.print("Enter the Number: ");
		
		int Num=in.nextInt();
		ReverseProgram obj=new ReverseProgram();
		int rev=obj.Rev(Num);
	
		System.out.println("The reversed Number is: "+rev);
		

	}

}
