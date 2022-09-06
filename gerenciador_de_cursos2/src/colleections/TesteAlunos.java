package colleections;

import java.util.*;

public class TesteAlunos {

	    public static void main(String[] args) {

	    	//1) adicione alguns alunos
	        Set<String> alunos = new HashSet<>();
	        alunos.add("Paulo");
	        alunos.add("Alberto");
	        alunos.add("Pedro");    
	        alunos.add("Nico");    

	       //tente imprimir os alunos usando foreach
	        alunos.forEach (aluno -> {
				System.out.println(aluno);
			});
	        
	      
	        //2) imprima o tamanho da colecao
	        //alunos.size();
	        System.out.println(alunos.size());

	        //3) tente adicionar um aluno que existe
	        alunos.add("Paulo");
	        boolean adicionou = alunos.add("Pedro");
	        //4) imprima novamente o tamanho da colecao
	      
	        System.out.println("Adicionou? " + adicionou);
	        	
    }
}