package repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {

public static void main(String[] args) {
	
int num1=0;
int num2=0;

String operacao = "";
String resp = "";

do{
	num1 = Integer.parseInt(JOptionPane.showInputDialog("Numero 1"));
	num2 = Integer.parseInt(JOptionPane.showInputDialog("Numero 2"));
	operacao = JOptionPane.showInputDialog("Operacao");
	
	if (operacao.equals("+")==true) {
		System.out.println("Resultado: "+(num1+num2));
	}else if (operacao.equals("-")==true) {
		System.out.println("Resultado: "+(num1-num2));
	}else if (operacao.equals("*")==true) {
		System.out.println("Resultado: "+(num1*num2));
	}else if (operacao.equals("/")==true) {
		System.out.println("Resultado: "+(num1/num2));
	}else {
		System.out.println("Você não digitou um operador valido");
	}
	resp = JOptionPane.showInputDialog("Digite <s> para continuar");
		
} while (resp.equals("s")==true);

}
}
