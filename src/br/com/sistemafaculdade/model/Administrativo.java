package br.com.sistemafaculdade.model;

public class Administrativo extends Funcionarios implements AplicavelVT {

	public Administrativo(String nomeCompleto, long cpf, double salario, String vinculo) {
		super(nomeCompleto, cpf, salario, vinculo);
	}
	
	public double getBonificacao() {
		return getSalario() * 0.05;
	}
	
	public double getValeTransporte() {
		return getSalario() *0.06;
	}
	
}









