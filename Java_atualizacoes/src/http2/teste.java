package http2;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class teste {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		
	HttpClient httpClient = HttpClient.newHttpClient();
	HttpRequest httpRequest = HttpRequest.newBuilder(new URI("https://teste.com"))
			.GET()
			.build();
	HttpResponse<String> resposta = httpClient.send(httpRequest, BodyHandlers.ofString());		
			
			System.out.println(resposta.statusCode());
			System.out.println(resposta.body());
	}
}