package services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import configs.Config;
import exceptions.ApiKeyNotFoundException;
import models.ExchangeRatesRecord;

public class ExchangeRateService {

    private final String apiKey;
    private final HttpClient httpClient;

    private ExchangeRateService(String apiKey) {
        this.apiKey = apiKey;
        this.httpClient = HttpClient.newHttpClient();
    }

    private String getExchangeRate(String baseCurrency) throws IOException, InterruptedException {
        // Constrói a URL da API com a chave da API e a moeda base
        String url = String.format("https://v6.exchangerate-api.com/v6/%s/latest/%s", apiKey, baseCurrency);

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
            JsonObject conversionRates = jsonResponse.getAsJsonObject("conversion_rates");
            // Retorna a String JSON do objeto "conversion_rates"
            return conversionRates.toString();
        } else {
            // Lança uma exceção ou lida com o erro de outra forma
            throw new IOException("Erro ao obter a taxa de câmbio: " + response.statusCode());
        }
    }

    /**
    * Obtém a taxa de câmbio atual da moeda base especificada para um conjunto pré-definido de moedas.
    * 
    * Este método acessa a ExchangeRate-API para obter a taxa de câmbio mais recente para as seguintes moedas:
    * ARS (Peso argentino), BOB (Boliviano), BRL (Real brasileiro), CLP (Peso chileno), COP (Peso colombiano), USD (Dólar americano).
    * 
    * @param baseCurrency A moeda base para a qual as taxas de câmbio serão obtidas, representada por um código de moeda de três letras (ISO 4217).
    * @return Um {@code ExchangeRatesRecord} contendo as taxas de câmbio para as moedas especificadas.
    * @throws IOException Se ocorrer um erro durante a comunicação com a ExchangeRate-API.
    * @throws InterruptedException Se a operação for interrompida durante a espera pela resposta da API.
    * @throws ApiKeyNotFoundException Se a chave da API não for encontrada no arquivo de configuração ou variável de ambiente.
    * 
    * Exemplo de uso:
    * <pre>
    * {@code
    * ExchangeRatesRecord rates = ExchangeRateService.getExchangeRateRecord("BRL");
    * System.out.println("Taxa de câmbio de BRL para USD: " + rates.usd());
    * }
    * </pre>
    * 
    * O retorno será um objeto {@code ExchangeRatesRecord} com as taxas de câmbio atuais, por exemplo:
    * <pre>
    * {@code
    * ExchangeRatesRecord{ars=170.3543, bob=1.3618, brl=1.0, clp=187.9076, cop=748.9232, usd=0.197}
    * }
    * </pre>
    */
    public static ExchangeRatesRecord getExchangeRateRecord(String baseCurrency)
            throws IOException, InterruptedException, ApiKeyNotFoundException {
        String apiKey = Config.getApiKey();
        ExchangeRateService exchangeRateService = new ExchangeRateService(apiKey);

        String exchangeRateJson = exchangeRateService.getExchangeRate(baseCurrency);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CASE_WITH_UNDERSCORES)
                .setPrettyPrinting()
                .create();

        return gson.fromJson(exchangeRateJson, ExchangeRatesRecord.class);
    }

}