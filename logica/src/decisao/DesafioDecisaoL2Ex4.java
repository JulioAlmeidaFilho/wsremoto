package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoL2Ex4 {
	
public static void main(String[] args) {
	
/*
 * 4. Escreva um c�digo que leia tr�s valores inteiros e diferentes e mostre-os em ordem decrescente. 
 */

int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1� n�mero"));
int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2� n�mero"));
int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3� n�mero"));

// Verificando se temos n�meros iguais

if (num1==num2 || num1 == num3 || num2 == num3) {
	System.out.println("Existem valores iguais");
} else {

//Descobrindo qual � o maior
int seq1 = num3;

if (num1 > num2 && num1>num3 )	{
	seq1 = num1;
} else if (num2>num1 && num2>num3) {
	seq1 = num2;
}

//Descobrindo qual o menor
int seq3 = num3;

if (num1 < num2 && num1<num3 )	{
	seq3 = num1;
} else if (num2<num1 && num2<num3) {
	seq3 = num2;
}

//Descobrindo o do meio
int seq2 = num1+num2+num3-seq1-seq3;

//Imprimindo o resultado
System.out.printf("Os numeros em ordem descrescente s�o %d, %d e %d.", seq1,seq2,seq3);

}
}
}
