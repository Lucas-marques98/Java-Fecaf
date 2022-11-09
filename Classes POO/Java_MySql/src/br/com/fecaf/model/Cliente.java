package br.com.fecaf.model;

import br.com.fecaf.repository.ConexaoMysql;

public class Cliente {
	//Atributos
	private int id;
	private String nome;
	private String telefone;
	private String celular;
	private String email;
	
	//Construtor
	public Cliente () {
		
	}

	//Getters e Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//Metodos
	//Insere um novo Cliente no Banco de Dados
	public boolean setNovoCliente () {
		//instancia
		ConexaoMysql conexaoMysql = new ConexaoMysql();
		//insert
		return true;
	}
	
	//Retorna os clientes do Banco de Dados
	public void getListClientes () {
		//select
	}
}
