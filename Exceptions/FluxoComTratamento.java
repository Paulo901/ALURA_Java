package Exceptions;

public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        
        
        try {
        metodo1();
        
        //Colocando diretamente a Classe Exception, não precisamos especificar exceções
        } catch(Exception em){
        	em.getMessage();
        	System.out.println(em.getMessage());
        	
        }
        
        System.out.println("Fim do main");
    }

    private static void metodo1()  {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        
        //throw new ArithmeticException("Mensagem Aleatória");
        //não compila pois tem que colocar o throws, que fiz na Classe OutroFluxo
        // -->  throw new MinhaExcecao("Ops");  <--
        /*
         Comentando para não dar erro de compilação
         
        System.out.println("Fim do metodo2");
        
        */
    }
}
