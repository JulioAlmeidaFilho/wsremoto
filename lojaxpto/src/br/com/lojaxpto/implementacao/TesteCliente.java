package br.com.lojaxpto.implementacao;

import br.com.lojasxpto.modelo.Cliente;
import br.com.lojasxpto.modelo.PessoaFisica;
import br.com.lojasxpto.modelo.PessoaJuridica;

public class TesteCliente {

	public static void main(String[] args) {
		
		//Criei pela sub e instanciei pela sub
		PessoaFisica pf = new PessoaFisica();
		
		//Criei pela super e instanciei pela sub
		Cliente cli = new PessoaFisica();
		
		
		cli = new PessoaJuridica();
		// pf = new PessoaJuridica(); --> N?o d?!
		
		
	}
	
}
