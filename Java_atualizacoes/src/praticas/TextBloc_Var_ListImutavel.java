package praticas;

import java.util.ArrayList;
import java.util.List;

public class TextBloc_Var_ListImutavel {
	
	public static void main(String[] args) {
		
	/**
	  Metodo of
	  Ao criar Lists ou Maps, por exemplo, pode-se atribuir o método of, que vai devolver uma lista imutável
	  OBS: os valores devem ser atribuidos dentro do método
	 */
		List letras = List.of("a", "b", "c");
		System.out.println(letras.get(1));
		
		
	//criando objeto usando o var
		var letras2 = new ArrayList<String>();
		
		
	//Não funcionou	- Blocos de texto
//	String textoJaModificado = """
//			era pra o texto 
//			funcionar assim
//			mas algo deu errado
//			""";
	
		//Não funcionou
		String nome = "Paulo";
		
//		switch(nome) {
//		
//		case "Paulo" -> System.out.println(nome);
//		case "Rodrigo" -> System.err.println(nome + "pser");
//		default -> System.out.println(nome + "nada");
//		
//		}
	
	
	
}
	}