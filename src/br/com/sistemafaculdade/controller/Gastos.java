package br.com.sistemafaculdade.controller;

import br.com.sistemafaculdade.model.*;

public class Gastos {
	 static double gastoIndividual;
	
	static double getGastosIndividual(Administrativo funcionario) {
		gastoIndividual = funcionario.getSalario() + funcionario.getBonificacao();
		return gastoIndividual;
	}
	
}
