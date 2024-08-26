package Application;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmetro: ");
		int primeiroParametro = terminal.nextInt();
		
		System.out.println("Digite o segundo parâmetro: ");
		int segundoParametro = terminal.nextInt();
		
		try {
			
			contar(primeiroParametro, segundoParametro);
	
			
		} catch( ParametrosInvalidosException e) {
			
			System.err.println("ERROR: O segundo parâmetro deve ser maior que o primeiro!");
		}
		

		
	}
	
	public static void contar( int num1, int num2) throws ParametrosInvalidosException {
		
		if( num1 > num2) {
			throw new ParametrosInvalidosException();
		}

		int contagem = num2 - num1;	
		
		for(int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + i);
		}
	}

}
