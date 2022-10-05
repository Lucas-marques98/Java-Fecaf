import java.util.ArrayList;

import org.json.JSONObject;

public class AulaJson {

	public static void main(String[] args) {
		
		JSONObject cliente = new JSONObject();
		JSONObject cliente2 = new JSONObject();
		
		ArrayList<Object> arrayClientes= new  ArrayList<Object>();
		
		cliente.put("nome", "Jos� da Silva");
		cliente.put("email", "jose@gmail.com");
		cliente.put("telefone", "0114780-5555");
		
		cliente2.put("nome", "Maria da Silva");
		cliente2.put("email", "maria@gmail.com");
		cliente2.put("telefone", "01187774-5555");
		
		arrayClientes.add(cliente);
		arrayClientes.add(cliente2);
		
		//System.out.println(cliente);
		//System.out.println(cliente2);
		
		System.out.println(arrayClientes);

	}

}