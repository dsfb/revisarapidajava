package br.com.enums.controller;

public class ApresentaModelos {
	
	
	public static void getModelos(Marcas marcas) {
		
		
		if (marcas == Marcas.VOLKSWAGEM) {
			System.out.println("Amarok");
			System.out.println("UP");
			System.out.println("Voyage");
			
		}else if (marcas == Marcas.HYUNDAI) {
			System.out.println("HB20");
			System.out.println("I30");
			System.out.println("Tucson");
		} else if(marcas == Marcas.SUBARU){
			System.out.println("Forest");
			System.out.println("Impreza");
			System.out.println("WRX");
		}else if(marcas == Marcas.FIAT) {
			System.out.println("Argo");
			System.out.println("Stilo");
			System.out.println("Uno");
		}else if(marcas == Marcas.HONDA) {
			System.out.println("City");
			System.out.println("Civic");
			System.out.println("Fit");
		}
		
	}
	
	

}
