package br.com.lojaxpto.implementacao;

import br.com.lojasxpto.modelo.Cliente;
import br.com.lojasxpto.modelo.Fabricante;
import br.com.lojasxpto.modelo.Produto;
import br.com.lojasxpto.modelo.Venda;

public class TesteVenda {
	
	
	public static void main(String[] args) {
		
		Venda venda = new Venda(
				12345,
				(float)20.52,
				new Cliente(
						"Julio",
						"julio.fee07@gmail.com"						
						),
				new Produto(
						1,
						"Geladeira 2 portas",
						new Fabricante(
								"0006288842",
								"Brastemp",
								"11-9523377895"
								),
						2000,
						1000,
						10
						)				
				);
				
		
		System.out.println(venda.getResumo());
		
		System.out.println(venda.getProduto().totalEstoqueCompra());
		
		System.out.println(venda.getProduto().totalEstoqueVenda());

		System.out.println(venda.getProduto().verificarEstoque());
		
		
	}

}
