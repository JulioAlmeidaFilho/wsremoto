package variaveis;

import javax.swing.JOptionPane;

public class TesteTipos {
	
	public static void main(String[] args) {
		
		/*
		 * Dados a serem capturados:
		 * Nome do Produto (notebook's)
		 * Qtde
		 * Imposto
		 * Valor
		 * No final deverá exibir:
		 * - o valor acrescido com o imposto
		 * - o valor do imposto isolado
		 * - o total com imposto
		 * - o total sem imposto
		 */
		
		String nome = 	JOptionPane.showInputDialog("Digite o nome do produto");
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto"));
		double imposto =	Double.parseDouble(JOptionPane.showInputDialog("Digite o imposto"));
		double valor =	Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"));
		
		double valorComImposto = valor *(1+imposto/100);
		double impostoIsolado = valor * (imposto/100);
		double totalComImposto = qtde * valorComImposto;
		double totalSemImposto = totalComImposto - qtde*impostoIsolado;
		
		
		
		System.out.printf("\nO produto %s tem como valor acrescido com o imposto de R$ %.2f.",nome,valorComImposto);
		System.out.printf("\nValor do imposto isolado: R$ %.2f.", impostoIsolado);
		System.out.printf("\nValor total com imposto: R$ %.2f.", totalComImposto);
		System.out.printf("\nValor total sem imposto: R$ %.2f.", totalSemImposto);
	}

}
