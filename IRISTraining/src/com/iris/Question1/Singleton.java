package com.iris.Question1;

public class Singleton {
	
	private volatile Singleton[] queue= new Singleton[3];
	private int i=0;
	
	private Singleton() {}
	
	public Singleton getInstance() {
		
		if(i==3) {
			i=0;
		}
			
		if(queue[i]==null) {
				
			synchronized(Singleton.class) {
					
				if(queue[i]==null) {
					queue[i]=new Singleton();
				}
			}
		}
			
		return queue[i++];
	}
}
