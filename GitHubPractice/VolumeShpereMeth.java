package com.Program;

import java.util.Scanner;
class MethVolume{
	float Radius;
	float Volume;
	final float PI=3.14159f;
	void insertvol(float r)
	{
		Radius=r;
	}
	float volcalculation()
	{
		Volume =(4/3f)*PI*Radius*Radius*Radius;
		return Volume;
	}
	void methdisplay()
	{
		System.out.println("The Volume of Sphere is: "+Volume);
	}
}
public class VolumeShpereMeth {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Radius: ");
		float r=in.nextFloat();
		MethVolume Meth_V = new MethVolume();
		Meth_V.insertvol(r);
		Meth_V.volcalculation();
		Meth_V.methdisplay();
	}

}
