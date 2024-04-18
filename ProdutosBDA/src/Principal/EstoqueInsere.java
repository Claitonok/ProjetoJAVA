package Principal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jDBC.conect;


public class EstoqueInsere {
	
	public void cadastra(Estoque estoque) {
	
	Connection connect = conect.obterConexao();
	
	String sql = "INSERT INTO Produtos(produto,preco)VALUES(?,?)";

	try {
		PreparedStatement preparador = connect.prepareStatement(sql);
		preparador.setString(1, estoque.getProduto());
		preparador.setDouble(2, estoque.getPreco());
		
		preparador.execute();
		preparador.close();
		
		System.out.println("CADASTRADO COM SUCESSO");
	}catch(SQLException e){
		e.printStackTrace();
		System.out.println("DBA FORA DE ALCANSE!!");
		}
	}
	
	
	public static List<Estoque> MTodos(){
		
		List<Estoque> estoque = new ArrayList<>();
		Connection connect = conect.obterConexao();
		String sql = "SELECT * FROM Produtos";

		try {
			PreparedStatement preparador = connect.prepareStatement(sql);
			ResultSet resultado = preparador.executeQuery();
			
			while(resultado.next()) {
			Estoque esto = new Estoque();
			esto.setCodigo(resultado.getInt("codigo"));
			esto.setProduto(resultado.getString("Produto"));
			esto.setPreco(resultado.getDouble("Preco"));
			
			estoque.add(esto);
			System.out.println("MOSTRANDO TODOS");
		}
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("DBA FORA DE ALCANSE!!");
			}
		return estoque;
		}
	
	
	public void excluir(String produto) {
		
		Connection connect = conect.obterConexao();
		
		String sql = "DELETE FROM Produtos WHERE produto=?";

		try {
			PreparedStatement preparador = connect.prepareStatement(sql);
			preparador.setString(1, produto);
			
			preparador.execute();
			preparador.close();
			System.out.println("EXCLUIDO COM SUCESSO");
			
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("DBA FORA DE ALCANSE!!");
			}
		}

}
