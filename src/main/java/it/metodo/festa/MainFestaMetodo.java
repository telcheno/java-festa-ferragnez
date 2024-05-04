package it.metodo.festa;

import java.util.Scanner;

public class MainFestaMetodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Benveniti alla festa!");
		
		//importo il metodo scanner
		Scanner input = new Scanner(System.in);
		
		//stansio il costruttore per il controllo
		Controllo controllo = new Controllo();
		
		//chiedo al utente il nome da controllare
		System.out.println("Inserisci il tuop nome!");
		
		//asegno il nome del utente alla variabile del costrutore
		controllo.nome = input.nextLine();
//		System.out.println(controllo.nome);
//		System.out.println(controllo.ospiti);
		
		//inboco il metodo che controlla il utente
		controllo.controloNome();
		
		
		
	}

}
