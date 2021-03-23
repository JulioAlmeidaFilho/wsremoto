package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	
	public static void main(String[] args) {
		
		/*
		 * Capturar
		 * - Nome da Disciplina
		 * - Nota 1
		 * - Nota 2
		 * No final exibir a média entre as duas notas
		 * Exibir parabéns somente se a média for maior ou igual a 6
		 */
		
		String nome = 	JOptionPane.showInputDialog("Nome da Disciplina").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2"));
		
		float media = (nota1 + nota2)/2;
				
		System.out.println("Sua média foi de: "+media);
		
		if (media>=6) {
		System.out.println("PARABÉNS");
		}
		
		if (media<4) {
		System.out.println("Infelizmente você foi reprovado!");
		}
		
		if (media>=4 && media<6) {
			System.out.println("Exame");
		}
		
		
		
		
		
		
		
	}
}
