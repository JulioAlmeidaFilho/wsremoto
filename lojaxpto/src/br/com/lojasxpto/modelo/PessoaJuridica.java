package br.com.lojasxpto.modelo;

public class PessoaJuridica extends Cliente{

	private String cnpj;
	private String contato;
	private String ie;
	
	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", contato=" + contato + ", ie=" + ie + "," + super.toString() + "]";
	}

	
	public PessoaJuridica(String nome, String email, String cnpj, String contato, String ie) {
		super(nome, email);
		this.cnpj = cnpj;
		this.contato = contato;
		this.ie = ie;
	}


	public PessoaJuridica() {
		super();
	}
	
	
	
}
