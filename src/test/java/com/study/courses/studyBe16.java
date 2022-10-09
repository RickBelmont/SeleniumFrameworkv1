package com.study.courses;

import java.util.Scanner;

public class studyBe16 {
	
	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		study16 object16 = new study16();
		
		System.out.println("Enter name here: ");
		
		String namescanned = input.nextLine();
		object16.setName(namescanned);
		object16.saying();
		
		Scanner input17 =new Scanner(System.in);
		study17 Object17 = new study17("Chess");
		
		System.out.println("Enter name study17 here: ");
		
		String namescanned17 = input17.nextLine();
		Object17.setName(namescanned17);
		Object17.telling();
		
		
	}

}
