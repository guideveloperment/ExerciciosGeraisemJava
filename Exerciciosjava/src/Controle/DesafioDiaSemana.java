package Controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um dia da semana:");
		
		String dia = entrada.next();
		
		if("domingo".equalsIgnoreCase(dia)) {     // compara��o de strings n�o � um bom usar == e sim e.qualsignorecase
			System.out.println("1");
		}else if("segunda".equalsIgnoreCase(dia)) {
			System.out.println("2");
		}else if("ter�a".equalsIgnoreCase(dia)) {
			System.out.println("3");
		}else if("quarta".equalsIgnoreCase(dia)) {
			System.out.println("4");
		}else if("quinta".equalsIgnoreCase(dia)) {
			System.out.println("5");
		}else if("sexta".equalsIgnoreCase(dia)) {
			System.out.println("6");
		}else if("sabado".equalsIgnoreCase(dia) || "Sab�do".equalsIgnoreCase(dia)) {
			System.out.println("7");
		}else {
			System.out.println("Dia Inv�lido!");
			
			
		entrada.close();
	
		
		
	}
}
}
