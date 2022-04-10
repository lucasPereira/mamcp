package br.lucasPereira.mamcp.testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.lucasPereira.mamcp.Baralho;
import br.lucasPereira.mamcp.BaralhoOrdenado;
import br.lucasPereira.mamcp.ConstrutorDeCartaValor;

public class TesteBaralho {

	private ConstrutorDeCartaValor cartas;
	private Baralho baralho;

	@Before
	public void configurar() throws Exception {
		cartas = new ConstrutorDeCartaValor();
	}

	@Test
	public void baralhoOrdenado() throws Exception {
		baralho = new BaralhoOrdenado();
		assertTrue(baralho.possuiCarta());
		assertEquals(cartas.as().espadas(), baralho.darCarta());
		assertEquals(cartas.dois().espadas(), baralho.darCarta());
		assertEquals(cartas.tres().espadas(), baralho.darCarta());
		assertEquals(cartas.quatro().espadas(), baralho.darCarta());
		assertEquals(cartas.cinco().espadas(), baralho.darCarta());
		assertEquals(cartas.seis().espadas(), baralho.darCarta());
		assertEquals(cartas.sete().espadas(), baralho.darCarta());
		assertEquals(cartas.oito().espadas(), baralho.darCarta());
		assertEquals(cartas.nove().espadas(), baralho.darCarta());
		assertEquals(cartas.dez().espadas(), baralho.darCarta());
		assertEquals(cartas.valete().espadas(), baralho.darCarta());
		assertEquals(cartas.dama().espadas(), baralho.darCarta());
		assertEquals(cartas.rei().espadas(), baralho.darCarta());
		assertEquals(cartas.as().copas(), baralho.darCarta());
		assertEquals(cartas.dois().copas(), baralho.darCarta());
		assertEquals(cartas.tres().copas(), baralho.darCarta());
		assertEquals(cartas.quatro().copas(), baralho.darCarta());
		assertEquals(cartas.cinco().copas(), baralho.darCarta());
		assertEquals(cartas.seis().copas(), baralho.darCarta());
		assertEquals(cartas.sete().copas(), baralho.darCarta());
		assertEquals(cartas.oito().copas(), baralho.darCarta());
		assertEquals(cartas.nove().copas(), baralho.darCarta());
		assertEquals(cartas.dez().copas(), baralho.darCarta());
		assertEquals(cartas.valete().copas(), baralho.darCarta());
		assertEquals(cartas.dama().copas(), baralho.darCarta());
		assertEquals(cartas.rei().copas(), baralho.darCarta());
		assertEquals(cartas.as().paus(), baralho.darCarta());
		assertEquals(cartas.dois().paus(), baralho.darCarta());
		assertEquals(cartas.tres().paus(), baralho.darCarta());
		assertEquals(cartas.quatro().paus(), baralho.darCarta());
		assertEquals(cartas.cinco().paus(), baralho.darCarta());
		assertEquals(cartas.seis().paus(), baralho.darCarta());
		assertEquals(cartas.sete().paus(), baralho.darCarta());
		assertEquals(cartas.oito().paus(), baralho.darCarta());
		assertEquals(cartas.nove().paus(), baralho.darCarta());
		assertEquals(cartas.dez().paus(), baralho.darCarta());
		assertEquals(cartas.valete().paus(), baralho.darCarta());
		assertEquals(cartas.dama().paus(), baralho.darCarta());
		assertEquals(cartas.rei().paus(), baralho.darCarta());
		assertEquals(cartas.as().ouro(), baralho.darCarta());
		assertEquals(cartas.dois().ouro(), baralho.darCarta());
		assertEquals(cartas.tres().ouro(), baralho.darCarta());
		assertEquals(cartas.quatro().ouro(), baralho.darCarta());
		assertEquals(cartas.cinco().ouro(), baralho.darCarta());
		assertEquals(cartas.seis().ouro(), baralho.darCarta());
		assertEquals(cartas.sete().ouro(), baralho.darCarta());
		assertEquals(cartas.oito().ouro(), baralho.darCarta());
		assertEquals(cartas.nove().ouro(), baralho.darCarta());
		assertEquals(cartas.dez().ouro(), baralho.darCarta());
		assertEquals(cartas.valete().ouro(), baralho.darCarta());
		assertEquals(cartas.dama().ouro(), baralho.darCarta());
		assertEquals(cartas.rei().ouro(), baralho.darCarta());
		assertFalse(baralho.possuiCarta());
	}

}
