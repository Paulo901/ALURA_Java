package Exceptions;

public class OutroFluxo {

	//Exceções: parte 4 - Checked e Unchecked
	//					- Esse é um Checked
	
    public static void main(String[] args) {
        System.out.println("Ini do main");
        
        //Se não fosse o try_Catch, eu deveria colocar o throws aqui também. Try_catch funciona como um throws
        try {
        metodo1();
        
        } catch(MinhaExcecao em){
        	em.getMessage();
        	System.out.println(em.getMessage());
        	
        }
        
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao{
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
        	System.out.println(i);
        	
            throw new MinhaExcecao("fim");
        }
        System.out.println("Fim do metodo2");
    }
}
