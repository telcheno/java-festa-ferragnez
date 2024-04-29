package it.metodo.festa;

public class Controllo {
	
//*******VARIABILI DEL METODO CONTROLLO******
	//dichiaro la variabile per il controllo del ospite
	String nome;

	//dichiaro il array degli ospiti
	String[] ospiti = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", 
			"J-Ax", "Francesco Totti", "Ilary Blasi",
			"Bebe Vio", "Luis", "Pardis Zarei", 
			"Martina Maccherone", "Rachel Zeilic" }; 
	
	//variabile di controllo de gli ospiti
	Boolean ospiteInvitato = false;
	
//	creo il metodo per controlare
	String ospitiTrovato() {
		//con un ciclo for controlo se il nome del ospite e nel array
		for(int i = 0; i < ospiti.length; i++) {
					
		//asegno la iterazione alla variabile di controlo
		String ospitiCorrente = ospiti[i];

		//SE "ospite corrente" è  ugulae a "nome"
		if(ospitiCorrente.equals(nome)) {
		//"ospite trovato" asegno "true"
		ospiteInvitato = true;
		}
	}
}
