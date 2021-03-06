package repeticao;

import javax.swing.JOptionPane;

public class ExercicioRepeticao1 {

	public static void main(String[] args) {
		/*
		 * O jogador 1 ir? digitar um n?mero, o jogador 2
		 * ter? que advinhar o n?mero digitado pelo jogador 1.
		 * Somente quando ele acertar vai dar a mensagem de "Parab?ns"
		 * 
		 * Missao1:
		 * - d? dicas ao Jogador 2, se ele est? chutando alto ou baixo.
		 * 
		 * Missao2:
		 * - acrescentar na mensagem de Parab?ns, quantas tentativas 
		 * foram utilizadas at? que o jogador 2 acertasse.
		 * Dica: vai ter que utilizar uma vari?vel pra contar.
		 */

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1: Digite o n?mero:"));
		int num2 = 0;
		
		int cont = 0;
				
		do {
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2: Qual n?mero o Jogador 1 Digitou?"));
			
			if (num1>num2) {
				System.out.println("Voc? est? chutando baixo!");
			} else if (num2>num1) {
				System.out.println("Voc? est? chutando alto!");
			}
			
			cont = cont +1;
						
		}while (num1 !=num2);
		
		System.out.printf("\nParab?ns! Voc? acertou em %d tentativas.", cont);
		
		
	}
		
}
