package br.com.rubinhocar.modelo;

public class Veiculo {

	//- representa private
	//+ representa public

	private String montadora;
	private float valor;
	private short velocidadeAtual;
	private boolean status;
	private short velocidadeMaxima;
	private String modelo;

	//sintaxe dos metados
	// <modificador> <tipo do retorno> <nome do metodo> (<tipo parametro><nome parametro>...){

	public void preencherMontadora(String param) {
		montadora = param.toUpperCase();
	}

	public String retornarMontadora() {
		return montadora;
	}

	public void preencherModelo(String param) {
		modelo = param;
	}

	public String retornarModelo() {
		return modelo;
	}
	
	public void preencherValor(float param) {
		valor = param;
	}

	public float retornarValor() {
		return valor;
	}

	public void preencherBasico(boolean param1, short param2) {
		status = param1;
		velocidadeMaxima = param2;
	}

	public String retornarTudo() {
		return montadora+" "+modelo+" "+ valor+" "+ status+ " "+ velocidadeMaxima;
	}
	
	public float retornarDesconto() {
		return (valor*(float)0.9);
	}
	
	public String ligar() {
		
		status = true;
		return "Carro ligado";
		
	}
	
	public String desligar() {
		
		status = false;
		velocidadeAtual = 0;
		return "Carro desligado";
		
	}
	
	public void acelerar(short param) {
		
		if (status == true) {
		
		if (velocidadeAtual  +param > velocidadeMaxima) {
			
			velocidadeAtual = velocidadeMaxima;
			
		}else {
			velocidadeAtual = (short) (velocidadeAtual + param);
		}
		}
	}
		
	public void desacelerar(short param) {
			
			if (status == true) {
			
			if (velocidadeAtual  - param <0) {
				
				velocidadeAtual = 0;
				
			}else {
				velocidadeAtual = (short) (velocidadeAtual - param);
			}
			}
			}
	
	public short retornarVelocidadeAtual() {
		
		return velocidadeAtual;
		
	}
		
	
}
