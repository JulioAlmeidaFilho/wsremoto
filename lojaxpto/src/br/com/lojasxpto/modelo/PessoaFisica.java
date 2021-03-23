package br.com.lojasxpto.modelo;

public class PessoaFisica extends Cliente{

	private String cpf;
	private String rg;
	
	public String getDocumentos() {
		return cpf +","+ rg;
	}
		
	
	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", rg=" + rg + ", toString()=" + super.toString() + "]";
	}


	public PessoaFisica(String nome, String email, String cpf, String rg) {
		super(nome, email);
		this.cpf = cpf;
		this.rg = rg;
	}


	public PessoaFisica() {
		super();
	}
		
	
}
