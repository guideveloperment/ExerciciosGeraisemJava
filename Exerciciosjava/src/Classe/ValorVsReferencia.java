package Classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; //atribui��o por valor (Tipo primitivo)
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data (1, 6, 2020);
		Data d2 = d1; // atribui��o por refer�ncia (Objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		
		d1.ano = 2025;// as duas variaveis apontam para o mesmo objeto
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
	}

}