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
	
	//creo variabile per il controllo 
	Boolean ospiteTrovato = false;
	
	//creo il metodo per il controllo  
	public void controloNome() {
		
		//uso il ciclo for per controllare il nome nel array
		for(int i = 0; i < ospiti.length; i++) {
			
			//asegno il nome del ciclo alla variabile di controllo
			String ospiteCorrente = ospiti[i];
			
		//uso una condisionale per controllo del nome nel array
			//SE ospite corrente è uguale a nome
			if(ospiteCorrente.equals(nome)) {
				
				//asegno true alla variabile di controllo
				ospiteTrovato = true;
				
			}
		}
		
	//con una condizionale rispondo se il ospite puo participare alla festa o pure no
		
		//SE "ospite trovato" è "true" 
		if(ospiteTrovato) {
			//acolgo il ospite alla festa
			System.out.println("Benvenuto alla festa \n" + nome  + "\n");
		//ALTRIMENTI
		}else {
			//avios alla presona che non puo partecipare alla festa
			System.out.println("Ci dispiace " + nome + " non puoi partecipare alla festa \n");
		}
		

	}
	
}
