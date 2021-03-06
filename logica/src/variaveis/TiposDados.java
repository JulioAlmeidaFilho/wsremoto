package variaveis;

public class TiposDados {

	// JAVA ? Orientada a Objeto
	// POG ? Programa??o orientada a gambiarra

	/*
	 * Tipos de Dados: Alfanum?ricos: ? um dado que N?O ser? utilizado em calculo
	 * matematico (contexto DP Ita?) CEP => 00010-009 => 00010-009 String (Javan?s)
	 * 
	 * Num?ricos: ? um dado que pode ser utilizado em um calculo matem?tico e/ou for
	 * considerado um dado critico pro sistema. (contexto Correios) CEP => 00010-009
	 * => 1 - com casas decimais: double - sem casas decimais: int
	 * 
	 * Variavel: ? um espa?o tempor?rio para armazenar um dado
	 *
	 * Sintaxe <tipo do dado> <nome da variavel> = <valor/dado>;
	 * 
	 * Exemplo: String marca = "SAMSUNG";
	 */

	// main() ? o Start Point da App

	public static void main(String[] args) {

		System.out.println("Hello World!");
		
		String nome = "Julio Almeida";
		int idade = 32;
		double altura = 1.80;
		double peso = 91.80;
		double imc = peso / (altura * altura);
		
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Altura: "+altura);
		
		System.out.printf("\nOl? %s seu IMC ? %.2f.", nome, imc);
		
		
		/* Nivel da Linguagem:
		 * Alto Nivel: mais simples para o aprendizado, pq est? mais pr?ximo da linguagem humana.
		 * Baixo Nivel: mais completo e mais pr?ximo da linguagem de m?quina.
		 * 
		 * Caracteristicas fisicas/comportamentais:
		 * - n?o ? fitness
		 * - n?o sociavel
		 * - nerd
		 * - careca / oculos
		 * Perfil: +-1995
		 * Paradigma: Estruturada (C, Cobol, Clipper, Basic...)
		 * Tempo era um problema, projetos levavam 6 meses, 1 ano...
		 * Metodologia ?gil => Paradigma orientado a objeto (POO)
		 * 
		 * Siglas do Java
		 * JDK - Java Development Kit --> Ferramenta para desenvolvedor
		 * 		JRE - Java Runtime Environment ==> Respons?vel por executar toda a aplica??o.
		 * 			JVM - Java Virtual Machine (O que faz em qualquer maquina funciona, roda aqui)
		 */
		
		

	}

}
