package br.com.fecaf.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoMysql {

	//Construtor
	public ConexaoMysql() {
		
	}
	
	//Retorna a String de Conexao com o Banco de Dados MySql
	public Connection getConnection () throws ClassNotFoundException, SQLException {
		//Indica qual é o driver de conexao com o MySQL
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Estabelece as informações do BD
		Connection conexao =  DriverManager.getConnection("jdbc:mysql://localhost:3306/db_clientes?useTimezone=true&serverTimezone=UTC","root","bcd127");
		
		return conexao;
	}
}
