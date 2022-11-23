package br.com.projetoAdopet;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
//o indentificador de versão de serialização de uma classe.
public class Usuarios implements Serializable {

	// pega uma instancia da nossa classe que podera ser trafegadas em redes e
	// armazenadas.
	private static final long serialVersionUID = 1L;
	
	//informamos que esse id vai ser uma chave primária
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	//Serve para informar ao usuário que não pode ser vázio e deve conter um valor min e max de caracteres.
	@NotEmpty(message = ("Campo Nome não pode ser vázio."))
	@Length(min = 3, max = 100, message = ("O nome deve ter entre 3 a 100 carácteres"))
	private String nome;
	
	@NotEmpty(message = ("Campo Login não pode ser vázio"))
	@Length(min = 4, max = 15, message = ("O nome deve ter entre 4 a 15 carácteres"))
	private String login;
	
	@NotEmpty(message = ("Campo Senha não pode ser vázio"))
	@Length(min = 4, max = 32, message = ("A senha deve ter entre 4 a 32carácteres"))
	private String senha;

	public Usuarios() {
		super();
	}

	public Usuarios(Integer id, String nome, String login, String senha) {
		super();
		Id = id;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuarios other = (Usuarios) obj;
		return Objects.equals(Id, other.Id);
		
//A comparação de objetos é feita através do resultado do método equals() . 
//A implementação correta do hashCode() é aquela que sempre retorna o mesmo valor 
//quando chamado para um mesmo objeto, de acordo com o contrato do hashCode().	

	}

	
}
