package br.lucasPereira.mamcp.testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.lucasPereira.mamcp.Carta;
import br.lucasPereira.mamcp.ConstrutorDeCartaValor;

public class TesteConstrutorDeCarta {

	private Carta asEspadas;
	private Carta asCopas;
	private Carta reiEspadas;
	private ConstrutorDeCartaValor cartas;

	@Before
	public void configurar() {
		cartas = new ConstrutorDeCartaValor();
		asEspadas = cartas.as().espadas();
		reiEspadas = cartas.rei().espadas();
		asCopas = cartas.as().copas();
	}

	@Test
	public void iguais() throws Exception {
		assertEquals(asEspadas, cartas.as().espadas());
		assertEquals(reiEspadas, cartas.rei().espadas());
		assertEquals(asCopas, cartas.as().copas());
	}

	@Test
	public void diferentes() throws Exception {
		assertNotEquals(asEspadas, reiEspadas);
		assertNotEquals(asEspadas, asCopas);
		assertNotEquals(reiEspadas, asEspadas);
		assertNotEquals(reiEspadas, asCopas);
		assertNotEquals(asCopas, asEspadas);
		assertNotEquals(asCopas, reiEspadas);
	}

	@Test
	public void valoresIguaisNaipesIguais() throws Exception {
		assertTrue(asEspadas.mesmoValor(asEspadas));
		assertTrue(asEspadas.mesmoNaipe(asEspadas));
	}

	@Test
	public void valoresDiferentesNaipesIguais() throws Exception {
		assertFalse(asEspadas.mesmoValor(reiEspadas));
		assertTrue(asEspadas.mesmoNaipe(reiEspadas));
	}

	@Test
	public void valoresIguaisNaipesDiferentes() throws Exception {
		assertTrue(asCopas.mesmoValor(asEspadas));
		assertFalse(asCopas.mesmoNaipe(asEspadas));
	}

	@Test
	public void valoresDiferentesNaipesDiferentes() throws Exception {
		assertFalse(asCopas.mesmoValor(reiEspadas));
		assertFalse(asCopas.mesmoNaipe(reiEspadas));
	}

}
