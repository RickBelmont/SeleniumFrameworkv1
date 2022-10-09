package com.study.courses;

import java.util.Scanner;

public class Helloworld {

	// tutorial 4
	public static void main(String[] args) {
		System.out.println("Hellow World");
		// tutorial 5
		double tuna; // declaring a variable
		tuna = 2.29; // assigning value to a variable
		System.out.print(" I want "); // printing and remain in the same line
		System.out.print(tuna); // printing the variable
		System.out.println(" for dinner"); // printing and move to the next line
		// tutorial 6
		Scanner bucky = new Scanner(System.in);// no need to name bucky function
		System.out.println(bucky.nextLine());// prints back the value of bucky
		// nextline is for String data type
		// nextDouble is for number data type
		// tutorial 7
		Scanner Calculadora = new Scanner(System.in);
		double firstnum, secondnum, resultnum; // variable with same type can be declare in the same line
		System.out.println("Enter first number ");
		firstnum = Calculadora.nextDouble();
		System.out.println("Enter second number ");
		secondnum = Calculadora.nextDouble();
		resultnum = firstnum + secondnum;
		System.out.println("sum of two numbers are " + resultnum);

		// tutorial 8 int ( Modulus % gives you the reminder number of an operations, if
		// exists )
		int girls, boys, people;
		girls = 3;
		boys = 3;
		people = girls + boys;
		System.out.println("there are " + people + " people");

		// tutorial 9 assingments and increment operators

		int fish = 5;
		int salmon = 18;

		fish += 10; // assignment operator , Sum new value and change the value of variable
		salmon++; // increment operator ++ or can use -- for sustraction

		System.out.println("now fish is " + fish);
		System.out.println("now salmon is " + salmon);

		// tutorial 10 if statement using conditions

		if (fish > salmon) {
			System.out.println("there are more fishes");
		} else {
			System.out.println("there are more salmons");
		}

		// tutorial 11 multiple test conditions using && and , || or
		if (fish > salmon && salmon > 5) {
			System.out.println("we have a lot of fishes");
		} else {
			System.out.println(" we need more fishes");
		}
		// tutorial 12 switch statement
		int golden = 10;
		switch (golden) { // use switch to see what value match the condition of variable
		case 1:
			System.out.println("fish");
			break;
		case 2:
			System.out.println("salmon");
			break;
		case 5:
			System.out.println("Switch is golden");
			break;
		default: // if cases before dont match the value
			System.out.println("no fishes found");
			break;
		}
		// tutorial 13 While loop
		while (golden < salmon) {
			System.out.println("we need more golden");
			golden++;
		}

		// tutorial 14 brings method from another class, assigning to a new variable
		study14 tutObj = new study14();
		tutObj.messagetutorial14();
		// tutorial 15 scan variable and method from another class
		Scanner input = new Scanner(System.in);
		study15 tutObj15 = new study15();

		System.out.println("Enter your name: ");
		String name = input.nextLine();

		tutObj15.message15(name);

		

		// Scanner input2 = new Scanner(System.in); //Scanner
		study16 Objtutorial16 = new study16("Shia"); // new study16 Object to access that class
		System.out.println("Enter the name here: "); // prints a message
		String temporaryvariabletut16 = input.nextLine(); // temporary variable to stock the wtitten value
		Objtutorial16.setName(temporaryvariabletut16); // set the value to the method
		Objtutorial16.saying(); // connect saying method with value written

		study16 Objexample = new study16("Sha");// object uses the constructor tutorial 17
		Objexample.saying();

		int x = 7;
		int y = 70;

		if (x > 50) {
			System.out.println(" x is ok");
		} else {
			System.out.println(" x is not valid");

			if (x < y) {// tutorial 18 Nested if else Statements
				System.out.println(" x validaton");
			} else if(x == y) {// tutorial 19 else if statement to add more than one statement
				System.out.println("y is equal than x");
			}else {
				System.out.println("y is not valid");
			}
		}
		
		System.out.println(x < 100? "under hundred" : "overload number"); //tutorial 20 Condition operator 
		//after the condition add ?  then first statement is true , " : " second statement falso
	}

}
