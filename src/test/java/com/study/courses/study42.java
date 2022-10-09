package com.study.courses;

public class study42 {

	private String nombre;
	private study41 fechaNacimiento;
	
	public study42 (String escribeNombre, study41 escribeFecha){
		
		nombre = escribeNombre;
		fechaNacimiento= escribeFecha;
	}
	
	public String toString() {
		return String.format("mi nombre es %s, " , nombre)+ String.format("mi cumple es %s", fechaNacimiento);
	}
}
