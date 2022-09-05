package entendendojavaio;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class EncodingCharsets {

	    public static void main(String[] args) throws UnsupportedEncodingException {

	        String s = "ç";
	        System.out.println(s.codePointAt(0));

	        //Para saber qual tabela estou usano
	        Charset charset = Charset.defaultCharset();
	        System.out.println(charset.displayName());

	        //para saber quantos bytes ocupa a letra na tabela do windows
	        byte[] bytes = s.getBytes("windows-1252" /*"UTF-8"*/);
	        System.out.println(bytes.length + ", windows-1252" /*"UTF-8"*/);
	        
	        //pegando os bytes e convertendo para string em cada tabela
	        String sNovo = new String(bytes, "windows-1252");
	        System.out.println(sNovo);
	        bytes = s.getBytes("UTF-16");
	        System.out.print(bytes.length + ", UTF-16, ");
	        sNovo = new String(bytes, "UTF-16");
	        System.out.println(sNovo);

	        bytes = s.getBytes(StandardCharsets.US_ASCII);
	        System.out.print(bytes.length + ", US_ASCII, ");
	        sNovo = new String(bytes, "US-ASCII");
	        System.out.println(sNovo);
	    }

}

