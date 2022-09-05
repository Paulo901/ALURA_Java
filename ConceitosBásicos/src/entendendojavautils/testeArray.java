package entendendojavautils;

import pooepolimorfismo.Conta;
import pooepolimorfismo.ContaCorrente;
import pooepolimorfismo.ContaVip;

public class testeArray {

	public static void main (String[] args) {
		
		// Cirando array de classes e pondo objetos da classe dentro
		Conta[] teste = new Conta[4];
		ContaVip CVip = new ContaVip(10, 10);
		ContaCorrente CC = new ContaCorrente(12, 12);
		teste[0] = CVip;
		teste[1] = CC;
		//Uma nova referencia além de CVip e teste[0]
		ContaVip ref = (ContaVip)teste[0];
		
		System.out.println(ref);
		System.out.println(teste[0]);
		System.out.println(CVip);
		

		//Criei uma classe que trabalha com um array e interage com ele por meio dos métodos quando eu os chamo
		GuardadorDeContas guardador = new GuardadorDeContas();

        ContaVip cc = new ContaVip(22, 11);
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        guardador.adiciona(cc2);
        
        int tamanho = guardador.getCasasOcupadas();
        System.out.println(tamanho);
        
        guardador.getReferencia(2);
        System.out.println(guardador.getReferencia(0));
        
        Conta aref = (Conta)guardador.getReferencia(0);
        System.out.println(aref.getNumero()); 
	}
}