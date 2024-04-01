package respostas;

import java.util.Scanner;
import java.util.Stack;

public class Quest5 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Escreva um programa que inverta os caracteres de um string.
		 */
		
		/*
		 *  Para o programa, com intuito de evitar usar métodos que já
		 *  resolva tudo, irei utilizar a estrutura de dados PILHA, onde irei
		 *  empilhar a string e desempilhar ficando de forma inversa
		 */
		Scanner scan = new Scanner(System.in);
	    String GREEN = "\u001B[32m";
	    String BLUE = "\u001B[34m";
	    String RESET = "\u001B[0m";
		
		Stack<Character> pilhaString = new Stack<>();
		
		System.out.println(BLUE + "\n# INVERTENDO STRING #" + RESET);
		
		int exec = 1;
		while(exec == 1) {
			
			System.out.println("-> Digite a palavra para inverter: ");
			String palavra = scan.next();
			System.out.printf(GREEN);
			
			char[] cadeiaChar = palavra.toCharArray();
			
			for(char character: cadeiaChar) {
				pilhaString.push(character);
			}
			
			while(!pilhaString.isEmpty()) {
				System.out.printf("%c", pilhaString.pop());
				Thread.sleep(200);
			}
			
			System.out.println(RESET + "\n\n-> Deseja parar? (s/n):");
			String parar = scan.next();
			System.out.println();
			 
			if(parar.equals("s")) {
				exec = 0;
				System.out.println(BLUE + "Finalizado!!!");
			}
			
		}

	}

}
