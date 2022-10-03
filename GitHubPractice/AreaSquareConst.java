package com.Program;

import java.util.Scanner;

class ConstArea
{
	float Area;
	float Length;
	
	ConstArea(float l)
	{
		
		Length=l;
	}
	void areaclculation()
	{
		Area=Length*Length;
	}
	void areadisplay()
	{
		System.out.println("The Area of a Square is: "+Area);
	}
	
}
public class AreaSquareConst {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Length: ");
		float l=in.nextFloat();
		ConstArea Const = new ConstArea(l);
		Const.areaclculation();
		Const.areadisplay();

	}

}
