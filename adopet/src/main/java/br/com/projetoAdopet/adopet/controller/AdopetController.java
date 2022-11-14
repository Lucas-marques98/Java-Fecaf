package br.com.projetoAdopet.adopet.controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/adopet") //wendPoint
public class AdopetController {
	//Retorna lista (Método: GET)
	@GetMapping
	//cria uma referencia para um objeto do tipo JSON
	public JSONObject getListAdopet() {
		JSONObject dadosAdopet = new JSONObject();
		
		//Cria um JSON para um produto
		dadosAdopet.put("Nome", "Lucas");
		dadosAdopet.put("Email", "lucas.marques@gmail.com");
		dadosAdopet.put("Telefone", "1198674973");
		
		return dadosAdopet;
	}
}
