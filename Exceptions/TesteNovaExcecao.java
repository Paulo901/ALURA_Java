package Exceptions;

public class TesteNovaExcecao {

	public static void main (String [] args) {
	
		// Criei o método no proprio try. Desa forma, evito problemas. Para isso, chamei uma Interface em Conexão
		try(Conexao conect = new Conexao()){
			conect.leDados();
		
	}	catch(IllegalStateException ex) {
	        System.out.println("Deu erro na conexao");
	}    
//	 	finally {
//	        conect.fecha();
//  }
	 
	}
}
