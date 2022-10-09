package com.study.courses;

import java.util.Scanner;


public class study21 {	
	
	public static void main(String[] args) {
	
	Scanner inputQ= new Scanner(System.in);
		int performancemensual;
		double  promedio;
		int total = 0;
		int counter = 0;
		int mesnumero= 1;
						
		while (counter < 5) {
			
			System.out.println("Escribe el performance de este mes número " + mesnumero++);
			performancemensual = inputQ.nextInt();
			total = total + performancemensual;
			counter++;
		}
		
		promedio = total/5;
		System.out.println( promedio > 90 ? "Tienes buen performance " + promedio : "Tienes bajo performance " + promedio);
		
		//study23 Interes compuesto
				double Incremento;
				double aumentoPorcentaje = 0.07/365;
				
				for (int mes = 1; mes <= 12; mes++ ) {
					Incremento = promedio*Math.pow(1 + aumentoPorcentaje, mes);
					System.out.println(mes + "    " + Incremento);
				}
		//study 22
		for ( double contador = promedio ; contador <= 105 ; contador++) {
			System.out.println(contador);
		}
		
	}
}
