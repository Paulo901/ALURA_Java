package entendendojavautils;

import java.util.ArrayList;
import java.util.Comparator;

import pooepolimorfismo.Cliente;
import pooepolimorfismo.Conta;
import pooepolimorfismo.ContaCorrente;
import pooepolimorfismo.ContaPoupança;

public class TesteOrdenacao {

	public static void main(String[] args) {
		//Criando as contas e adicionando um titular para cada
	     Conta cc1 = new ContaCorrente(22, 33);
         Cliente clienteCC1 = new Cliente();
         clienteCC1.setNome("Paulo");
         cc1.setTitular(clienteCC1);
         cc1.deposita(333.0);

         Conta cc2 = new ContaPoupança(22, 44);
         Cliente clienteCC2 = new Cliente();
         clienteCC2.setNome("Rodrigo");
         cc2.setTitular(clienteCC2);
         cc2.deposita(444.0);

         Conta cc3 = new ContaCorrente(22, 11);
         Cliente clienteCC3 = new Cliente();
         clienteCC3.setNome("Isaac");
         cc3.setTitular(clienteCC3);
         cc3.deposita(111.0);

         Conta cc4 = new ContaPoupança(22, 22);
         Cliente clienteCC4 = new Cliente();
         clienteCC4.setNome("Ana");
         cc4.setTitular(clienteCC4);
         cc4.deposita(222.0);
         
        
		ArrayList<Conta> lista = new ArrayList<Conta>();
		//Pondo na lista com os métodos do ArrayList
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		
		//Usando a classe Organizador para organizar quanto ao número da conta
		//Organizador organiza = new Organizador();
		lista.sort(new Organizador()); //Dessa forma não precisa criar a seta do objeto
		for (Conta conta : lista) {
		
			System.out.println(conta);
		}
		System.out.println("---------------------------------------------------------------");
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		System.out.println("---------------------------------------------------------------");
		
		
		
		//OrganizaNome organiza = new OrganizaNome();
		//Com null significa que ele vai usar o método que foi transcrito na classe Conta, já que implementei o Comparable
		lista.sort( new Comparator<Conta>(){

			@Override
			public int compare(Conta o1, Conta o2) {
				String nomeC1 = o1.getTitular().getNome();
				String nomeC2 = o2.getTitular().getNome();
				
				return nomeC1.compareTo(nomeC2);
			}
			
			
		} ); //Com isso crio a Classe anonima
		for (Conta conta : lista) {
			System.out.println(conta + "  " + conta.getTitular().getNome());
		}
		
		
		
	}

}


/**
 * 
 * - Essa classe não precisa ser criada. Há as Classe anominas que enxugam o código.
 * - Comentei porque uso agora num dos sort a sintaxe que cria a classe anonima
 * - Existem também as Lambdas, que simplificam o processo da classe anonima
 * 
class OrganizaNome implements Comparator<Conta>{

	@Override
	public int compare(Conta o1, Conta o2) {
	//Criando Strings para receber o valor do Titular dasContas que serão recebidas	
		String nomeC1 = o1.getTitular().getNome();
		String nomeC2 = o2.getTitular().getNome();
	//compareTo é um método da classe String que faz justamente a comparação de ordem alfabética entre Strings
	//Ela funciona como a anterior. Devolve negativo se for antes, positivo se for depois e zero se for a mesma letra
		
		return nomeC1.compareTo(nomeC2);
	}
	
	
}
 *
 */

class Organizador implements Comparator<Conta>{

	@Override
	public int compare(Conta o1, Conta o2) {
		
		if(o1.getNumero() < o2.getNumero()) {
			return -1;
	
		}else if(o1.getNumero() > o2.getNumero()) {
			return 1;
		}

		return 0;
	}
	
	
}