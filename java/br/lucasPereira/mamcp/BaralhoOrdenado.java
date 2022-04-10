package br.lucasPereira.mamcp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BaralhoOrdenado implements Baralho {

	private static final Integer TAMANHO = 52;

	private Iterator<Carta> iterador;

	public BaralhoOrdenado() {
		ConstrutorDeCartaValor construtor = new ConstrutorDeCartaValor();
		List<Carta> cartas = new ArrayList<>(TAMANHO);
		cartas.add(construtor.as().espadas());
		cartas.add(construtor.dois().espadas());
		cartas.add(construtor.tres().espadas());
		cartas.add(construtor.quatro().espadas());
		cartas.add(construtor.cinco().espadas());
		cartas.add(construtor.seis().espadas());
		cartas.add(construtor.sete().espadas());
		cartas.add(construtor.oito().espadas());
		cartas.add(construtor.nove().espadas());
		cartas.add(construtor.dez().espadas());
		cartas.add(construtor.valete().espadas());
		cartas.add(construtor.dama().espadas());
		cartas.add(construtor.rei().espadas());
		cartas.add(construtor.as().copas());
		cartas.add(construtor.dois().copas());
		cartas.add(construtor.tres().copas());
		cartas.add(construtor.quatro().copas());
		cartas.add(construtor.cinco().copas());
		cartas.add(construtor.seis().copas());
		cartas.add(construtor.sete().copas());
		cartas.add(construtor.oito().copas());
		cartas.add(construtor.nove().copas());
		cartas.add(construtor.dez().copas());
		cartas.add(construtor.valete().copas());
		cartas.add(construtor.dama().copas());
		cartas.add(construtor.rei().copas());
		cartas.add(construtor.as().paus());
		cartas.add(construtor.dois().paus());
		cartas.add(construtor.tres().paus());
		cartas.add(construtor.quatro().paus());
		cartas.add(construtor.cinco().paus());
		cartas.add(construtor.seis().paus());
		cartas.add(construtor.sete().paus());
		cartas.add(construtor.oito().paus());
		cartas.add(construtor.nove().paus());
		cartas.add(construtor.dez().paus());
		cartas.add(construtor.valete().paus());
		cartas.add(construtor.dama().paus());
		cartas.add(construtor.rei().paus());
		cartas.add(construtor.as().ouro());
		cartas.add(construtor.dois().ouro());
		cartas.add(construtor.tres().ouro());
		cartas.add(construtor.quatro().ouro());
		cartas.add(construtor.cinco().ouro());
		cartas.add(construtor.seis().ouro());
		cartas.add(construtor.sete().ouro());
		cartas.add(construtor.oito().ouro());
		cartas.add(construtor.nove().ouro());
		cartas.add(construtor.dez().ouro());
		cartas.add(construtor.valete().ouro());
		cartas.add(construtor.dama().ouro());
		cartas.add(construtor.rei().ouro());
		iterador = cartas.iterator();
	}

	@Override
	public Carta darCarta() {
		return iterador.next();
	}

	@Override
	public Boolean possuiCarta() {
		return iterador.hasNext();
	}

}
