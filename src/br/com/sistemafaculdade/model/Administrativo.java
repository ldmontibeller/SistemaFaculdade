package br.com.sistemafaculdade.model;

public class Administrativo extends Funcionarios {

	public Administrativo(String nomeCompleto, long cpf, double salario, String vinculo) {
		super(nomeCompleto, cpf, salario, vinculo);
		// TODO Auto-generated constructor stub
	}
	
	public double getBonificacao() {
		return getSalario() * 0.05;
	}
	
	
}









