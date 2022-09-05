package colleections;

public class Aulas implements Comparable<Aulas>{

	

	    private String titulo;
	    private int tempo;

	    public Aulas (String titulo, int tempo) {
	        this.titulo = titulo;
	        this.tempo = tempo;
	    }

	    public String getTitulo() {
	        return titulo;
	    }

	    public int getTempo() {
	        return tempo;
	    }
	    
	    @Override
	    public String toString() {
	        return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]\n";
	    }
	    
	    @Override
	    public int compareTo(Aulas outraAula) {
	      //return this.titulo.compareTo(outraAula.titulo);
	        return Integer.compare(tempo, outraAula.tempo);
	    }
}
	

