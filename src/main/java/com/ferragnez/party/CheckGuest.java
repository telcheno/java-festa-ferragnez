
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
		//CREO UN CILO PRE CONTOLO DEL NOME DEL OSPITE
		//con una condizionale rispondo se il ospite puo participare alla festa o pure no
					
						
			//SE "ospite trovato" è "true" 
			if(ospiteTrovato) {
				//acolgo il ospite alla festa
				System.out.println("Benvenuto alla festa " + nome);
							
			 //ALTRIMENTI 
			}else{
				//avios alla presona che non puo partecipare alla festa
				System.out.println("Ci dispiace " + nome + " non puoi partecipare alla festa");
							
			}
			
			
				

	}

}
