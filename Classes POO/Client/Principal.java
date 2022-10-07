public class Principal {

	public static void main(String[] args) {
		String nome;
		//Instanciar a classe Cliente 
		//(criando um objeto para cadastrar um novo cliente)
		Cliente cliente = new Cliente();
		
		//Colocando dados nos atributos da classe
		cliente.nome = "José da Silva";
		cliente.cpf = "123.456.789-47";
		cliente.email = "jose@gmail.com";
		cliente.telefone = "47777888998";
		cliente.dataNascimento = "10/01/1990";
		cliente.id = 1;
		
		//Instancia do segundo cliente
		Cliente cliente2 = new Cliente();
		
		cliente2.nome = "Maria da Silva";
		cliente2.cpf = "789.456.123-78";
		cliente2.email = "maria@gmail.com";
		cliente2.telefone = "7899879889";
		cliente2.dataNascimento = "20/05/1990";
		cliente2.id = 2;
		//Chamando o metodo que vai printar os dados 
		//do cliente
		cliente.ListagemCliente();
		cliente2.ListagemCliente();
		
		
		
	}

}