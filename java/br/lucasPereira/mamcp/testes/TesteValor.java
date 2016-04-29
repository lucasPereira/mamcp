package br.lucasPereira.mamcp.testes;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Test;

import br.lucasPereira.mamcp.Valor;

public class TesteValor {

	@Test
	public void testar() throws Exception {
		Iterator<Valor> valores = Arrays.asList(Valor.values()).iterator();
		assertEquals(Valor.AS, valores.next());
		assertFalse(valores.hasNext());
	}

}
