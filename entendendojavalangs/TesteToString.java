package entendendojavalangs;

import pooepolimorfismo.ContaCorrente;
import pooepolimorfismo.ContaPoupança;
import pooepolimorfismo.ContaVip;

public class TesteToString {
/**
 * Essa Classe de teste tem como único objetivo mostrar o uso to toString, 
 * 
 * toString foi Implementado Clonado na Classe Conta e nas suas filhas
 * 
 * 
 * @param args
 */
	public static void main(String[] args) {
		
		ContaVip A = new ContaVip(222, 333);
		ContaPoupança B = new ContaPoupança(123, 321);
		ContaCorrente C = new ContaCorrente(121, 212);

		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
	}
	
	
	
}
