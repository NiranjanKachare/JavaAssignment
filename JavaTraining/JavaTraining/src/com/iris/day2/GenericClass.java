package com.iris.day2;

public class GenericClass {
	
//	#2. create an example where 
//	a) Generic class is a base class
//	b) Generic class is derived class
	
	
	public class A<Y>{
		
		public Y y;
		
		public void insert(Y i) {
			
			this.y=i;
			
		}
		
		public Y get(){
			
			return y;
			
		}
		
	}
}
