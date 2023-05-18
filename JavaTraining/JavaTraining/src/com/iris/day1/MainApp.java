package com.iris.day1;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
	
	static int i = 0;
	
	public static void main(String args[]) {

//	#1. Write a program, to make Heap full? Change Heapsize and recheck
///////////////////// create a program to encounter OutOfMemoryError Exception.
//	

//		String[] s = new String[10000000];
//		List<String[]> list = new ArrayList();
//		for(int i=0; ;i++) {
//			list.add(s);
//		}
	
//	#2. a) Call main() method from itself, print number of times successfuly called before StackOverflowException, 
//	b) increase Stack size, when running, see that above number gets changed??
//////////////////// create a program to encounter StackOverFlowError Exception.
	
	
	
		try {
			i++;
			System.out.println(i);
			MainApp.main(args);
		}catch(StackOverflowError e) {
			
		}
		
//////////////////////create a example for methods chaining using this keyword for single class.   obj.meth1().meth2().meth3();

	
	MethodChaining1 m1 = new MethodChaining1("Hello", 1);
	m1.printName().printNo();
	
//////////////////////create a example for methods chaining using this keyword between two class.    obj.meth1().meth2().meth3();

		MethodChaining2 m2 = new MethodChaining2("Niranjan",100);
		m2.printData().printName().printNo();

	

	}
}
