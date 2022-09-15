package br.com.caelum.livraria.dominio;

import org.javamoney.moneta.Money;

public class CalculadoraDeCompra {
	
	public Money calcularValorTotal(Money subtotal, Money valorDoFrete, Desconto desconto) {
		if(subtotal.isZero()) return subtotal;
		Money resultado = subtotal;
		resultado = subtotal.subtract(desconto.getValor());
		resultado = subtotal.add(valorDoFrete);
		return resultado;
		/*
		 * Ao invés de usar subtotal para realizar os calculos, substitui a variável por uma  nova na qual recebe seu valor
		 * Com isso, o código passa a não gerar confusão em casos de ser mais complexo
		 */
	}
}
