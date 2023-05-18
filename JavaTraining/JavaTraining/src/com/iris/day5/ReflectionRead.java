package com.iris.day5;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionRead {
	
	public void ReadClass() {
		
		try {
			
			Class c = Class.forName(Reflection.class.getName());
			
			Constructor con = c.getConstructor();
			
			Object obj = con.newInstance();
			
			Method m[] = c.getMethods();
			
			for(Method mt: m) {
				System.out.println(mt.getName());
			}
			
			Method mm = c.getMethod("met6", c);
			
			mm.invoke(1, 2);
			
		}catch(ClassNotFoundException|NoSuchMethodException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			System.out.println(e);
		}
		
		
		
		
		
		
	}

}
