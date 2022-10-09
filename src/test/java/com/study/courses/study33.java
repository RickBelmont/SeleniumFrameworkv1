package com.study.courses;

public class study33 {

	public static void main (String[] args) {
		
		int primeraLista [][]= {{1,2,3,4},{5,6,7,8}};
		System.out.println("Primera Lista");
		tabla(primeraLista);
		
		System.out.println("Segunda Lista");
		
		for(int sumador=0; sumador<primeraLista.length; sumador++) {
			for(int sumador2=0;sumador2<primeraLista[sumador].length; sumador2++)	
			++primeraLista[sumador][sumador2];				
			}
		tabla(primeraLista);
		
		promedio(2,3,4);
		}
	//study34 table multi arrays and sum with arrays 
	public static void tabla (int x [][]) {
		for(int fila=0;fila<x.length;fila++) {
			for(int columna=0;columna<x[fila].length;columna++) {
				System.out.print(x[fila][columna] + "\t");
			}
				System.out.println();
		}
	}
	
	public static int promedio (int... cantidad) {
		int total=0;
		 
		for (int x: cantidad) 
			total+=x;
		return total/cantidad.length;
		
	}		
}
