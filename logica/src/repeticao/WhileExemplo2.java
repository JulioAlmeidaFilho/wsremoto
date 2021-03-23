package repeticao;

import javax.swing.JOptionPane;

public class WhileExemplo2 {
	
	public static void main(String[] args) {
	
		/*
		 * Peça o nome da pessoa e exiba no final.
		 * Garanta que o nome tenha mais que 3 caracteres e menos que 15 caracteres
		 */
			
	String nome = JOptionPane.showInputDialog("Digite o nome").toLowerCase();
	
	while (nome.length()<=3 || nome.length()>=15) {
		nome = JOptionPane.showInputDialog("O nome precisa ter mais que 3 caracteres e menos que 15. Digite novamente.").toLowerCase();
	}
	
	System.out.println("Nome: "+ nome);
			
	}

}
