package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		
		/*
		 * Sintaxe For:
		 * - contador e o valor inicial
		 * - condi��o
		 * - como vai ocorrer o incremento (contagem)
		 */
		
		// Exercicio tabuada at� x10
		
		short tabuada = Short.parseShort(JOptionPane.showInputDialog("Digite o n�mero que quer a tabuada!"));
		
		
		System.out.println("Tabuada do: " + tabuada);
		
		for (int contador=1; contador<11; contador++) {
			System.out.println(tabuada + "x"+ contador + "=" + (tabuada*contador));
		}
		
		
		
		
		
		
		
	}
	
	
}
