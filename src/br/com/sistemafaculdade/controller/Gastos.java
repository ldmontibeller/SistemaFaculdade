package br.com.sistemafaculdade.controller;

import br.com.sistemafaculdade.model.*;

public class Gastos {
	static private  double gastoIndividual;
	static private double gastoTotal;
	
	static public double getGastosIndividual(Funcionarios obj) {
		gastoIndividual = obj.getSalario() + obj.getBonificacao();
		return gastoIndividual;
	}
	
	static public double somarGastos(Funcionarios obj) {
//		if(obj.getClass().getSimpleName().equals("Administrativo")) {
//			
//		}
//			o obj fosse um adm ou srvc
//			fazia um tipo de controle de gastos
//		senão
//			fazia o controle sem o VT
		
		gastoTotal += obj.getSalario() + obj.getBonificacao();
		return gastoTotal;
	}
	
	//Será que dois novos métodos é a melhor saída?
	static public double somarGastosAdm(Administrativo obj) {
		gastoTotal += obj.getSalario() + obj.getBonificacao() + obj.getValeTransporte();
		return gastoTotal;
	}
	
	static public double somarGastosServicos(Servicogeral obj) {
		gastoTotal += obj.getSalario() + obj.getBonificacao() + obj.getValeTransporte();
		return gastoTotal;
	}
	
	static public void resetGastos() {
		gastoTotal = 0.0;
	}
}
