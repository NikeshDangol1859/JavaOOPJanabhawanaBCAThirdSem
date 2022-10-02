package com.Program;
class Test1
{
	int a=200;
	void add(Test1 obj)
	{
		obj.a+=obj.a+100;
		
	}
}
public class PassbyReference {

	public static void main(String[] args) {
		Test1 obj = new Test1();
		//int a=100, b=200;
		System.out.println("Value of a before call: "+obj.a);
		obj.add(obj);
		System.out.println("Value of a after call: "+obj.a);
		

	}

}
