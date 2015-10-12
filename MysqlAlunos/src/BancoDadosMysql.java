import java.sql.*;

public class BancoDadosMysql {
	private Connection conexao = null;
	private Statement statement = null;
	private ResultSet resultSet = null;
	
	/*METODO PARA CRIAR A CONEXÃO COM O BANCO DE DADOS*/
	public void conectar(){
		String servidor = "jdbc:mysql://localhost:3306/turma";
		String usuario = "root";
		String senha = "1234";
		String driver = "com.mysql.jdbc.Driver";
		
		try {
			Class.forName(driver);
			this.conexao = DriverManager.getConnection(servidor, usuario, senha);
			this.statement = this.conexao.createStatement();
		} catch (Exception e) {
			System.out.println("Erro:" + e.getMessage());
		}
	}
	/*METODO PARA VERIFICAR SE FOI CRIADA COM SUCESSO*/
	public boolean estaConectado(){
		if(this.conexao != null){
			return true;
		}else{
			return false;
		}
	}
	
	public void listarAlunos(){
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	/* METODO PARA INSERIR ALUNOS NO BANCO DE DADOS */
	public void inserirAluno(String nome, String sobreNome, double notaP1, double notaP2, double mediaFinal, String situacao){
		try {
			String query = "INSERT INTO Aluno(nome, sobreNome, notaP1, notaP2, mediaFinal, situacao)VALUES('"+ nome +"','"+ sobreNome +"','"+ notaP1 +"','"+ notaP2 +"','"+ mediaFinal +"','"+ situacao +"')";
			this.statement.executeUpdate(query);
		} catch (Exception e) {
			System.out.println("Erro:" + e.getMessage());
		}
	}
	
	public void atualizarAluno(){
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void deletarAluno(){
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	/* METODO PARA ENCERRAR A CONEXAO COM O BANCO DE DADOS*/
	public void desconectar(){
		try {
			this.conexao.close();
		} catch (Exception e) {
			System.out.println("Erro:" + e.getMessage());
		}
	}
}
