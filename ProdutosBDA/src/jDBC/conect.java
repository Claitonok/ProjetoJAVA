package jDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conect {

		public static Connection obterConexao() {
		
			Connection connect = null;
			try {
				connect = DriverManager.getConnection("jdbc:mysql://localhost/databaseprodutos?useSSL=false","root","admin");
				System.out.println("BANCO DE DADOS DO PRODUTOS FOI CONECTADA COM SUCESSO");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
				System.out.println("NÃO CONECTADO AO BANCO");
				e.printStackTrace();
		}
	
				return connect;
	}
}
