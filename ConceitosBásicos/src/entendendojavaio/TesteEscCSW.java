package entendendojavaio;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteEscCSW {

	public static void main(String[] args) throws Exception{
	
		
		//Esse while é apenas para ler todas as linhas do documento
		Scanner inicial = new Scanner(new File("contas.csv"));
		//While para pegar todas as linhas do documento contas.csw
        while (inicial.hasNextLine()) {
            String linha = inicial.nextLine();
            Scanner linhaScanner = new Scanner(linha);
            //definindo o método de separação dos itens entre virgulas
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");

            String tipoConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numero = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();
            //usando o format, que facilita na própria organização do código
            //pwsquiar uso no documento online
            System.out.format(new Locale("pt", "BR"), "%s - %04d-%08d, %20s: %08.2f%n", 
                    tipoConta, agencia, numero, titular, saldo);

            linhaScanner.close();
        }

        inicial.close();
        
        
	}
}
