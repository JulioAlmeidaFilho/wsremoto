package br.com.rubinhocar.teste;

import br.com.rubinhocar.modelo.Veiculo;

public class TesteVeiculo {

	
	public static void main(String[] args) {
		
		//Instanciando um objeto
		Veiculo carro = new Veiculo();
		
	
		carro.preencherMontadora("fiat");
		carro.preencherModelo("uno");
		carro.preencherValor(20000);
		carro.preencherBasico(true,(short)150);
		
		
		
		System.out.println(carro.retornarMontadora());
		System.out.println(carro.retornarModelo());
		System.out.println(carro.retornarValor());
		System.out.println(carro.retornarTudo());
		System.out.println(carro.retornarDesconto());
		
		carro.desligar();
		carro.ligar();
		
		carro.acelerar((short)200);
		System.out.println(carro.retornarVelocidadeAtual());
		
		carro.desacelerar((short)40);
		System.out.println(carro.retornarVelocidadeAtual());
		
		carro.desacelerar((short)170);
		System.out.println(carro.retornarVelocidadeAtual());
		
		
		
		
	}
	
	
}
