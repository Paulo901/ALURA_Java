import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ConhecendoFuncoes {

	public static void main(String[] args) {
		
	
	List<String> aleatorio = new ArrayList<>();
	aleatorio.add("alura online");
	aleatorio.add("casa do código");
	aleatorio.add("caelum");
		
	Consumer<String> consumidor = new Imprime();
	aleatorio.forEach(consumidor);
	
	ComparadorPorTamanho comparador = new ComparadorPorTamanho();

	aleatorio.sort(comparador);

	System.out.println(aleatorio);
	}
}

class Imprime implements Consumer<String>{

	@Override
	public void accept(String s) {
		System.out.println(s);
	}
}
class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length())
            return -1;
        if (s1.length() > s2.length())
            return 1;
        return 0;
    }
}