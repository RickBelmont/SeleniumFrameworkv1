package com.study.courses;

public class study41 {

	private  int mes;
	private int dia;
	private int año;
	
	public study41 (int m, int d, int a) {
		
		mes=m;
		dia=d;
		año=a;
		
		System.out.printf("El constructor es %s\n", this);
	}
	
	//el this buscará al toString para aplicar el formato en class study37
	public String toString() {
		return String.format("%d/%d/%d", mes, dia, año);
	}
}
