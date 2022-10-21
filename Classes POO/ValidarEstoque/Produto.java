public class Produto {
	//Atributos da classe
	public int id;
	private String nome;
	public String descricao;
	public int qtdeEstoque;
	public double valorCompra;
	private double valorVenda;
	private String statusProduto;
	
	//Metodos
	
	//set - significa guardar
	//get - significa pegar

// 	Como usar o GET E o set?
// Usamos get para obter informações. Esse tipo de método sempre retorna um valor. Usamos set para definir valores. Esse tipo de método geralmente não retorna valores.
	
	//set Nome
	public void setNome (String nome) {
		this.nome = nome.toUpperCase();
	}
	
	//get Nome
	public String getNome () {
		return this.nome;
	}
	
	
	
	public void calculaValorVenda (float percentual)

	{
		double valorVenda;
		
		valorVenda = this.valorCompra + ((this.valorCompra * percentual)/100);
		this.valorVenda = valorVenda;
	}
	
	
	public void listagemProduto ()
	{
		System.out.println("Id do produto: " + this.id);
		System.out.println("Nome do produto: " + this.getNome());
		System.out.println("Descrição do produto: " + this.descricao);
		System.out.println("Valor de compra: " + this.valorCompra);
		System.out.println("Qtde do estoque: " + this.qtdeEstoque);
		System.out.println("Status do Produto: " + this.statusProduto);
		System.out.println("Valor da Venda: " + this.valorVenda);
	}


	public void validarEstoque () {
		
		if(this.qtdeEstoque <= 8 )
			this.statusProduto = "Nivel Crítico";
		else if(this.qtdeEstoque <= 12)
			this.statusProduto = "Nivel Baixo";
		else
			this.statusProduto = "Nivel Normal";
	}
}