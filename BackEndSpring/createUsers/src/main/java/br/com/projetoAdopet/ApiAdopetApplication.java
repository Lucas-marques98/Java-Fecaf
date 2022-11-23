package br.com.projetoAdopet;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.projetoAdopet.repositories.UsuariosRepository;

@SpringBootApplication

							//CLASSE PRINCIPAL 

public class ApiAdopetApplication implements CommandLineRunner {
	//Para criar uma instancia da nossa interface Repository
	@Autowired
	private UsuariosRepository usuarioRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ApiAdopetApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//instancia os usuários diretamente com o construtor
		Usuarios u1 = new Usuarios(null, "Lucas Marques", "lucas-marques", "pet123");
		Usuarios u2 = new Usuarios(null, "Albert Einsten", "albert", "pet1234");
		Usuarios u3 = new Usuarios(null, "kaique", "kaka", "pet4434");
		
		//saveAll para salvar na base de dados... Arrays Aslist, método para salvar varios usuários de uma vez só
		usuarioRepository.saveAll(Arrays.asList(u1,u2,u3));
	}

}
