package br.com.bankofoz.implementacao;

import br.com.bankofoz.modelo.Cliente;
import br.com.bankofoz.modelo.Conta;
import br.com.bankofoz.modelo.Corrente;
import br.com.bankofoz.modelo.Help;
import br.com.bankofoz.modelo.Poupanca;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		if ( Help.s("Digite <CC> para conta corrente e <CP> para conta poupan?a").equals("CC")) {
		
		conta = new Corrente(
				(short)24568,
				(byte)5,
				(short)7896,
				(float)10000,
				new Cliente(
						1,
						"Julio",
						"381175681-60",
						"1578921535"
						),
				(float)5000,
				(float)10
				);
			
		} else {
			
		conta = new Poupanca(
				(short)1234,
				(byte)9,
				(short)9874,
				(float)100000,
				new Cliente(
						2,
						"Jo?o",
						"12383215748",
						"1123581321"					
						),
				(float)10			
				);
		}
			
		System.out.println(conta.toString());
		
		conta.debitarTaxa();
		
		System.out.println(conta.toString());
		
		conta.aumentarLimite(50);
		
		System.out.println(conta.toString());
		
		System.out.println(conta.sacar(15000));
		
		System.out.println(conta.toString());
		
		System.out.println(conta.sacar(15000));
		
		System.out.println(conta.toString());
		
		conta.creditarRendimentos();
		
		System.out.println(conta.toString());
		
		
	}
}
