package br.com.enums.controller;

public enum Marcas {
	
	 VOLKSWAGEM("Volkswagen"),
	 HYUNDAI("Hyundai"),
	 SUBARU("Subaru"),
	 FIAT("Fiat"),
	 HONDA("Honda");
	 
	 
	 private String descricao;

	private Marcas(String descricao) {
		this.descricao = descricao;
	}
	 
	 public String getDescricao() {
		 
		 return descricao;
	 }

}
