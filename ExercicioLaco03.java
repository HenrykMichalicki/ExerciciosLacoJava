package br.com.generation.ExerciciosLaco;

import java.util.Scanner;

public class ExercicioLaco03 {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor da idade: ");
		idade = ler.nextInt();
				
		if (idade>=10 && idade<=14) {
			System.out.println("A idade informada pertence a categoria Infantil!");
		}
		
			else if (idade>= 15 && idade<=17) {
				System.out.println("A idade informada pertence a categoria Juvenil!");
		}
		
			else if (idade>= 18 && idade<=25) {
				System.out.println("A idade informada pertence a categoria Adulto!");
		}
		
			else {
				System.out.println("A idade informada não pertence a nenhuma categoria estabelecida como parâmetro!");
		}
		
		ler.close();
		
		
		}

	}

