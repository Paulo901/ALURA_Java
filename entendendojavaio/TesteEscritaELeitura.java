package entendendojavaio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteEscritaELeitura {

	public static void main(String[] args) throws IOException {
		
	//Essa parte é a leitura. Usando as Classes para leitura no pacote java.io
	        InputStream fis = System.in;
	        Reader isr = new InputStreamReader(fis);
	        BufferedReader br = new BufferedReader(isr);

	//Essa parte é a Escrita. Usando as Classes para Escrita no pacote java.io

	        OutputStream fos = System.out;
	        Writer osw = new OutputStreamWriter(fos);
	        BufferedWriter bw = new BufferedWriter(osw);

	        String linha = br.readLine();

	        //Usando o isEmpty pra ele parar wquando a linha for vazia
	        while (linha != null && !linha.isEmpty()) {
	            bw.write(linha);
	            bw.newLine();
	            bw.flush();
	            linha = br.readLine();
	        }

	        br.close();
	        bw.close();
	    }

	}