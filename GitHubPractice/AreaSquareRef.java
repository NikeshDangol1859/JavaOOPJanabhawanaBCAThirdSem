package com.Program;

import java.util.Scanner;

class RefArea
{
	float Area;
	float Length;
	
	
	void areaclculation()
	{
		Area=Length*Length;
	}
	void areadisplay()
	{
		System.out.println("The Area of a Square is: "+Area);
	}
	
}
public class AreaSquareRef {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Length: ");
		float l=in.nextFloat();
		RefArea A_Sq = new RefArea();
		A_Sq.Length=l;
		//A_Sq.areadeclear(l);
		A_Sq.areaclculation();
		A_Sq.areadisplay();

	}

}
