package br.com.lojasxpto.modelo;

public class Venda {

	private int notaFiscal;
	private float total;
	private Cliente cliente;
	private Produto produto;
	
	public int getNotaFiscal() {
		return notaFiscal;
	}
	public void setNotaFiscal(int notaFiscal) {
		this.notaFiscal = notaFiscal;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public Venda() {
		super();
	}
	
	public Venda(int notaFiscal, float total, Cliente cliente, Produto produto) {
		super();
		this.notaFiscal = notaFiscal;
		this.total = total;
		this.cliente = cliente;
		this.produto = produto;
	}
	
	public String getResumo() {
		
		return  "\nNota Fiscal: "+this.notaFiscal +
				"\nTotal: "+this.total +
				"\nDescri??o do produto: "+produto.getDescricao() +
				"\nSitua??o do estoque: "+ produto.verificarEstoque() +
				"\nRazao social do fabricante: "+produto.getFabricante().getRazaoSocial()+
				"\nNome do cliente: "+cliente.getNome();
								
	}
	
	@Override
	public String toString() {
		return "Venda [notaFiscal=" + notaFiscal + ", total=" + total + ", cliente=" + cliente + ", produto=" + produto
				+ "]";
	}

	
	
	
	
}
