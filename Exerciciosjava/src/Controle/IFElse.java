package Controle;

import javax.swing.JOptionPane;

public class IFElse {
public static void main(String[] args) {
	
	String valor = JOptionPane.showInputDialog("Informe o n�mero");
	int numero = Integer.parseInt(valor);
	
	//if(numero % 2 == 0) {
		///System.out.println("N�mero Par!");
	//}
	
	//if(numero % 2 == 1) {
		//System.out.println("N�mero Impar!");
	//}
	
	if(numero % 2 == 0) {
		System.out.println("N�mero Par!");
	}else 
		System.out.println("N�mero Impar!");
	
	 }

      }


