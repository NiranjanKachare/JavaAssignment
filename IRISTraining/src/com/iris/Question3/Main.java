package com.iris.Question3;

public class Main {
	
	public static void main(String...strings ) {
		
		Car c = CarFactory.getCar(CarVarient.Hashback);
		System.out.println(c.getType());
		
		Car c1 = CarFactory.getCar(CarVarient.Sedan);
		System.out.println(c1.getType());
		
		Car c2 = CarFactory.getCar(CarVarient.SUV);
		System.out.println(c2.getType());
		
	}
}
