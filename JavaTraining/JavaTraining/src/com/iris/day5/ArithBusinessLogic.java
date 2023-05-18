package com.iris.day5;

public class ArithBusinessLogic {
	
//	In junit_mockito_eg1 example provide, please add div() method in Business logic, 
//	add appropriate Test Case, mocking fucntionality, accordingly?
	
	    private int a, b;
	    private IArithService ias;

	    public void setIAService(IArithService ias)
	    {
	        this.ias = ias;
	    }

	   public  int add(int a, int b)
	    {
	        return ias.iadd(a,b);
	    }
	    
	    public int div(int a, int b) 
	    {
	    	return ias.idiv(a, b);
	    }
	    

	    public int sub(int a, int b)
	    {
	        return ias.isub(a, b);
	    }

	    public int mul(int a, int b)
	    {
	        return ias.imul(a, b);
	    }	
}
