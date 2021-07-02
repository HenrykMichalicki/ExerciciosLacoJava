package br.com.generation.ExerciciosLaco;

import java.util.Scanner;


public class ExercicioLaco04 {
	
	public static void main(String[] args) {
		
		int numero, resposta= 0;
		
		Scanner ler =  new Scanner(System.in);
		
		System.out.println("Digite o número: ");
		numero = ler.nextInt();
		
		numero = numero % 2;
		
		if (resposta == 0){
			System.out.println("\nO número digitado é par!");
			System.out.println("A raiz quadrada é: " + Math.sqrt(numero));
		}
		
		else {
			System.out.println("O número digitado é impar!");
			System.out.println("\nO valor do número elevado ao quadrado é :" + Math.pow(numero, 2));
		}		
		
		
	}
}



