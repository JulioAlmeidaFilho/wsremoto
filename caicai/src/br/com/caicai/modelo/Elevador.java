package br.com.caicai.modelo;

public class Elevador {

	private String nome = "";
	private byte maximoPessoas = 0;
	private byte andarMaximo = 0;
	private byte andarMinimo = 0;
	private byte andarAtual = 0;
	private byte qtdePessoas = 0;
	
	public void inicializar(String Nome, byte MaxPessoas, byte AndarMax, byte AndarMin  ) {

		nome = Nome;
		maximoPessoas = MaxPessoas;
		andarMaximo = AndarMax;
		andarMinimo = AndarMin;
				
	}
		
	public String toString() {
		return 
				"Nome: " +nome +
				"\nMaximo de Pessoas: " +maximoPessoas +
				"\nAndar Maximo: " + andarMaximo +
				"\nAndar Minimo: " + andarMinimo +
				"\nAndar Atual: " +andarAtual +
				"\nQuantidade de Pessoas: " +qtdePessoas;
	}
	
	public void entrar (byte qtdePessoas) {
		
		//colocar o this quando for se referir ao contexto global (da classe)
		if (this.qtdePessoas + qtdePessoas <= maximoPessoas) {
		this.qtdePessoas = (byte)(this.qtdePessoas + qtdePessoas);
		}
		
	}
	
	public void sair (byte qtdePessoas) {

		if (this.qtdePessoas - qtdePessoas >= 0 ) {
		this.qtdePessoas = (byte)(this.qtdePessoas - qtdePessoas);
		}
		
	}
	
	public String subir() {

		if (andarAtual + 1 <= andarMaximo ) {
		andarAtual++;
		}
		return "Subiu para o andar: "+andarAtual;
	}
	
	public String descer() {

		if (andarAtual - 1 >= andarMinimo ) {
		andarAtual--;
		}
		return "Desceu para o andar: "+andarAtual;
	}
	
	public void entrar() {

		if (qtdePessoas + 1 <= maximoPessoas ) {
		qtdePessoas++;
		}
	}
		
	
}
