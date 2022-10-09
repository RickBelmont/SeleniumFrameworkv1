package com.study.courses;

public class study17 {

	private String boyName;
	
	public study17 (String name) {
		
		boyName=name;
	}
	public void setName(String name) {
		
		boyName = name;	
	}
	public String getName(){
		return boyName;	
	}
	public void telling() {
		System.out.printf("study17 Constructor name is %s" , getName());
	}
	
	
}
