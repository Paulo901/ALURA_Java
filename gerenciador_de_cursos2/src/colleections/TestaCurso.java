package colleections;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		
		Cursos Colecoes = new Cursos("Primeiro", "Paulo");
		List<Aulas> aulas = Colecoes.getAulas();
		
		Colecoes.adiciona(new Aulas("aula legal", 30));
		Colecoes.adiciona(new Aulas("aula legal 2.0", 10));
		Colecoes.adiciona(new Aulas("aula legal 3.0", 20));
		System.out.println(/*Colecoes.getAulas() + */Colecoes.getInstrutor());
		//Colecoes.getAulas().add(new Aulas("aula legal 3.0", 20));
	}
}
