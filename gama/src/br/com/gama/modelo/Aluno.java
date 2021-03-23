package br.com.gama.modelo;

public class Aluno {

	private String nome;
	private int matricula;
	private String email;
	private String fone;
	private Endereco endereco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
			
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", email=" + email + ", fone=" + fone
				+ ", endereco=" + endereco + "]";
	}
	
	
	public void setAll(Endereco endereco, String nome, int matricula, String email, String fone) {
		this.endereco = endereco;
		this.nome = nome;
		this.matricula = matricula;
		this.email = email;
		this.fone = fone;
				
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String getUsuario() {
		
		return email.substring(0,email.indexOf("@"));		
		
	}
	
	//construtor
	public Aluno() {
		this.nome="Não Preenchido";
	}
	
	
	
}
