package br.com.generation.ExerciciosLaco;
 
 //Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior //

import java.util.Scanner;

public class ExercicioLaco01 {
	
	public static void main(String[] args) {
	
	int numero;
	int maiorNumero=0;
	
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Digite o primeiro valor: ");
	numero = ler.nextInt();
			
	System.out.println("Digite o segundo valor: ");
	numero = ler.nextInt();
	
	System.out.println("Digite o terceiro valor: ");
	numero = ler.nextInt();
	
	if(numero > maiorNumero ) {
		maiorNumero = numero;
	}
	
	System.out.println("O valor do maior n�mero �: " + maiorNumero);
		


}
	
}

