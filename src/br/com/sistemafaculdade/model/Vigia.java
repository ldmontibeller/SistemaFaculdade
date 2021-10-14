package br.com.sistemafaculdade.model;

public class Vigia implements AplicavelVT{
	@Override
	public double getValeTransporte() {
		return AplicavelVTUtil.getVALORVT();
	}
}
