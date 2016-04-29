package br.lucasPereira.mamcp;

public class Carta {

	private Valor valor;
	private Naipe naipe;

	public Carta(Valor valor, Naipe naipe) {
		this.valor = valor;
		this.naipe = naipe;
	}

	public Boolean mesmoValor(Carta carta) {
		return valor.equals(carta.valor);
	}

	public Boolean mesmoNaipe(Carta carta) {
		return naipe.equals(carta.naipe);
	}

}
