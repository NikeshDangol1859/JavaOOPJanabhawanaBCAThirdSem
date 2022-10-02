package com.Program;

import java.util.Scanner;

public class CopyConstructor {
	int height;
	int width;
	int rect;
	
	CopyConstructor(int h, int w)
	{
		height=h;
		width=w;
	}
	void rectcalculation()
	{
		rect=height*width;
		this.display();
	}
	CopyConstructor(CopyConstructor a)
	{
		height=a.height;
		width=a.width;
	}
	void display()
	{
		System.out.println("The area of rectangle is: "+rect);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Length: ");
		int h= in.nextInt();
		System.out.print("Enter the Length: ");
		int w= in.nextInt();
		CopyConstructor obj = new CopyConstructor(h,w);
		obj.rectcalculation();
		obj.display();
		CopyConstructor obj1=new CopyConstructor(obj);
		obj.display();

	}

}
