package entendendojavautils;

import java.util.ArrayList;
import java.util.List;

public class Wrappers {

	public static void main(String[] args) {
		

		        Integer idadeRef = 29; //autoboxing, cria um objeto do tipo Integer, que é como int 
		        int primitivo = new Integer(21); // unboxing

		        List<Integer> lista = new ArrayList<>();
		        lista.add(idadeRef); 
		        lista.add(primitivo); //autoboxing

		        int v1 = lista.get(0);  //unboxing
		        Integer v2 = lista.get(1);  //ok

		        System.out.println(v1); 
		        System.out.println(v2);  

		        Integer valorRef = Integer.valueOf(33); // Usando o ValueOf pra criar 
		        int valorPri = valorRef.intValue(); //desembrulhando, pegando o valor primitivo

		        System.out.println(valorPri); //33
		        
		        Integer iParseado1 = Integer.valueOf("42"); 
		        int iParseado2 = Integer.parseInt("44"); 

		        System.out.println(iParseado1);
		        System.out.println(iParseado2); 
		        
		        //Usando as constantes do Integer
		        System.out.println(Integer.MAX_VALUE); // 2^31 - 1
		        System.out.println(Integer.MIN_VALUE); //-2^31

		        System.out.println(Integer.SIZE); // 32 bits
		        System.out.println(Integer.BYTES); //4 Bytes
	}
	
}
