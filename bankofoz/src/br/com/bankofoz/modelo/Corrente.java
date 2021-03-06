package br.com.bankofoz.modelo;

public class Corrente extends Conta{
	
	private float limite;
	private float taxa;
	
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	public float getTaxa() {
		return taxa;
	}
	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}
	
	
	@Override
	public String toString() {
		return "Corrente [limite=" + limite + ", taxa=" + taxa + ", getNumero()="
				+ getNumero() + ", getDigito()=" + getDigito() + ", getAgencia()=" + getAgencia() + ", getSaldo()="
				+ getSaldo() + ", getCliente()=" + getCliente() + "]";
	}


	public Corrente(short numero, byte digito, short agencia, float saldo, Cliente cliente, float limite, float taxa) {
		super(numero, digito, agencia, saldo, cliente);
		this.limite = limite;
		this.taxa = taxa;
	}
	
	
	public Corrente() {
		super();
	}
	
	public boolean sacar(float valor) {
		
	if ((super.getSaldo()+this.limite)>=valor) {
		
		super.setSaldo(super.getSaldo()-valor);
		return true;		
	}else {
		return false;
	}
	}
	
	
	public void debitarTaxa() {
		super.setSaldo(super.getSaldo()-taxa);	
	}
	
	public void aumentarLimite(float perc) {
				
		this.limite = this.limite*((100+perc)/100);
		
	}
	

}
