package br.lucasPereira.mamcp.testes;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Test;

import br.lucasPereira.mamcp.Naipe;

public class TesteNaipe {

	@Test
	public void testar() throws Exception {
		Iterator<Naipe> naipes = Arrays.asList(Naipe.values()).iterator();
		assertEquals(Naipe.ESPADAS, naipes.next());
		assertEquals(Naipe.COPAS, naipes.next());
		assertFalse(naipes.hasNext());
	}

}
