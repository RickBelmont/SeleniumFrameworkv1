package com.study.courses;

public class study16 {
	private String girlName; // private variable - only the methods inside this class can use it
	
	
	public void setName(String name) {// first method with parameters
		girlName = name; // whenever use setName method girlName variable will get the same value as name
		
	}
	
	public String getName() { // String - return type of the method
		return girlName; //it will return the value we set
	}
	public void saying () {  //output of the user, second method
		System.out.printf("Girl name from tut16 is %s", getName());//%s is formato de salida String
	}
	
	public int calculateComission() {
		int comisssion = 0;
		return comisssion;
		
		
	
	}
}
