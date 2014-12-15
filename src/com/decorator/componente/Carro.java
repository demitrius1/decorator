package com.decorator.componente;

public abstract class Carro {

	String descricao = "Carro";

	public String getDescricao() {
		return descricao;
	}

	public abstract double preco();

}