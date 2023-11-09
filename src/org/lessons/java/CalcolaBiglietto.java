package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		// AVVIO LO SCANNER SYSTEM.IN
		Scanner in = new Scanner(System.in);
		
		
		// DICHIARO LA CONSTANTE CHE DEFINISCE IL PREZZO PER CHILOMETRO
		final double priceForKm = 0.21;
		
		// DICHIARO LA CONSTANTE CHE DEFINISCE LO SCONTO PER I MINORENNI
		final int minorsDiscount  = 20;
		
		// DICHIARO LA CONSTANTE CHE DEFINISCE LO SCONTO PER GLI OVER 65
		final int over65Discount  = 40;
	
		
		
		// CHIEDO I CHILOMETRI DA PERCORRERE ALL'UTENTE
		System.out.print("Chilometri da percorrere: ");
		String strKm = in.nextLine();
		int intKm = Integer.valueOf(strKm);
		
		// CHIEDO L'ETA DEL PASSEGGERO ALL'UTENTE
		System.out.print("Età passeggero: ");
		String strAge = in.nextLine();
		int intAge = Integer.valueOf(strAge);
		
		
		in.close();
		
		
		// CALCOLO IL PREZZO TOTALE SENZA SCONTO DEL BIGLIETTO
		double totalPrice = priceForKm * intKm;
		
		
		// CONTROLLO SE L'UTENTE HA DIRITTO AD UNO SCONTO
		if (intAge < 18) {
			
			// L'UTENTE HA DIRITTO AD UNO SCONTO PER MINORENNI
			double discount = totalPrice * minorsDiscount / 100;
	
			totalPrice -= discount;
			
		} else if (intAge >= 65) {
			
			// L'UTENTE HA DIRITTO AD UNO SCONTO PER OVER 65
			double discount = totalPrice * over65Discount / 100;
	
			totalPrice -= discount;
		}
		
		
		// FORMATTO IL PREZZO FINALE
		String formattedTotalPrice = String.format("%.2f", totalPrice);
		
		if (intAge < 18) {
			
			System.out.println("Hai diritto ad uno Sconto Minorenni del " + minorsDiscount + "%!");
			
		} else if (intAge >= 65) {
			
			System.out.println("Hai diritto ad uno Sconto Over 65 del " + over65Discount + "%!");
			
		}
		
		// STAMPO ALL'UTENTE IL PREZZO FINALE FORMATTATO
		System.out.println("Prezzo totale del viaggio: " + formattedTotalPrice + "€");
	}
}
