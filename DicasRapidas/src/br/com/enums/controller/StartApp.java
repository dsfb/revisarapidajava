package br.com.enums.controller;

public class StartApp {

	public static void main(String[] args) {

		/*
		for (Marcas marcas : Marcas.values()) {
			
			System.out.println(marcas.getDescricao());
		}*/
		
		ApresentaModelos.getModelos(Marcas.FIAT);
		
	}

}
