package Exceptions;

public class TesteNovaExcecao {

	public static void main (String [] args) {
	
	try(Conexao conect = new Conexao()){
		conect.leDados();
		
	}	catch(IllegalStateException ex) {
	        System.out.println("Deu erro na conexao");
	}    
//	    } finally {
//	        conect.fecha();
//	    }
//	}
	 
	}
}
