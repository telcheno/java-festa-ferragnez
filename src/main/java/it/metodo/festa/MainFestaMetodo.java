package it.metodo.festa;

import java.util.Scanner;

public class MainFestaMetodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Benveniti alla festa!");
		
		//importo il metodo scanner
		Scanner input = new Scanner(System.in);
		
		Controllo controllo = new Controllo();
		
		System.out.println("Inserisci il tuop nome!");
//		String nome = input.next()
		
		controllo.nome = input.nextLine();
		System.out.println(controllo.nome);
//		controllo.ospiti = input.nextLine();
		System.out.println(controllo.ospiti);
		System.out.println(controllo.ospiteInvitato);

	}

}
