package br.lucasPereira.mamcp;

public class ContrutorDeCartaNaipe {

	private Valor valor;

	public ContrutorDeCartaNaipe(Valor valor) {
		this.valor = valor;
	}

	public Carta espadas() {
		return new Carta(valor, Naipe.ESPADAS);
	}

	public Carta copas() {
		return new Carta(valor, Naipe.COPAS);
	}

	public Carta paus() {
		return new Carta(valor, Naipe.PAUS);
	}

	public Carta ouro() {
		return new Carta(valor, Naipe.OURO);
	}

}
