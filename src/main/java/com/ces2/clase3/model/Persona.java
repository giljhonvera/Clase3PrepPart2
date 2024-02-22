package com.ces2.clase3.model;

public abstract class Persona {

		private String name;
		private int aumento;
		private String tipo;	
		
		int TOPE_AUMENTO1 = 20;
		int TOPE_AUMENTO2 = 10;
		
		public Persona() {}
		
		public Persona(String name, int aumento, String tipo){
			this.name= name;
			this.aumento= aumento;
			this.tipo= tipo;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAumento() {
			return aumento;
		}

		public void setAumento(int aumento) {
			this.aumento = aumento;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		
		private String darUnDiaLibre() {
			return this.getName()+ ", con día libre.";
		}
		
		public abstract String aumentarPago();
		
		public String ascender() {
			String salida = "";
			salida += "Ascenso para ";
			salida += darUnDiaLibre();
			salida += aumentarPago();
			return salida;
		}
}
