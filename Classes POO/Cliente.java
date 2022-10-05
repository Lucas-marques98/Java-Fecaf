//É a o inicio da criação da classe (molde)
public class Cliente {
	
	//Atributos referente a classe Cliente (caracteristicas)
	public int id;
	public String nome;
	public String cpf;
	public String email;
	public String dataNascimento;
	public String telefone;

	
	//Metodo Listar dados do cliente
	public void ListagemCliente () {
		System.out.println("##################################");
		System.out.println("Código do Cliente: " + this.id);
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Email: " + this.email);
		System.out.println("Data de Nascimento: " + this.dataNascimento);
		System.out.println("Telefone de Contato: " + this.telefone);
		System.out.println("###########");
		System.out.println("");
	}
	
	
}