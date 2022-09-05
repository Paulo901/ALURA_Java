package Exceptionss;

import javax.swing.JOptionPane;


public class Conexao implements AutoCloseable{

    public Conexao() {
        System.out.println("Abrindo conexao");
    }

    public void leDados() {
        System.out.println("Recebendo dados");
           throw new IllegalStateException();
    }

    
    //Ao implementar essa interface, ele mesmo executa um método de fechar automaticamente
//    public void fecha() {
//        System.out.println("Fechando conexao");
//    }

	@Override
	public void close() {
		 System.out.println("Fechando conexao");
		
	}
}