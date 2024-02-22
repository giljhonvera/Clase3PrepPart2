package com.ces2.clase3.model;

public class Empleado extends Persona{
	
	public Empleado() {}

	public Empleado(String name, int aumento, String type) {
		super(name,aumento,type);
		
	}

	public String aumentarPago(){
		
		String mensaje1 = getName()+", EMPLEADO: obtiene aumento del, "+getAumento()+"%";
		
		String mensaje2 = getName()+", EMPLEADO: solicita aumento del "+getAumento()+
				"%, cancelado por exceder el "+this.TOPE_AUMENTO1+"%";

		return (getAumento() <= this.TOPE_AUMENTO1)? mensaje1: mensaje2;
	};
}
