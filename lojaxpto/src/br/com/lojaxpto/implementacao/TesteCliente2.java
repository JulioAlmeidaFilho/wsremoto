package br.com.lojaxpto.implementacao;

import javax.swing.JOptionPane;

import br.com.lojasxpto.modelo.Cliente;
import br.com.lojasxpto.modelo.PessoaFisica;
import br.com.lojasxpto.modelo.PessoaJuridica;

public class TesteCliente2 {

	public static void main(String[] args) {
		
	Cliente cliente = new Cliente();
	
	if (JOptionPane.showInputDialog("Digite <F> para fisica ou <J> para juridica").toUpperCase().equals("F")) {
		
		cliente = new PessoaFisica(
				"Nome PF",
				"email@pf.com.br",
				"123456",
				"13248939-x");	
	} else {
		
		cliente = new PessoaJuridica(
				"Nome PJ",
				"email@pj.com.br",
				"267542",
				"Contato",
				"8278976"			
				);
		
	}
	
	System.out.println(cliente.toString());
	
	System.out.println(cliente.getDocumentos());
	
	
	
	
	
	
	}
}
