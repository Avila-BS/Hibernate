package com.xworkz.data_company;

public class MyClass {
	public static String staticVar="can access";
	private String privVar="cannot access";
	
	public static class ChildClass
	{
		public void myMethod()
		{
			System.out.println(staticVar);
		}
	}
	
	public static void main(String a[])
	{
		MyClass.ChildClass cc=new MyClass.ChildClass();
		cc.myMethod();
	}
}
