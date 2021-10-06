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
		gastoTotal += obj.getSalario() + obj.getBonificacao();
		return gastoTotal;
	}
	
	
}
