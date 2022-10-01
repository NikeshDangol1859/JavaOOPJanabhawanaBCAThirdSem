package com.Program;
// Print by reference
import java.util.Scanner;
class RefVolume
{
	float Radius;
	float Volume;
	final float PI=3.14159f;
	void voldeclear(float r)
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
public class VolumSphereRef {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Radius: ");
		float r=in.nextFloat();
		RefVolume Ref_V = new RefVolume();
		Ref_V.Radius=r;
		Ref_V.voldeclear(r);
		Ref_V.volclculation();
		Ref_V.voldisplay();
	}
}
