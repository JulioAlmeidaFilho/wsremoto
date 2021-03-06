package variaveis;

import javax.swing.JOptionPane;

//swing em JAVA classes necess?rias para Telas JAVA Nativas

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		/*
		 * Regras para identificadores (nomes de variavel, classe...):
		 * 1? N?o usar?s palavras reservadas da linguagem
		 * 2? N?o come?aras com n?meros.
		 * 3? N?o utilizar?s caracteres especiais (@,#,*...)
		 * 
		 * Padr?es para identificadores:
		 * 1? Use nomes significativos
		 * 2? Use o padr?o CamelCase
		 * Exemplo: data_nascimento, dataNascimento
		 * 3? Variaveis/m?todos come?am com letra minuscula
		 * 4? Classes come?am com letra maiscula
		 * Exemplo:
		 * xpto() => ? um m?todo
		 * xpto => ? uma vari?vel
		 * Xpto => ? uma classe
		 */
		
		
		String time1 = 	JOptionPane.showInputDialog("Digite o time 1");
		String time2 = 	JOptionPane.showInputDialog("Digite o time 2");
		double entrada=	Double.parseDouble(JOptionPane.showInputDialog("Digite a entrada"));
		int publico = Integer.parseInt(JOptionPane.showInputDialog("Digite o publico"));
		double total = entrada * publico;
		
		/*Classes Wrappers: s?o classes que apoiam os tipos primitivos
		int => Integer
		double => Double
		
		Tipos primitivos:
		boolean => True/false (perguntas l?gicas) - trabalha? gr?vida?
		char => armazena somente UM caracter. Sempre entre apostrogos 'a'.
		==========================
		byte 	=> -127/+128
		short 	=> -32k / +32k
		int		=> -9trilhoes / +9 trilhoes
		long	=> quintilhoes
		float	=> com pouca precis?o nas casas decimais (5 casas)
		double	=> dobro de precis?o que o float nas casas decimais
				
		*/
	
		System.out.printf("No jogo entre %s x %s, a arrecada??o foi de: R$ %.2f.",time1,time2,total);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
