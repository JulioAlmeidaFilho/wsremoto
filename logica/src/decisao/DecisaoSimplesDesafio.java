package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimplesDesafio {

	public static void main(String[] args) {
		
		/*
		 * Capturar o nome de uma pessoa e a idade
		 * E ir?o exibir mensagens de acordo com a regra
		 * 
		 * "Voto obrigat?rio" = pessoas entre 18 e 70
		 * 
		 * "Voto facultativo" = 16, 17 e acima de 70
		 * 
		 * "N?o pode votar" = menores de 16 anos
		 * 
		 */
		
		String nome = JOptionPane.showInputDialog("Digite seu nome:").toUpperCase();
		byte idade = Byte.parseByte(JOptionPane.showInputDialog("Digite sua idade:"));
		
		System.out.printf("Ol? %s, segue sua situa??o:\n", nome);
		
		if (idade<16) {
			System.out.println("Voc? n?o pode votar.");
			}
		if (idade==16 || idade==17 || idade >= 70) {
			System.out.println("Seu voto ? facultativo.");
		}
		
		if (idade > 17 && idade < 70) {
			System.out.println("Seu voto ? obrigat?rio");
		}
		
		DecisaoSimples.main(args);
		
	}
	
}
