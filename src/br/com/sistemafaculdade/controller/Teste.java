package br.com.sistemafaculdade.controller;

import br.com.sistemafaculdade.model.*;

public class Teste {
	public static void main(String[] args) {
		//Instanciados 3 objetos
		Administrativo f1 = new Administrativo("Tatiane Silva", 12345678950L, 1000, "adm");
		Servicogeral f2 = new Servicogeral("Jose Silva", 12345678951L, 1000, "svc");
		Professor f3 = new Professor("Leonardo Silva", 12345678952L, 0, "prf");
		
		//Testando se todas as classes tem o mesmo m?todo
		System.out.println(f1.getNomeCompleto());
		System.out.println(f2.getNomeCompleto());
		System.out.println(f3.getNomeCompleto());
		System.out.println();
		
		//Testando se cada funcion?rio retorna a bonifica??o correta
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
		
		
		//Testando diretor
		//Testando um diretor
		Diretor f4 = new Diretor("Daniela Soares", 12345678955L, 1000, "dir");
		System.out.println(f4.getBonificacao());
		System.out.println();
		
		//Posso passar v?rios funcion?rios diferentes e ir somando os gastos
		/*System.out.println(Gastos.somarGastos(f4));
		System.out.println(Gastos.somarGastos(f3));
		System.out.println(Gastos.somarGastos(f2));
		System.out.println(Gastos.somarGastos(f1));
		System.out.println();
		*/
		
		//Posso chamar a fun??o v?rias vezes e imprimir s? uma
		//Ser? que essa maneira de somar os gastos est? correta?
		Gastos.somarGastosServicos(f2);
		System.out.printf("Os gastos totais s?o: %.2f \n",Gastos.somarGastosAdm(f1));
		System.out.println();
		
		//E se quisesse s? os gastos com diretor e administrativo
		Gastos.resetGastos();
		System.out.printf("Os gastos s? do diretor e do "
				+ "adm s?o: %.2f \n",Gastos.somarGastosAdm(f1));
		System.out.println();
		
		//Testando o que a gente encontra com o m?todo getClass
		System.out.println(f1.getClass().getSimpleName().equals("Administrativo"));
		System.out.println();
		
		//Testando se o programa entra na parte de adm ou srvcos
		System.out.println();
		
		//Testando o novo m?todo com interface
		Gastos.resetGastos();
		Gastos.somarGastosComVT(f2);
		Gastos.getGastosComSalario(f2);
		Gastos.getGastosComBonificacao(f2);
		System.out.println(Gastos.somarGastos());
		System.out.println();
		
		//Testando vigia
		//Repare como vigia s? est? definido que ?
		//uma classe que ? aplic?vel o VT
		Vigia f5 = new Vigia();
		Gastos.resetGastos();
		System.out.println(Gastos.somarGastosComVT(f5));
		System.out.println(Gastos.somarGastosComVT(f2));
		
		
		
	}

}










