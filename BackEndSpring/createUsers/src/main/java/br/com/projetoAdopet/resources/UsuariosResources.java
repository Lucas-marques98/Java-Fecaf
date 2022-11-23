package br.com.projetoAdopet.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.projetoAdopet.Usuarios;
import br.com.projetoAdopet.services.UsuariosServices;

			//CLASS DA API

				//Recebe os dados do Front End

//informa para o Spring que esse é um controlador REST
@RestController
@RequestMapping(value = "/usuarios" ) //Adiciona um EntryPoint 
public class UsuariosResources {
	@Autowired
	private UsuariosServices service;
	
	@GetMapping(value = "/{id}") //Busca um usuário pelo seu id
	public ResponseEntity<Usuarios> findById(@PathVariable Integer id ){
		Usuarios obj = this.service.findById(id);
		return ResponseEntity.ok().body(obj);//retorna um ok que fizemos a busca e no corpo retornamos o objeto
	}
	
	//Lista todos os usuários da nossa base de dados
	@GetMapping
	public ResponseEntity<List<Usuarios>> findAll(){
		List<Usuarios> list = service.findAll();
		return ResponseEntity.ok().body(list);//ok ele fez a busca, e no corpo passamos a list
	}
	//Método que faz update (Atualiza os usuários)
	@PutMapping(value = "/{id}")
	public ResponseEntity<Usuarios> update(@PathVariable Integer id, @RequestBody Usuarios obj){
		Usuarios newObj = service.update(id,obj);
		return ResponseEntity.ok().body(newObj);
		
	}
	
	//Método que cria um usuário
	@PostMapping
	public ResponseEntity<Usuarios> create(@RequestBody Usuarios obj){
		Usuarios newObj = service.create(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	//Método que deleta um usuário
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		service.delete(id);
		return ResponseEntity.noContent().build();//no content sem conteúdo
	}
}
