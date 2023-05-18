package com.iris.day1;

public class MethodChaining1 {
	
//////////////////////create a example for methods chaining using this keyword for single class.   obj.meth1().meth2().meth3();
	
	String Name;
	int i;
	
	public MethodChaining1(String s , int i){
		this.i = i;
		this.Name = s;
	}
	
	public MethodChaining1 printName() {
		System.out.println("Data from MethodChaining1 = " +Name);
		return this;
	}
	
	public MethodChaining1 printNo() {
		System.out.println("Data from MethodChaining1 = "+ i);
		return this;
	}

}
