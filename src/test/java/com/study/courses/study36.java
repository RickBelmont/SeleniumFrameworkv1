package com.study.courses;

public class study36 {

	private int hora;
	private int minuto;
	private int segundo;
	
	public void configTiempo(int h , int m, int s) {
		
		hora= ((h>=0 && h<=24) ? h : 0);
		minuto= ((m>=0 && m<=60) ? m : 0);
		segundo = ((s>=0 && s<=60) ? s : 0);
		
	}	
	public String formatoMilitar() {
		return String.format("%02d:%02d:%02d", hora, minuto, segundo);
		
	}
	
	public String formatoHora() {
		return String.format("%d:%02d:%02d %s", ((hora==0 || hora==12) ? 12 : hora %12),
				minuto , segundo,(hora <12 ? "AM" : "PM"));
	}
	
	//study 40Set and Get Mothods 
	public study36() {
		this (0,0,0);	
	}
	public study36(int h) {
		this (h,0,0);
	}
	public study36(int h , int m) {
		this (h,m,0);
	}
	public study36(int h, int m, int s) {
		fijarElReloj(h,m,s);
	}
	public void fijarElReloj(int h, int m, int s) {
		fijarHora(h);
		fijarMinuto(m);
		fijarSegundo(s);
	}
	public void fijarHora(int h) {
		this.hora = ((h>0 && h <24) ? h:0);
	}
	public void fijarMinuto(int m) {
		this.minuto = ((m>0 && m<60)? m : 0);
	}
	public void fijarSegundo(int s) {
		this.segundo = ((s>0 && s<60)? s : 0);
	}
	public int darHora() {
		return hora;
	}
	public int darMinuto() {
		return minuto;
	}
	public int darSegundo() {
		return segundo;
	}
	public String queHoraEs() {
		return String.format("%02d:%02d:%02d", darHora(), darMinuto(), darSegundo());
	}
}
