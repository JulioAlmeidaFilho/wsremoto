package br.com.caicai.teste;

import br.com.caicai.modelo.Elevador;

public class TesteElevador {
	
	public static void main(String[] args) {
		
		
		Elevador n1 = new Elevador();
		
		n1.inicializar("casa", (byte)8, (byte)5, (byte)0);
		
		System.out.println("\n--------------1-------------\n"+n1.toString());
		
		
		n1.entrar((byte)7);
		System.out.println("\n--------------2-------------\n"+n1.toString());
		
		n1.sair((byte)6);
		System.out.println("\n--------------3-------------\n"+n1.toString());
		
		n1.entrar((byte)100);
		System.out.println("\n--------------4-------------\n"+n1.toString());
		
		n1.sair((byte)100);
		System.out.println("\n--------------5-------------\n"+n1.toString());
		
		n1.subir();
		n1.entrar();
		System.out.println("\n--------------6-------------\n"+n1.toString());
		
		n1.descer();
		n1.descer();
		n1.descer();
		n1.descer();
		System.out.println("\n--------------7-------------\n"+n1.toString());
		
		
		for (int i = 0; i<=10; i++) {
		n1.subir();	
		}
		
		System.out.println("\n--------------8-------------\n"+n1.toString());
		
		for (int i = 0; i<=10; i++) {
			n1.entrar();	
		}
		
		System.out.println("\n--------------9-------------\n"+n1.toString());

		
	}

}
