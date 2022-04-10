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
		assertEquals(Valor.REI, valores.next());
		assertEquals(Valor.DAMA, valores.next());
		assertEquals(Valor.VALETE, valores.next());
		assertEquals(Valor.DEZ, valores.next());
		assertEquals(Valor.NOVE, valores.next());
		assertEquals(Valor.OITO, valores.next());
		assertEquals(Valor.SETE, valores.next());
		assertEquals(Valor.SEIS, valores.next());
		assertEquals(Valor.CINCO, valores.next());
		assertEquals(Valor.QUATRO, valores.next());
		assertEquals(Valor.TRES, valores.next());
		assertEquals(Valor.DOIS, valores.next());
		assertFalse(valores.hasNext());
	}

}
