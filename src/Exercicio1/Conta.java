package Exercicio1;

import java.util.Calendar;


public class Conta {

	String type; //recebe tipo de conta
	String nome; //nome do titular
	Calendar data; //data criação da conta
	Double saldo;
	
	String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
}
