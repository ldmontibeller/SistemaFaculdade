package br.com.sistemafaculdade.model;

public class Diretor extends Funcionarios {

	public Diretor(String nomeCompleto, long cpf, double salario, String vinculo) {
		super(nomeCompleto, cpf, salario, vinculo);
	}

	@Override
	public double getBonificacao() {
		return 1000;
	}
	
}
