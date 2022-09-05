package colleections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		
		Cursos Colecoes = new Cursos("Primeiro", "Paulo");
		List<Aulas> aulas = Colecoes.getAulas();
		
		Colecoes.adiciona(new Aulas("aula legal", 30));
		Colecoes.adiciona(new Aulas("aula legal 2.0", 10));
		Colecoes.adiciona(new Aulas("aula legal 3.0", 20));
		System.out.println(/*Colecoes.getAulas() + */Colecoes.getInstrutor());
		//Colecoes.getAulas().add(new Aulas("aula legal 3.0", 20));
		System.out.println(aulas);

		/* Collections.sort(aulas);
		 * dá errado nesse ponto, pois o metodo getAulaws() devolve uma Lista imutavel
		 */
		List<Aulas> aulass = new ArrayList<>(aulas);
		Collections.sort(aulass);
		System.out.println(aulass);
		System.out.println(Colecoes);
	}
}
