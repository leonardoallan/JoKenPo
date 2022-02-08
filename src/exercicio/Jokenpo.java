package exercicio;

import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		
		int jogador, computador;
		Scanner teclado = new Scanner(System.in);
		System.out.println("----JoKenPô----");
		System.out.println("");
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. Tesoura");
		System.out.print("Digite sua escolha usando um número");
		System.out.println("");
		
		//lógica do jogador
		jogador = teclado.nextInt();
		switch(jogador) {
		case 1:
			System.out.println("Jogador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Jogador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Jogador escolheu TESOURA");
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}  
		
		//lógica do computador
		computador = (int)(Math.random() *3 + 1);
		teclado.close();
		switch(computador) {
		case 1:
			System.out.println("Computador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Computdor escolheu PAPEL");
			break;
		case 3:
			System.out.println("Computador escolheu TESOURA");
			break;
		
				} 
		//analisando o jogo e declarando o vencedor
		System.out.println("");
		if (jogador == computador) {
			System.out.println("EMPATOU!");
		  }	else {
				if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1) || (jogador == 3 && computador == 2)){
					System.out.println("Você VENCEU!");
				}else {
					System.out.println("Computador VENCEU!");
			}
		}
		
			
	}
		
			
}
