package br.com.gama.modelo;

public class Professor {

	
	private String nome;
	private String formacao;
	private String area;
	private Endereco endereco;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", formacao=" + formacao + ", area=" + area + ", endereco=" + endereco + "]";
	}
	
	public String getResumo() {
		
		return "\nNome: " + nome + "\nFormação: " + formacao + "\nBairro" + endereco.getBairro();
					
	}
	
}
