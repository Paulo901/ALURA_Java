package colleections;

public class TesteAlunosNoCurso {

	    public static void main(String[] args) {

	        Cursos javaColecoes = new Cursos("Dominando as coleções do Java",
	                "Paulo Silveira");

	        javaColecoes.adiciona(new Aulas("Trabalhando com ArrayList", 21));
	        javaColecoes.adiciona(new Aulas("Criando uma Aula", 20));
	        javaColecoes.adiciona(new Aulas("Modelando com coleções", 24));

	        Alunos a1 = new Alunos("Paulo Rodrigo", 34672);
	        Alunos a2 = new Alunos("Guilherme ", 5617);
	        Alunos a3 = new Alunos("Mauricio Aniche", 17645);

	        
	    javaColecoes.matricula(a1);
	    javaColecoes.matricula(a2);
	    javaColecoes.matricula(a3);
	    
//	    javaColecoes.getAlunos().forEach(aluno -> {
//	        System.out.println(aluno);
//	    });
	    
	    Alunos a4 = new Alunos("Digo", 123);
	    
	    //javaColecoes.matricula(a4);
	    
	    javaColecoes.getAlunos().forEach(aluno -> {
	    	System.out.println(aluno);
	    });
	    Alunos p = new Alunos("Paulo Rodrigo", 34672);
	    System.out.println(p.hashCode() == a1.hashCode());
	    
	    System.out.println(javaColecoes.estaMatriculado(a4));
	    Alunos aluno = javaColecoes.buscaMatriculado(34672);
	    System.out.println(aluno);
	    
	    
	    
	   }
}
