package novidades;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TesteComStream {

	public static void main(String[] args) {
		 
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Phyton", 45));
		cursos.add(new Curso("Java", 50));
		cursos.add(new Curso("php", 39));
		cursos.add(new Curso("C", 30));
		
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		
		// Usando os métodos de Stream
		cursos.stream()
				.filter(c -> c.getAlunos() > 40 )
				.map(Curso::getNome)
				.forEach(System.out::print);
		
		
		cursos.stream()
			.mapToInt(Curso::getAlunos)
			.average();
		
		List<Curso> cursosFiltrados = cursos.stream()
				.filter(c -> c.getAlunos() > 31)
				.collect(Collectors.toList());
		
		System.out.println(cursosFiltrados);
	}
}

