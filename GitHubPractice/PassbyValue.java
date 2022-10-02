package com.Program;

class Test
{
	int a, b;
	void add(int i, int j)
	{
		a+=i+100;
		b+=j+200;
	}
}
public class PassbyValue {

	public static void main(String[] args) {
		Test obj = new Test();
		int a=100, b=200;
		System.out.println("Value of a and b before call: "+a+" "+b);
		obj.add(a, b);
		System.out.println("Value of a and b after call: "+obj.a+" "+obj.b);
	}

}
