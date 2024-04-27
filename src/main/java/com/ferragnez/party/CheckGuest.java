
package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Venbenuti alla festa");
		
		//creo il array con i nomi degli ospiti
		String[] ospiti = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", 
				"J-Ax", "Francesco Totti", "Ilary Blasi",
				"Bebe Vio", "Luis", "Pardis Zarei", 
				"Martina Maccherone", "Rachel Zeilic" };
		//System.out.println(ospiti [2]);
		
		//importo il metodo scannre
		Scanner input = new Scanner(System.in);
				
		//chiedo il nome del ospite
		System.out.println("Inserisci il tuo nome!");
		
		//assegno il valore del input alla variabile da controlare
		String nome = input.nextLine();
//		System.out.println(nome);
		
		//creo una variabile di riferimento da usare nel ciclo 		
		Boolean ospiteTrovato = false; 
		//System.out.println(ospiteTrovato);
		
		//con un ciclo for controlo se il nome del ospite e nel array
		for(int i = 0; i < ospiti.length; i++) {
			
			//asegno la iterazione alla variabile di controlo
			String ospitiCorrente = ospiti[i];

			//SE "ospite corrente" è  ugulae a "nome"
			if(ospitiCorrente.equals(nome)) {
				//"ospite trovato" asegno "true"
				ospiteTrovato = true;
			}
		
		}
	//con una condizionale rispondo se il ospite puo participare alla festa o pure no
					
			//SE "ospite trovato" è "true" 
			if(ospiteTrovato) {
				//acolgo il ospite alla festa
				System.out.println("Benvenuto alla festa \n" + nome  + "\n" );
							
			 //ALTRIMENTI 
			}else{
				//avios alla presona che non puo partecipare alla festa
				System.out.println("Ci dispiace " + nome + " non puoi partecipare alla festa \n");
							
			}
			
			
			//CONFRONTO METODI .equals() .compareTo() .contains()

			System.out.println("CONFRONTO METODI .equals() .compareTo() .contains()\n");
			
			System.out.println("Variabili di confronto");
			// variabili da confrontare
			String testo1 = "casa";
			System.out.println(testo1);
			
			String testo2 = "casa";
			System.out.println(testo2);
			
			String testo3 = "cena";
			System.out.println(testo3);
			
			String testo4 = "lato";
			System.out.println(testo4);
					
			boolean tipoBoolean = true;
			System.out.println(tipoBoolean);
			
			System.out.println("");
			
//			METODO .equals();
			System.out.println("Il metodo .equals() confronta il TIPO e il VALORE contenuto del elemento \n");
			
			System.out.println(testo1.equals(testo2));//il risultato sara true
			System.out.println(testo1);
			System.out.println(testo2);
			System.out.println("Il risultato sara true perche sia il TIPO che il VALORE sono uguali\n");
			

			System.out.println(testo1.equals(testo3));//il risultato sara false
			System.out.println(testo1);
			System.out.println(testo3);
			System.out.println("Il risultato sara false perche il TIPO è uguale ma il VALORE sono DIVERSI\n");
			
			
			//METODO .compareTo();
			System.out.println("Il metodo .compareTo() confronta il VALORE in ordine:se è prima o dopo il elemento di controlo, dara 0 se è uguale -0 se è precedente o pure +0 se è sucesivo \n");

			System.out.println(testo1.compareTo(testo2));//il risultato sara 0
			System.out.println(testo1);
			System.out.println(testo2);
			System.out.println("Il risultato sara 0 perche il ordine alfabetico corispondono\n");
			
			System.out.println(testo1.compareTo(testo3));//il risultato sara -0 opure +0
			System.out.println(testo1);
			System.out.println(testo3);
			System.out.println("Il risultato sara -0 opure +0 perche l'ordine alfabetico non corrispondono \n");
			
			
			//METODO .contains()
			System.out.println("Il metodo .contains() confronta il VALORE e confronta se il VALORE è contenuto tra gli elementi\n");
			
			System.out.println(testo1.contains(testo2));//il risultato sara true
			System.out.println(testo1);
			System.out.println(testo2);
			System.out.println("Il risultato sara true perche il VALORE è contenuto nel altro \n");
			
			System.out.println(testo1.contains(testo3));//il risultato sara -0 opure +0
			System.out.println(testo1);
			System.out.println(testo3);
			System.out.println("Il risultato sara false perche il VALORE non è contenuto nel altro \n");
			
			System.out.println(testo1.contains(testo4));//il risultato sara -0 opure +0
			System.out.println(testo1);
			System.out.println(testo4);
			System.out.println("Il risultato sara false perche il VALORE non è contenuto nel altro \n");

			
	}

}
