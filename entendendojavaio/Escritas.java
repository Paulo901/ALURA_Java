package entendendojavaio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;

public class Escritas {

	public static void main (String[] args) throws IOException{
	
	//Este método é mais primitivo. Faço a utilização de várias classes para obter o resultado
		OutputStream fos = System.out;
    	Writer osw = new OutputStreamWriter(fos);
    	BufferedWriter bw = new BufferedWriter(osw);
        bw.write("tesnte");
        bw.newLine();
        bw.flush();
    	bw.close();
    	
   //Outras alternativas de métodos de escrita. Essas são mais fáceis de usar.
   //Continuo usando o BufferedWriter para ter o newLine e eviar usar o System.lineSeparator	
    	FileWriter fw = new FileWriter("TextoTeste.txt");
    	BufferedWriter bw2 = new BufferedWriter(fw);
        fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bw2.newLine();
        bw2.newLine();
        fw.write("asfasdfsafdas dfs sdf asf assdß");

        bw2.close();
        
   //Usando PrintStream, uma forma mais eficaz, facilito todo o processo   
   //Eu também poderia usar o PrintWriter com os mesmos métodos
        PrintStream ps = new PrintStream("TextoTeste3");
        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        ps.println();
        ps.println();
        ps.println("asfasdfsafdas dfs sdf asf assdß");

        ps.close();
        
        
	} 
}