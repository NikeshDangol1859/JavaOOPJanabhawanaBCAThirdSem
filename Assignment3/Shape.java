/*
 * Create a class named ‘Shape’ with a method to print “This is This is 
 * Shape”. Then create two other classes named ‘Rectangle’, ‘Circle’ 
 * inheriting the Shape class, both having a method to print “This is 
 * rectangular shape” and “This is circular shape” respectively. Create a 
 * subclass ‘Square’ of ‘Rectangle’ having a method to print “Square is a
 * rectangle”. Now call the method of ‘Shape’ and ‘Rectangle’ class by 
 * the object of ‘Square’ class.
 */
package com.Assignment3;
class Shapes
{
	void shap()
	{
		System.out.println("This is shape");
	}
}
class Rectangle1 extends Shapes
{
	void rect()
	{
		System.out.println("This is rectangular shape");
	}
}
class Squares extends Rectangle1
{
	void squre()
	{
		System.out.println("Square is rectangle");
	}
}
class Circle extends Shapes
{
	void cir()
	{
		System.out.println("This is circular shape");
	}
}

public class Shape {

	public static void main(String[] args) {
		Squares S = new Squares();
		S.squre();
		S.rect();
		S.shap();
		
		

	}

}
