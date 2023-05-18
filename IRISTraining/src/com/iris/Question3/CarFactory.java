package com.iris.Question3;

public class CarFactory {
	
	public static Car getCar(CarVarient type) {
		
		Car car = null;
		
		switch(type) {
		
		case Hashback :
			car = new Hashback(type);
			
		case Sedan :
			car = new Sedan(type);
			
		case SUV :
			car = new SUV(type);
		
		}
		return car;
	}

}
