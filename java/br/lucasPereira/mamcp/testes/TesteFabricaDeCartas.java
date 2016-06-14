package br.lucasPereira.mamcp.testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.lucasPereira.mamcp.Carta;
import br.lucasPereira.mamcp.ConstrutorDeCartaValor;

public class TesteFabricaDeCartas {

	private Carta asEspadas;
	private Carta asCopas;
	private Carta reiEspadas;
	private Carta damaEspadas;
	private Carta valeteEspadas;
	private Carta dezEspadas;
	private Carta noveEspadas;
	private Carta oitoEspadas;
	private Carta seteEspadas;
	private Carta seisEspadas;
	private Carta cincoEspadas;
	private Carta quatroEspadas;
	private Carta tresEspadas;
	private Carta doisEspadas;
	private ConstrutorDeCartaValor cartas;

	@Before
	public void construtor() {
		cartas = new ConstrutorDeCartaValor();
	}

	@Before
	public void cartas() {
		asEspadas = cartas.as().espadas();
		reiEspadas = cartas.rei().espadas();
		damaEspadas = cartas.dama().espadas();
		valeteEspadas = cartas.valete().espadas();
		dezEspadas = cartas.dez().espadas();
		noveEspadas = cartas.nove().espadas();
		oitoEspadas = cartas.oito().espadas();
		seteEspadas = cartas.sete().espadas();
		seisEspadas = cartas.seis().espadas();
		cincoEspadas = cartas.cinco().espadas();
		quatroEspadas = cartas.quatro().espadas();
		tresEspadas = cartas.tres().espadas();
		doisEspadas = cartas.dois().espadas();
		asCopas = cartas.as().copas();
	}

	@Test
	public void espadas() throws Exception {
		assertEquals(cartas.as().espadas(), asEspadas);
		assertEquals(cartas.rei().espadas(), reiEspadas);
		assertEquals(cartas.dama().espadas(), damaEspadas);
		assertEquals(cartas.valete().espadas(), valeteEspadas);
		assertEquals(cartas.dez().espadas(), dezEspadas);
		assertEquals(cartas.nove().espadas(), noveEspadas);
		assertEquals(cartas.oito().espadas(), oitoEspadas);
		assertEquals(cartas.sete().espadas(), seteEspadas);
		assertEquals(cartas.seis().espadas(), seisEspadas);
		assertEquals(cartas.cinco().espadas(), cincoEspadas);
		assertEquals(cartas.quatro().espadas(), quatroEspadas);
		assertEquals(cartas.tres().espadas(), tresEspadas);
		assertEquals(cartas.dois().espadas(), doisEspadas);
	}

	@Test
	public void copas() throws Exception {
		assertEquals(cartas.as().copas(), asCopas);
	}

	@Test
	public void valoresIguaisNaipesIguais() throws Exception {
		assertTrue(cartas.as().espadas().mesmoValor(asEspadas));
		assertTrue(cartas.as().espadas().mesmoNaipe(asEspadas));
	}

	@Test
	public void valoresIguaisNaipesDiferentes() throws Exception {
		assertTrue(cartas.as().espadas().mesmoValor(asCopas));
		assertFalse(cartas.as().espadas().mesmoNaipe(asCopas));
	}

}
