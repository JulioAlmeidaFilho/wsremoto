package br.com.bankofoz.modelo;

public class Poupanca extends Conta{

	private float rendimento;

	
	@Override
	public String toString() {
		return "Poupanca [rendimento=" + rendimento + ", getNumero()=" + getNumero() + ", getDigito()=" + getDigito()
				+ ", getAgencia()=" + getAgencia() + ", getSaldo()=" + getSaldo() + ", getCliente()=" + getCliente()
				+ "]";
	}

	public float getRendimento() {
		return rendimento;
	}

	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
	}

	public Poupanca(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimento) {
		super(numero, digito, agencia, saldo, cliente);
		this.rendimento = rendimento;
	}

	public Poupanca() {
		super();
	}
	
	public void creditarRendimentos() {
		
		super.setSaldo(super.getSaldo()*((100+ this.rendimento)/100));
				
	}
	
	
	
	
}
