package com.iris.day1;

public class MethodChaining2 {
	
//////////////////////create a example for methods chaining using this keyword between two class.    obj.meth1().meth2().meth3();

	
	String name;
	int no;
	
	MethodChaining2(String s , int i){
		this.name=s;
		this.no=i;
	}
	
	MethodChaining1 printData(){
		System.out.println("Data from MethodChaining2 = "+name);
		System.out.println("Data from MethodChaining2 = "+no);
		return new MethodChaining1(name,no);
	}
	

}


