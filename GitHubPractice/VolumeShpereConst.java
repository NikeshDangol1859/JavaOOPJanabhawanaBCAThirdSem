package com.Program;

import java.util.Scanner;

class ConstVolume
{
	float Radius;
	float Volume;
	final float PI=3.14159f;
	ConstVolume(float r)
	{	
		Radius=r;
	}
	void volclculation()
	{
		Volume=(4/3f)*PI*Radius*Radius*Radius;
	}
	void voldisplay()
	{
		System.out.println("The Volume of a Shpere is: "+Volume);
	}	
}
public class VolumeShpereConst {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Radius: ");
		float r=in.nextFloat();
		ConstVolume Const_V = new ConstVolume(r);
		Const_V.volclculation();
		Const_V.voldisplay();
	}

}
