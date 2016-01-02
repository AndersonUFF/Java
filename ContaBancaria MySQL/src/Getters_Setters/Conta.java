package Getters_Setters;
import java.util.*;
import com.conta.mysql.poo.*;

public class Conta {
	private Integer numConta;
	private String titularConta;
	private String cpf;
	private String senha;
	private double saldo;
	
	public Integer getNumConta() {
		return numConta;
	}
	public void setNumConta(Integer numConta) {
		if((numConta >0)&&(numConta <= 9999)){
			this.numConta = numConta;
		} else {
			System.out.println("Numero inconsistente");
		}
	}
	
	public String getTitularConta() {
		return titularConta;
	}
	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean entrar(){
		contaDBmysql database = new contaDBmysql();
		database.conectar();
		if(database.estaLogado(this.numConta,this.senha)){
			return true;
		}
		database.desconectar();
		return false; 
	}
	
	public boolean criarConta(){
		Random rd = new Random();
		this.numConta = rd.nextInt(9999);
		contaDBmysql database = new contaDBmysql();
		database.conectar();
		if(database.estaConectado()){
			if(database.inserirContaDB(numConta,titularConta,cpf,senha,0.0)){
				database.desconectar();
				return true;
			}
		}
		database.desconectar();
		return false;
	}
	
	public boolean sacar(double valor){
		contaDBmysql database = new contaDBmysql();
		database.conectar();
		if(database.estaConectado()){
			this.saldo = database.saldoConta(numConta);
			if(valor <= this.saldo){
				this.saldo -= valor;
				if(database.atualizaConta(numConta,this.saldo))
					database.desconectar();
					return true;
			}
		}
		return false;
	}
	
	public boolean depositar(double valor){
		contaDBmysql database = new contaDBmysql();
		database.conectar();
		if(database.estaConectado()){
			this.saldo = database.saldoConta(numConta);
			if(valor > 0){
				this.saldo += valor;
				if(database.atualizaConta(numConta,this.saldo))
					database.desconectar();
					return true;
			}
		}
		return false;
	}
	
	public void verSaldo(){
		
		contaDBmysql database = new contaDBmysql();
		database.conectar();
		database.visualizarConta(this.numConta,this.senha);
		database.desconectar();
	}
}
