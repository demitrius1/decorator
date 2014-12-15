package com.decorator.elemento;

import com.decorator.componente.Carro;

public class ItemFreioABS extends Item {

	Carro carro;
	
	public ItemFreioABS(Carro carro) {
		this.carro = carro;
	}

	public String getDescricao() {
		return carro.getDescricao() + ", Freio ABS";
	}

	public double preco() {
		return 1800.00 + carro.preco();
	}
}