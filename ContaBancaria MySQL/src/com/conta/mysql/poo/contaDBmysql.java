package com.conta.mysql.poo;
import java.sql.*;

public class contaDBmysql {
	
	private Connection conexao = null;
	private Statement statement = null;
	private ResultSet resultSet = null;
	
	public void conectar(){
		String servidor = "jdbc:mysql://localhost:3306/banco";
		String usuario = "root";
		String senha = "1234";
		String driver = "com.mysql.jdbc.Driver";
		
		try {
			Class.forName(driver);
			this.conexao = DriverManager.getConnection(servidor,usuario,senha);
			this.statement = this.conexao.createStatement();
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	public boolean estaConectado(){
		if(this.conexao != null){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean estaLogado(int numConta, String senha){
		try {
			String query = "SELECT numConta, titular, cpf, saldo FROM conta WHERE numConta = '"+ numConta +"' AND senha = '"+ senha +"'";
			this.resultSet = this.statement.executeQuery(query);
			this.statement = this.conexao.createStatement();
			if((resultSet != null)&&(resultSet.next())){
				return true;
			}
		} catch (Exception e) {
			System.out.println("Erro:" + e.getMessage());
		}
		return false;
	}
	/* INSERÇÃO UTILIZANDO A INTERFACE "PreparedStatement" */
	public boolean inserirContaDB(int numConta, String titularConta, String cpf, String senha, double saldo){
		try{
			//String query = "INSERT INTO conta (numConta,titular,cpf,senha,saldo)"
					//+ "VALUES('" +numConta +"','" + titularConta +"','" + cpf + "','" + senha + "','" + saldo + "')";
			
			String query = " INSERT INTO conta (numConta, titular, cpf, senha, saldo) VALUES (?,?,?,?,?)";
			PreparedStatement pstmt = conexao.prepareStatement(query);
			//this.statement.executeUpdate(query);
			pstmt.setInt(1,numConta);
			pstmt.setString(2,titularConta);
			pstmt.setString(3,cpf);
			pstmt.setString(4,senha);
			pstmt.setDouble(5,saldo);
			pstmt.execute();
			pstmt.close();
			return true;
		}catch(Exception e){
			System.out.println("Erro:" + e.getMessage());
		}
		return false;
	}
	
	//public boolean depositoConta(){
		
	//}
	
	public void visualizarConta(int numConta, String senha){
		try {
			String query = "SELECT numConta, titular, cpf, saldo FROM conta WHERE numConta = '"+ numConta +"' AND senha = '"+ senha +"'";
			
			this.resultSet = this.statement.executeQuery(query);
			this.statement = this.conexao.createStatement();
			if((resultSet != null)&&(resultSet.next())){
				System.out.println("Conta: " + this.resultSet.getString("numConta"));
				System.out.println("Titular: " + this.resultSet.getString("titular"));
				System.out.println("CPF: " + this.resultSet.getString("cpf"));
				System.out.println("Saldo Disponivel: " + this.resultSet.getString("saldo"));
			}
		} catch (Exception e) {
			System.out.println("Erro:" + e.getMessage());
		}
	}
	
	public boolean atualizaConta(int numConta, double saldo){
		try {
			String query = "UPDATE conta SET saldo = '" + saldo + "' WHERE numConta = '" + numConta + "'";
			this.statement.executeUpdate(query);
			return true;
		} catch (Exception e) {
			System.out.println("Erro:" + e.getMessage());
		}
		return false;
	}
	
	public double saldoConta(int numConta){
		try {
			String query = "SELECT saldo FROM conta WHERE numConta = '"+ numConta +"'";
			this.resultSet = this.statement.executeQuery(query);
			this.statement = this.conexao.createStatement();
			if((resultSet != null)&&(resultSet.next())){
				return this.resultSet.getDouble("saldo");
			}
		} catch (Exception e) {
			System.out.println("Erro:" + e.getMessage());
		}
		return 0;
	}
	
	public void desconectar(){
		try {
			this.conexao.close();
		} catch (Exception e) {
			System.out.println("Erro:" + e.getMessage());
		}
	}
}
