import services.ExchangeRateService;

import java.io.IOException;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import configs.Config;
import exceptions.ApiKeyNotFoundException;
import models.ExchangeRatesRecord;

public class App {
    public static void main(String[] args) {
        try {
            String apiKey = Config.getApiKey();
            ExchangeRateService exchangeRateService = new ExchangeRateService(apiKey);

            // Exemplo de uso do serviço para obter a taxa de câmbio de USD para EUR
            String exchangeRateJson = exchangeRateService.getExchangeRate("BRL");

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CASE_WITH_UNDERSCORES)
                    .setPrettyPrinting()
                    .create();

            ExchangeRatesRecord exchangeRatesRecord = gson.fromJson(exchangeRateJson, ExchangeRatesRecord.class);

            System.out.println(exchangeRatesRecord);

        } catch (ApiKeyNotFoundException e) {
            System.err.println("Erro ao obter a API Key: " + e.getMessage());
        } catch (IOException | InterruptedException e) {
            System.err.println("Erro ao obter a taxa de câmbio: " + e.getMessage());
        }
    }
}