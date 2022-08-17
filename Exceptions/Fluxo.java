package Exceptions;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        
        
        try {
        metodo1();
        
        } catch(ArithmeticException | NullPointerException em){
        	em.getMessage();
        	System.out.println(em.getMessage());
        	
        }
        
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
        	System.out.println(i);
        	// Criando um código com um problema lógico para o Catch sinalizar
        	int a = 10 / 0;
        	// por algum motivo não dá exceção na indicador sem objeto, mas deixei o catch por didatica. Fica a dúvida(talvez seja atualização)
        	ExemploExcecao teste1 = null;
        	
            
        }
        System.out.println("Fim do metodo2");
    }
}
