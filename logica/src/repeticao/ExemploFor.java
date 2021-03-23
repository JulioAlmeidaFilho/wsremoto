package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		
		/*
		 * Sintaxe For:
		 * - contador e o valor inicial
		 * - condição
		 * - como vai ocorrer o incremento (contagem)
		 */
		
		// Exercicio tabuada até x10
		
		short tabuada = Short.parseShort(JOptionPane.showInputDialog("Digite o número que quer a tabuada!"));
		
		
		System.out.println("Tabuada do: " + tabuada);
		
		for (int contador=1; contador<11; contador++) {
			System.out.println(tabuada + "x"+ contador + "=" + (tabuada*contador));
		}
		
		
		
		
		
		
		
	}
	
	
}
