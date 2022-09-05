package entendendojavautils;

import java.util.ArrayList;

import pooepolimorfismo.Cliente;
import pooepolimorfismo.Conta;
import pooepolimorfismo.ContaCorrente;
import pooepolimorfismo.ContaPoupança;


public class TesteOrdenacaoLambdas {

	public static void main(String[] args) {
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
		
		//Lambdas tem um papel de redução de código
		//Ele tambḿe cria classe anonima, mas de forma simplificada
		/**
		 * - Como você está pegando o valor de lista, ele já sabe que se trata de Conta
		 * - Como usei a classe Integer, ele também tem o compare 
		 * - Como só coloquei essa operação, ele já sabe que se trata da saida(return)
		 * - A seta " -> " é o que informa se tratar de uma Lambda
		 */
		lista.sort( (c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));
		//O arrayList possui o método forEach, que faz a mesma coisa do laço for
		//Usando lambdas também podemos simplificar seguindo as mesmas regras
		lista.forEach((conta) -> System.out.println(conta));
		
	}
}