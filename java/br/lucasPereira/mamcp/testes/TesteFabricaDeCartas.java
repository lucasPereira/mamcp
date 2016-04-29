package br.lucasPereira.mamcp.testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.lucasPereira.mamcp.Carta;
import br.lucasPereira.mamcp.ConstrutorDeCartaValor;

public class TesteFabricaDeCartas {

	private ConstrutorDeCartaValor cartas;
	private Carta asEspadas;
	private Carta asCopas;

	@Before
	public void construtor() {
		cartas = new ConstrutorDeCartaValor();
	}

	@Before
	public void cartas() {
		asEspadas = cartas.as().espadas();
		asCopas = cartas.as().copas();
	}

	@Test
	public void as() throws Exception {
		assertTrue(cartas.as().espadas().mesmoValor(asEspadas));
		assertTrue(cartas.as().espadas().mesmoNaipe(asEspadas));
		assertTrue(cartas.as().espadas().mesmoValor(asCopas));
		assertFalse(cartas.as().espadas().mesmoNaipe(asCopas));
	}

}
