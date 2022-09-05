package entendendojavautils;

import java.util.ArrayList;

import pooepolimorfismo.Conta;
import pooepolimorfismo.ContaVip;
public class TesteArrayList {

	    public static void main(String[] args) {

	    	//Até então fiz um arrayList comum, mas vou deixá-lo mais especifico usando o Generics
	        ArrayList<Conta> lista = new ArrayList<Conta>(30);

	        Conta cc = new ContaVip(22, 11);
	        lista.add(cc);
	        Conta cc2 = new ContaVip(22, 22);
	        lista.add(cc2);
	        Conta cc3 = new ContaVip(33, 311);
	        lista.add(cc3);
	        Conta cc4 = new ContaVip(33, 322);
	        lista.add(cc4);
	        Conta ref = lista.get(1);
	        
	        System.out.println("Tamanho: " + lista.size());
	        System.out.println(ref.getNumero());

	        lista.remove(0);
	        System.out.println("Tamanho: " + lista.size());
	        
	        for(int i = 0; i < lista.size(); i++) {
	            Conta oRef = lista.get(i);
	            System.out.println(oRef);
	        }

	        System.out.println("----------");

	        for(Conta oRef : lista) {
	            System.out.println(oRef);
	        }

	    }
	    }
	
