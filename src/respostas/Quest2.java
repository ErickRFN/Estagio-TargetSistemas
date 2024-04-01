package respostas;

import java.util.Scanner;

public class Quest2 {
	
	public static boolean fibonacci(int procurado, int anteAnterior, int anterior) {
		if(anterior == procurado) {
			return true;
		}else if(anterior > procurado) {
			return false;
		}else {
			int atual = anteAnterior + anterior;
			anteAnterior = anterior;
			anterior = atual;
			return fibonacci(procurado, anteAnterior, anterior);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor
		 * sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5,
		 * 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, 
		 * informado um número, ele calcule a sequência de Fibonacci e retorne uma 
		 * mensagem avisando se o número informado pertence ou não a sequência.
		 */
		Scanner scan = new Scanner(System.in);
		String RED = "\u001B[31m";
	    String GREEN = "\u001B[32m";
	    String BLUE = "\u001B[34m";
	    String RESET = "\u001B[0m";
		
	    System.out.println(BLUE + "\n# VERIFICIAR SE NÚMERO ESTÁ NA SEQUÊNCIA FIBONACCI #" + RESET);
	    
		int exec = 1;
		while(exec == 1) {
		
			 int num;
			 
			 System.out.println("\n-> Digite um número para verificar: ");
			 num = scan.nextInt();
			 
			 Thread.sleep(500);
			 System.out.printf(".");
			 Thread.sleep(500);
			 System.out.printf(".");
			 Thread.sleep(500);
			 System.out.printf(".\n");
			 
			 boolean resposta;
			 if(num == 0) {
				 resposta = true;
			 }else {
				 resposta = fibonacci(num, 0, 1);
			 }
			 
			 if(resposta) {
				 System.out.printf(GREEN + "o número %d está na sequêmcia Fibonacci" + RESET, num);
			 }else {
				 System.out.printf(RED + "o número %d não está na sequêmcia Fibonacci" + RESET, num);
			 }
			 
			 System.out.println("\n\n-> Deseja parar? (s/n):");
			 String parar = scan.next();
			 System.out.println();
			 
			 if(parar.equals("s")) {
				 exec = 0;
				 System.out.println(BLUE + "Finalizado!!!");
			 }
			 
			 
		} 
	}

}
