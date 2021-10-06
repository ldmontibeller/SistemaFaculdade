package br.com.sistemafaculdade.model;

public abstract class Funcionarios {
	//ATRIBUTOS
		private String nomeCompleto;
		private long cpf;
		private double salario;
		private String vinculo;
		
		//CONSTRUTORES
		public Funcionarios(String nomeCompleto, long cpf, double salario, String vinculo) {
			super();
			this.nomeCompleto = nomeCompleto;
			this.cpf = cpf;
			this.salario = salario;
			this.vinculo = vinculo;
		}
		
		//METODOS
		public String getNomeCompleto() {
			return nomeCompleto;
		}
		public long getCpf() {
			return cpf;
		}
		public double getSalario() {
			return salario;
		}
		public String getVinculo() {
			return vinculo;
		}
		
		//O jeito correto de fazer polimorfismo é criar 
		//um método abstrato
		public abstract double getBonificacao();
		
}











