package br.com.caelum.livraria.dominio;

public class ISBN {

	private final String numero;

	public ISBN(String isbn) {
		if(!validar(isbn)) 
			throw new IllegalArgumentException(String.format("ISBN inválido: %s", isbn));
		this.numero = isbn;
	}

	private boolean validar(String isbn) {
		return new Validator(isbn).validar(); 
		/*
		 * Para realizar a validação, como o código era extenso, criei uma classe para ele
		 * de modo que será chamado o método para realizar essa validação
		 */
	}
	
	@Override
	public String toString() {
		return numero;
	}
}
