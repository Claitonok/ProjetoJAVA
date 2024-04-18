package Principal;

public class Estoque {
	
	//manda para o sql
	public Estoque(String produto,Double preco) {
		this.produto = produto;
		this.preco = preco;
	}
	
	//recebe todos os objetos vindo do sql
	public Estoque(int codigo,String produto,Double preco) {
		this.codigo = codigo;
		this.produto = produto;
		this.preco = preco;
	}
	
 // Parametro que recebe tudo que veio do sql 
	public Estoque() {}


	private String produto;
	private double preco;
	private int codigo;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
}
