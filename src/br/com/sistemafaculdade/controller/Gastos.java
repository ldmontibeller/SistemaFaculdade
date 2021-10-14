package br.com.sistemafaculdade.controller;

import br.com.sistemafaculdade.model.*;

public class Gastos {
	static private double gastosSalario;
	static private double gastosBonificacao;
	static private double gastosVT;
	static private double gastoTotal;
	
	static public double getGastosComSalario(Funcionarios obj) {
		gastosSalario += obj.getSalario();
		return gastosSalario;
	}
	
	static public double getGastosComBonificacao(Funcionarios obj) {
		gastosBonificacao += obj.getBonificacao();
		return gastosBonificacao;
	}
	
	static public double somarGastosComVT(AplicavelVT obj) {
		gastosVT += obj.getValeTransporte();
		return gastosVT;
	}
	
	static public double somarGastos(Funcionarios obj) {
		gastoTotal = gastosSalario + gastosBonificacao + gastosVT;
		return gastoTotal;
	}
//	static public double somarGastos(Funcionarios obj) {
//		if(obj.getClass().getSimpleName().equals("Administrativo")
//			|| obj.getClass().getSimpleName().equals("Servicogeral") ) {
////			System.out.println("O PROGRAMA CHEGOU AQUI!");
//			gastoTotal += obj.getSalario() + obj.getBonificacao() + obj.getValeTransporte();
//		}
////		senão
////			fazia o controle sem o VT
//		
//		gastoTotal += obj.getSalario() + obj.getBonificacao();
//		return gastoTotal;
//	}
	
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
		gastosSalario = 0.0;
		gastosBonificacao = 0.0;
		gastosVT = 0.0;
	}
}









