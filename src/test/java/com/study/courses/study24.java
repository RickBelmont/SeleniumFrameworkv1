package com.study.courses;

import java.util.Random;

public class study24 {
	
	public static void main (String [] args) {
		
		int a = 10;
		int b = 20;
		int contador;
		
		do {
			contador = a * b;
			System.out.println(contador);
			a++;
			b+=3;
		}while(contador <= 800);
			
	
	//study 27 - Array
	int array[]= {222,445,555,666};
	int suma = 0;
		System.out.println(array[2]);
	//study 28 - basic table array
		System.out.println("Index\tValor");
		
		for(int contador1 = 0; contador1<array.length; contador1++) {
			System.out.println(contador1 + "\t" + array[contador1]);
			
		}
		for(int contador2 = 0; contador2<array.length; contador2++) {
			suma+=array[contador2];
		}
		System.out.println(suma);
	
	//study 30 Array elements as counters 
	Random aleatorio = new Random();
	int frecuencia []=new int [7];
	 
	for(int roll=1; roll<100;roll++) {
		++frecuencia[1+aleatorio.nextInt(6)];
		}
		System.out.println("Dado\tresultados");
		
		for(int dado=1;dado<frecuencia.length;dado++) {
			System.out.println(dado+ "\t" + frecuencia[dado]);
		}
		
		//study31 enhanced for loop 
		int listamejorada[]={1,1,1,1,1};
		int totlistamejorada=0;
		for(int x: listamejorada) {
			totlistamejorada+=x;
		}
		System.out.println(totlistamejorada);
		
		//study32 nuevo método a la lista 
		cambioalistamejorada(listamejorada);
		
		//study32 for loop to print each item in the list applying the new method
		for (int y:listamejorada) {
			System.out.println(y);
		}
	}
	//study 32 array in Methods , nuevo método para aplicar a una lista ya creada.
	public static void cambioalistamejorada (int x[]) {
		for(int contador=0;contador<x.length;contador++) {
			x[contador]= x[contador]+5;
		}
	}
}
