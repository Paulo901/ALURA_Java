package entendendojavautils;

import java.util.ArrayList;

import pooepolimorfismo.Conta;
import pooepolimorfismo.ContaVip;

public class TesteArrayListEquals {
	
  public static void main(String[] args) {
		
    ArrayList<Conta> lista = new ArrayList<Conta>();
	Conta cc1 = new ContaVip(22, 11);
	lista.add(cc1);
	Conta cc2 = new ContaVip(22, 22);
	lista.add(cc2);

    lista.add(cc1);
    
    boolean existe = lista.contains(cc2); //novo

    System.out.println("Já existe? " + existe);
    
    
		
	for(Conta oRef : lista) {
	  System.out.println(oRef);
    }

  }
}