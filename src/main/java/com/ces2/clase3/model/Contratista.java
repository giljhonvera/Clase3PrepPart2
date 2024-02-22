package com.ces2.clase3.model;

public class Contratista extends Persona{
	
	public Contratista() {}
	
	public Contratista(String name, int aumento, String type) {
		super(name,aumento,type);
		
	}

	public String aumentarPago(){
		
		String mensaje1 = getName()+", CONTRATISTA: obtiene aumento del, "+getAumento()+"%";
		
		String mensaje2 = getName()+", CONTRATISTA: solicita aumento del "+getAumento()+
				"%, cancelado por exceder el "+this.TOPE_AUMENTO2+"%";

		return (getAumento() <= this.TOPE_AUMENTO2)? mensaje1: mensaje2;
	};
}
