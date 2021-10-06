package br.com.sistemafaculdade.controller;

import br.com.sistemafaculdade.model.*;


public class Teste {
	public static void main(String[] args) {
		//Instanciados 3 objetos
		Administrativo f1 = new Administrativo("Tatiane Silva", 12345678950L, 1000, "adm");
		Servicogeral f2 = new Servicogeral("Jose Silva", 12345678951L, 1000, "svc");
		Professor f3 = new Professor("Leonardo Silva", 12345678952L, 0, "prf");
		
		//Testando se todas as classes tem o mesmo método
		System.out.println(f1.getNomeCompleto());
		System.out.println(f2.getNomeCompleto());
		System.out.println(f3.getNomeCompleto());
		System.out.println();
		
		//Testando se cada funcionário retorna a bonificação correta
		System.out.println(f1.getBonificacao());
		System.out.println(f2.getBonificacao());
		System.out.println(f3.getBonificacao());
		System.out.println();
		
		//Testando as horas do professor
		System.out.println(f3.getHoras());
		f3.setHoras(10);
		System.out.println(f3.getSalario());
		System.out.println(f3.getBonificacao());
		System.out.println();
		
		//Imprimindo os gastos
		System.out.println(Gastos.getGastosIndividual(f3));
		
		//Testando diretor
		//Testando um diretor
		Diretor f4 = new Diretor("Daniela Soares", 12345678955L, 10000, "dir");
		System.out.println(f4.getBonificacao());
		System.out.println();
		
		//Testar a classe gastos
		System.out.println(Gastos.getGastosIndividual(f4));
		System.out.println();
		
		//Posso passar vários funcionários diferentes e ir somando os gastos
		/*System.out.println(Gastos.somarGastos(f4));
		System.out.println(Gastos.somarGastos(f3));
		System.out.println(Gastos.somarGastos(f2));
		System.out.println(Gastos.somarGastos(f1));
		System.out.println();
		*/
		
		//Posso chamar a função várias vezes e imprimir só uma
		Gastos.somarGastos(f4);
		Gastos.somarGastos(f3);
		Gastos.somarGastos(f2);
		System.out.printf("Os gastos totais são: %.2f \n",Gastos.somarGastos(f1));
		System.out.println();
		
		//E se quisesse só os gastos com diretor e administrativo
		Gastos.somarGastos(f4);
		System.out.printf("Os gastos só do diretor e do "
				+ "adm são: %.2f \n",Gastos.somarGastos(f2));
	}
	
	
	
	
	
	
	
	
	
}










