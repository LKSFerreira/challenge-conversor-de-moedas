import java.io.IOException;

import exceptions.ApiKeyNotFoundException;
import models.ExchangeRatesModel;
import services.ExchangeRateService;

public class App {
    public static void main(String[] args) {
        try {

            // Obtém a taxa de câmbio de USD para ARS, BOB, BRL, CLP, COP
            ExchangeRatesModel exchangeRatesModel = new ExchangeRatesModel(
                    ExchangeRateService.getExchangeRateRecord("USD"));
            System.out.println(exchangeRatesModel);

            double value = 2;
            exchangeRatesModel.getExchangeRates(value);

        } catch (ApiKeyNotFoundException e) {
            System.err.println("Erro ao obter a API Key: " + e.getMessage());
        } catch (IOException | InterruptedException e) {
            System.err.println("Erro ao obter a taxa de câmbio: " + e.getMessage());
        }
    }
}