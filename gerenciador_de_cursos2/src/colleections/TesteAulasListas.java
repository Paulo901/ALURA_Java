package colleections;

import java.util.ArrayList;
import java.util.Comparator;

public class TesteAulasListas {

	public static void main(String[] args) {
		
		Aulas p1 = new Aulas("O inicio", 12);
		Aulas p2 = new Aulas("Aprendendo mais", 15);
		Aulas p3 = new Aulas("Finalização", 20);

		ArrayList<Aulas> aulas = new ArrayList<Aulas>();
		aulas.add(p3);
		aulas.add(p2);
		aulas.add(p1);
		
		aulas.sort(null);
		System.out.println(aulas);
		//Uma sintaxe estranha para definir o próprio método de comparação independente da Classe Aulas
		//Usa-se o sort para pôr o método
		aulas.sort(Comparator.comparing(Aulas::getTitulo));
		
		System.out.println(aulas);
		
	}
	
	
}
