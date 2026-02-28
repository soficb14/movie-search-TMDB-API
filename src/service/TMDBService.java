package service;

import com.google.gson.Gson;
import model.RespostaApi;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TMDBService {

    private final String token;
    private final HttpClient client;
    private final Gson gson;

    public TMDBService(String token){
        this.token = token;
        this.client = HttpClient.newHttpClient();
        this.gson = new Gson();
    }

    public RespostaApi buscarFilme(String nomeFilme) throws Exception {
        String endereco = "https://api.themoviedb.org/3/search/movie?query="
                + nomeFilme + "&language=pt-BR";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .header("Authorization", "Bearer " + token)
                .header("accept", "application/json")
                .GET()
                .build();

        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());


        RespostaApi resposta =
                gson.fromJson(response.body(), RespostaApi.class);

        return gson.fromJson(response.body(), RespostaApi.class);
    }
}
