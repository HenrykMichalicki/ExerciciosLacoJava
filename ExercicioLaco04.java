package br.com.generation.ExerciciosLaco;

import java.util.Scanner;


public class ExercicioLaco04 {
	
	public static void main(String[] args) {
		
		int numero, resposta= 0;
		
		Scanner ler =  new Scanner(System.in);
		
		System.out.println("Digite o n�mero: ");
		numero = ler.nextInt();
		
		numero = numero % 2;
		
		if (resposta == 0){
			System.out.println("\nO n�mero digitado � par!");
			System.out.println("A raiz quadrada �: " + Math.sqrt(numero));
		}
		
		else {
			System.out.println("O n�mero digitado � impar!");
			System.out.println("\nO valor do n�mero elevado ao quadrado � :" + Math.pow(numero, 2));
		}		
		
		
	}
}



