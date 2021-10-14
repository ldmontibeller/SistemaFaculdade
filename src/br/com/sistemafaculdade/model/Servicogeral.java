package br.com.sistemafaculdade.model;

public class Servicogeral extends Funcionarios implements AplicavelVT {

	public Servicogeral(String nomeCompleto, long cpf, double salario, String vinculo) {
		super(nomeCompleto, cpf, salario, vinculo);
		// TODO Auto-generated constructor stub
	}
	//Anotação de sobreescrita
	@Override
	public double getBonificacao() {
		return super.getSalario() * 0.10;
	}
	
	public double getValeTransporte() {
		return 200;
	}
}
