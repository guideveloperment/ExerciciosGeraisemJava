package oo.heranca;

public class jogo {

	public static void main(String[] args) {
		
		jogador j1 = new jogador();
		j1.x = 10;
		j1.y = 10;
		
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.LESTE);
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.LESTE);
		
		System.out.println(j1.x);
		System.out.println(j1.y);
			
		}
	}
