package br.com.rapida;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatadaData {

	public static void main(String[] args) {

		
		LocalDate data = LocalDate.now();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Data sem formata��o: " + data);
		
		System.out.println("--------------------");
		
		
		System.out.println("Data com formata��o: " + data.format(dtf));
	}

}
