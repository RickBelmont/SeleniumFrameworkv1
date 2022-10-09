package com.study.courses;

public class study37 {

	public static void main (String [] args) {
		
	study36 reloj = new study36();
	
	System.out.println(reloj.formatoMilitar());
	System.out.println(reloj.formatoHora());
	
	reloj.configTiempo(35, 59, 59);
	System.out.println(reloj.formatoMilitar());
	System.out.println(reloj.formatoHora());
	
	study36 relojDeArena = new study36();
	study36 relojDeArena2 = new study36(5);
	study36 relojDeArena3 = new study36(06 , 13);
	study36 relojDeArena4 = new study36(6 , 14 , 58);
	
	System.out.printf("%s\n", relojDeArena.queHoraEs());
	System.out.printf("%s\n", relojDeArena2.queHoraEs());
	System.out.printf("%s\n", relojDeArena3.queHoraEs());
	System.out.printf("%s\n", relojDeArena4.queHoraEs());
	

	//study41 imprime el constructor de study41 con el formato
	study41 fechatoString = new study41(2,29,1988);
	study42 datos = new study42("Rick" , fechatoString);
	
	System.out.println(datos);
	}
}
