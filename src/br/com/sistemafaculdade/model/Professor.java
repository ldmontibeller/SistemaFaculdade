package br.com.sistemafaculdade.model;

public class Professor extends Administrativo {
	//ATRIBUTOS
	private double horas;
	private double salarioPrf;
	
	//CONSTRUTORES
	public Professor(String nomeCompleto, long cpf, double salario, String vinculo) {
		super(nomeCompleto, cpf, salario, vinculo);
		// TODO Auto-generated constructor stub
		this.salarioPrf = salario;
	}
	
	//METODOS
	//Anotação de sobreescrita
    @Override
	public double getBonificacao() {
		return this.getSalario() * 0.20;
	}

	public double getHoras() {
		return horas;
	}
	
	public void setHoras(double horas) {
		this.horas = horas;
		//quando seto as horas do professor já atualizo seu salario
		salarioPrf = horas * 21;
	}
	
	@Override
	public double getSalario() {
		return salarioPrf;
	}
	
	
	//Uso de um setter com senha
	/*public void setHoras(double horas, Administrativo funcionario, String senha) {
		if(senha.equals(funcionario.senha)) {
			this.horas = horas;			
		}
	}*/
    
	
	
	
	
	
	
	
	
	
	
	
    
}
