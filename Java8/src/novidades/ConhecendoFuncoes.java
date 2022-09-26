package novidades;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/*
 * Java 8( Lâmbdas ) - p1 : Utilizei as novas classes Consumer e comparator para os métodos sort e forEach
 * 					 - p2 : Aplicando Lâmbdas e removendo as classes anônimas
 * 
 * 
 * 
 */
public class ConhecendoFuncoes {

	public static void main(String[] args) {

		List<String> aleatorio = new ArrayList<>();
		aleatorio.add("alura online");
		aleatorio.add("casa do código");
		aleatorio.add("caelum");

//-------------------------------- Consumer -----------------------------------------------------

		// Consumer<String> consumidor = new Imprime();
		// Chegando perto das Lambdas, reduzi o código criando um Consumer já dentro do
		// forEach
		aleatorio.forEach(new Consumer<String>() {

			@Override
			public void accept(String s) {
				System.out.println(s);
			}

		});

		// Chegando no Lambda, retirando a criação do objeto, o Java já entende por
		// baixo dos panos que estou criando um Consumer
		aleatorio.forEach(System.out::println);
		
		System.out.println(aleatorio);

//---------------------------------Comparator----------------------------------------------------

		// ComparadorPorTamanho comparador = new ComparadorPorTamanho();

		aleatorio.sort(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if (s1.length() < s2.length())
					return -1;
				if (s1.length() > s2.length())
					return 1;
				return 0;
			}
		});
		//para encurtar, usei o compare do Integer para comparar o tamanho
		aleatorio.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		aleatorio.sort(Comparator.comparing(String::length));

		System.out.println(aleatorio);
	}
}

//class Imprime implements Consumer<String>{
//
//	@Override
//	public void accept(String s) {
//		System.out.println(s);
//	}
//}

//class ComparadorPorTamanho implements Comparator<String> {
//
//	@Override
//	public int compare(String s1, String s2) {
//		if (s1.length() < s2.length())
//			return -1;
//		if (s1.length() > s2.length())
//			return 1;
//		return 0;
//	}
//}