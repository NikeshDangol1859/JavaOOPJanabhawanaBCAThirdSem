package com.Program;

import java.util.Scanner;

class MethArea
{
	float Area;
	float Length;
	
	void areainsert(float l)
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
public class AreaSquareMeth {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Length: ");
		float l=in.nextFloat();
		MethArea Meth_A = new MethArea();
		Meth_A.areainsert(l);
		Meth_A.areaclculation();
		Meth_A.areadisplay();

	}

}
