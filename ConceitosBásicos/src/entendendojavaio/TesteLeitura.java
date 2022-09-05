package entendendojavaio;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.io.Reader;
import java.io.Writer;

public class TesteLeitura{

	public static void main(String[] args) throws IOException {

		InputStream fis = new FileInputStream("TextoTeste.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		String linha = br.readLine();

		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}

		br.close();
		
	
		
	}
}	

