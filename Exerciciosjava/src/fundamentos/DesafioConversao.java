package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Informe o primeiro salario:");
	String valor1 = entrada.next().replace(",",".");
	
	System.out.print("\nInforme o segundo salario:");
	String valor2 = entrada.next().replace(",", ".");
	
	System.out.print("\nInforme o terceiro salario:");
	String valor3 = entrada.next().replace(",",".");
	
	double salario1 = Double.parseDouble(valor1);
	double salario2 = Double.parseDouble(valor2);
	double salario3 = Double.parseDouble(valor3);
	
	double media = (salario1 + salario2 + salario3) /3;
	System.out.println("\nA m�dia dos sal�rios � " + "R$ " +  media);
	
	
	
	
	
	entrada.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Scanner entrada = new Scanner(System.in);
	
	System.out.println("\n Digite o primeiro sal�rio:");
	String  valor1 = entrada.next().replace(",","."); // replace substitui qualquer virgula pelo ponto (, pelo .)5888
	
	System.out.println("\n Digite o segundo sal�rio:");
	String  valor2 = entrada.next().replace(",",".");
	
	System.out.println("\n Digite o terceiro sal�rio:");
	String  valor3 = entrada.next().replace(",",".");
	
	
	double salario1 = Double.parseDouble(valor1);
	double salario2 = Double.parseDouble(valor2);
	double salario3 = Double.parseDouble(valor3);
	
	double media=(salario1 + salario2 + salario3)/3;
	System.out.println("A m�dia dos sal�rios �:" + media);
	
	
	entrada.close();  // isso � para fechar o Scanner
	*/
	
	
	}
}
