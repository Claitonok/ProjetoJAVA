package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public static Connection obterConexao() {
		
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/databasealunos?useSSL=false","root","admin");
		System.out.println("BANCO DE DADOS FOI CONECTADA COM SUCESSO");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("NÃO CONECTADO AO BANCO");
			e.printStackTrace();
		}
	
		return con;
	}
}
