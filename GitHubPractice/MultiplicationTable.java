package com.Program;

import java.util.Scanner;

public class MultiplicationTable {
	int Mul(int a)
	{
		int c=0;
		for(int i=1;i<=10;i++){
			 c=a*i;
			 System.out.println(" "+a+"X"+i+" = "+c);
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		System.out.print("Enter the Number: ");
		int a= in.nextInt();
		MultiplicationTable obj= new MultiplicationTable();
		obj.Mul(a);
		
	}

}
