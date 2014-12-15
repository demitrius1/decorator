package com.decorator.app;

import com.decorator.elemento.ItemArCondicionado;
import com.decorator.elemento.ItemFreioABS;
import com.decorator.modelo.Carro;
import com.decorator.modelo.ModeloBasico;
import com.decorator.modelo.ModeloCompleto;

public class Concessionaria {

	public static void main(String[] args) {
		
		Carro carro1 = new ModeloCompleto();
		System.out.println(carro1.getDescricao() + " R$ " + carro1.preco() + "\n");
		
		Carro carro2 = new ModeloBasico();
		carro2 = new ItemArCondicionado(carro2);
		carro2 = new ItemFreioABS(carro2);
		System.out.println(carro2.getDescricao() + " R$ " + carro2.preco());
	}

}