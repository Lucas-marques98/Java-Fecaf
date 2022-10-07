package ValidarEstoque;

public class Principal {

	public static void main(String[] args) {
		//Instancia da classe Produto para gerar um objeto prod1
		Produto prod1 = new Produto();
		
		prod1.id = 1;
		prod1.setNome("teclado");
		prod1.descricao = "Teclado Alfanumérico RGB - Gamer";
		prod1.valorCompra = 150;
		prod1.qtdeEstoque = 5;
		prod1.calculaValorVenda(10);
		prod1.validarEstoque();

		prod1.listagemProduto();
		
		

	}

}