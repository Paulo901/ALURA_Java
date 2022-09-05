package colleections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cursos {

	private String nome;
	private String instrutor;
	private List<Aulas> aulas = new ArrayList<Aulas>();
	private int tempoTotal;

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return "--->" + instrutor + "<---";
	}

	public List<Aulas> getAulas() {
		return Collections.unmodifiableList(aulas);
		//È importante lembrar do unmodifiableList, pois ele é responsável pelo seu código ficar mais profissional e claro
	}

	public Cursos(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	public void adiciona(Aulas aulas) {
		this.aulas.add(aulas);
		this.tempoTotal += aulas.getTempo();
		
	}
	@Override
	public String toString() {
		//System.out.println("Aulas" + this.getAulas());
		return "Curso: " + this.nome + "Tempo: " + this.tempoTotal;
	}
	//MENOS EFICIENTE
//	public int getTempoTotal(){
//	    int tempoTotal = 0;
//	    for(Aulas aula : aulas){
//	        tempoTotal += aula.getTempo();
//	    }
//	    return tempoTotal;
//	}
}
