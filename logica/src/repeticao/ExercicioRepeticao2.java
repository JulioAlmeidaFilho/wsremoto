package repeticao;

import javax.swing.JOptionPane;

public class ExercicioRepeticao2 {

	public static void main(String[] args) {
		/*
		 * Monte um programa que solicite a idade e o nome das pessoas. 
		A aplica??o continuar? perguntando nome e idade enquanto o usu?rio afirmar que deseja continuar.
		Ao terminar, a aplica??o dever? exibir:
		- a quantidade de pessoas maiores de idade e 
		- a m?dia entre todas as idades que foram digitadas. 
		- a pessoa mais experiente (nome e idade)
		- a pessoa mais jovem (nome e idade)
		 */

		String nome = "" ;
		short idade = 0;
		int qtdeMaiorIdade = 0;
		int somaIdades = 0;
		int qtdeTotal = 0;;
		String nomeMaiorIdade = "";
		String nomeMenorIdade = "";
		short maiorIdade = 0;
		short menorIdade = 999;
		String fim = "";
		
		do {
			nome = JOptionPane.showInputDialog("Qual o nome?");
			idade = Short.parseShort(JOptionPane.showInputDialog("Qual a idade?"));
			
			//Verifica maiores de idade
			if (idade>=18) {
				qtdeMaiorIdade = qtdeMaiorIdade +1;
			}  
			
			//Pega os componentes para m?dia
			somaIdades = somaIdades + idade;
			qtdeTotal = qtdeTotal + 1;
			
			if (idade > maiorIdade) {
				maiorIdade = idade;
				nomeMaiorIdade = nome;		
			}
			
			if (idade < menorIdade) {
				menorIdade = idade;
				nomeMenorIdade = nome;		
			}
			
			fim = JOptionPane.showInputDialog("Digite <s> para continuar.");
			
		}while (fim.contains("s")==true);
		
		System.out.println("A quantidade de pessoas maiores de idade ?: "+qtdeMaiorIdade);
		System.out.println("A m?dia entre todas as idades que foram digitadas ?: "+(somaIdades/qtdeTotal));
		System.out.printf("A pessoa mais experiente (nome e idade): %s com %d anos.", nomeMaiorIdade, maiorIdade);
		System.out.printf("\nA pessoa mais jovem (nome e idade): %s com %d anos.", nomeMenorIdade, menorIdade);
		
		
	}
		
}
