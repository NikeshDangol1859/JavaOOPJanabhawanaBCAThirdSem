/*Create a class with a method that prints “This is parent class” and 
 * its subclass with another method that prints “This is child class”. 
 * Now, create an object for each of the class and call
1 – method of parent class by object of parent class
2 – method of child class by object of child class
3 – method of parent class by object of child class
*/
package com.Assignment3;
class Parent
{
	void parents()
	{
		System.out.println("This is the parent class");
	}
}
class Child extends Parent
{
	void children()
	{
		System.out.println("This is child class");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// method of parent class by object of parent class
		Parent pat = new Parent();
		pat.parents();
		
		Child obj = new Child();
		// method of child class by object of child class
		obj.children();
		//3. method of parent class by object of child class
		obj.parents();
		
				
		

	}

}
