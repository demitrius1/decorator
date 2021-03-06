package com.decorator.item;

import com.decorator.modelo.Carro;

public class ItemArCondicionado extends Item {

	Carro carro;
	
	public ItemArCondicionado(Carro carro) {
		this.carro = carro;
	}

	public String getDescricao() {
		return carro.getDescricao() + ", Ar condicionado";
	}

	public double preco() {
		return 1500.00 + carro.preco();
	}
}