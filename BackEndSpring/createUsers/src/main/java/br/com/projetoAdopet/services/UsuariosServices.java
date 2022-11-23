package br.com.projetoAdopet.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoAdopet.Usuarios;
import br.com.projetoAdopet.repositories.UsuariosRepository;
import br.com.projetoAdopet.services.exceptions.ObjectNotFoundException;

//informa ao spring que essa é uma classe de serviços da API
@Service
public class UsuariosServices {

	@Autowired

	private UsuariosRepository repository;// instanciando um usuário repository

	// retorna um usuario e recebe um obj do tipo integer
	public Usuarios findById(Integer id) {
		Optional<Usuarios> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Usuarios.class.getName()));
	}

	// Método que lista todos os usuários
	public List<Usuarios> findAll() {
		return repository.findAll();
	} // ele indentifica que é uma lista de usuários e vai fazer uma busca de todos
		// usuários e vai retornar essa lista de usuários pra nossa camada de recursos.

	public Usuarios update(Integer id, Usuarios obj) {
		Usuarios newObj = findById(id);
		newObj.setNome(obj.getNome());//vai atualizar o nome do usuário na nossa base de dados
		newObj.setLogin(obj.getLogin());//vai atualizar o login do usuário na nossa base de dados
		newObj.setSenha(obj.getSenha());//vai atualizar a senha do usuário da nossa base de dados
		return repository.save(newObj);//quando ele for salvar vai entender que é apenas uma atualização
	}

	public Usuarios create(Usuarios obj) {
		obj.setId(null);//já atribui um novo id no usuário
		return repository.save(obj);
	}

	public void delete(Integer id) {
		findById(id);//faz uma busca pra ver se o usuário existe ou não
		repository.deleteById(id);	
	}


}
