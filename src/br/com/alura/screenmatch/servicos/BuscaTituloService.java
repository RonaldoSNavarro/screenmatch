package br.com.alura.screenmatch.servicos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscaTituloService {

    private static final String API_KEY = "11ae1012";

    public String buscaTitulo(String titulo) throws IOException, InterruptedException {
        String endereco = "http://www.omdbapi.com/?t=" + titulo.replace(" ", "+") + "&apikey=" + API_KEY;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Status da resposta: " + response.statusCode()); // Debugging
        if (response.statusCode() != 200) {
            throw new IOException("Erro na comunicação com o servidor. Código: " + response.statusCode());
        }

        return response.body();
    }
}