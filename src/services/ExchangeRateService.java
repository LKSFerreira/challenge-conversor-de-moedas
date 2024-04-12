package services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class ExchangeRateService {

    private final String apiKey;
    private final HttpClient httpClient;

    public ExchangeRateService(String apiKey) {
        this.apiKey = apiKey;
        this.httpClient = HttpClient.newHttpClient();
    }

    public String getExchangeRate(String baseCurrency) throws IOException, InterruptedException {
        // Constrói a URL da API com a chave da API e a moeda base
        String url = String.format("https://api.exchangerate-api.com/v4/latest/%s?apiKey=%s", baseCurrency, apiKey);

        // Cria a requisição HTTP
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        // Envia a requisição e obtém a resposta
        HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());

        // Verifica se a resposta é bem-sucedida
        if (response.statusCode() == 200) {
            // Usa Gson para extrair o objeto "conversion_rates" do corpo da resposta
            Gson gson = new Gson();
            JsonObject jsonResponse = gson.fromJson(response.body(), JsonObject.class);
            System.out.println(jsonResponse);
            JsonObject conversionRates = jsonResponse.getAsJsonObject("rates");
            // Retorna a String JSON do objeto "conversion_rates"
            return conversionRates.toString();
        } else {
            // Lança uma exceção ou lida com o erro de outra forma
            throw new IOException("Erro ao obter a taxa de câmbio: " + response.statusCode());
        }
    }
}