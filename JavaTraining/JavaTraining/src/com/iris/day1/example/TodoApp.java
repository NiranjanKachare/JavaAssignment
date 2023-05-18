package com.iris.day1.example;

import com.iris.day1.Application;

public class TodoApp extends Application{
	
//	#4. Complete the example for Compostion, Aggregation?
	
	@Override
	protected void open() {
		System.out.println("Accessed open method from TodoApp class");
	}
	
	@Override
	protected void close() {
		System.out.println("Accessed close method from TodoApp class");
	}

}
