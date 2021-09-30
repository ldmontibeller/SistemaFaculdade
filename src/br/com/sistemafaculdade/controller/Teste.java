package br.com.sistemafaculdade.controller;

import br.com.sistemafaculdade.model.Administrativo;
import br.com.sistemafaculdade.model.Professor;
import br.com.sistemafaculdade.model.Servicogeral;

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
		
		//Testando se cada funcionário retorna a bonificação correta
		System.out.println(f1.getBonificacao());
		System.out.println(f2.getBonificacao());
		System.out.println(f3.getBonificacao());
		
		//Testando as horas do professor
		System.out.println(f3.getHoras());
		f3.setHoras(10);
		System.out.println(f3.getSalario());
		System.out.println(f3.getBonificacao());
		
		//Imprimindo os gastos
		System.out.println(Gastos.getGastosIndividual(f3));
		
		
	}
}
