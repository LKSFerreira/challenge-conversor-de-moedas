import java.io.IOException;

import exceptions.ApiKeyNotFoundException;
import models.ExchangeRatesModel;
import services.ExchangeRateService;
import utils.Banner;
import utils.MyConsole;

public class App {

    public static void main(String[] args) throws ApiKeyNotFoundException, IOException, InterruptedException {

        MyConsole.clearConsole();

        MyConsole.printColor(Banner.LOGO, MyConsole.GREEN);

        // Código para o resto da aplicação...

        // Obtém a taxa de câmbio de USD para ARS, BOB, BRL, CLP, COP
        ExchangeRatesModel exchangeRatesModel = new ExchangeRatesModel(
                ExchangeRateService.getExchangeRateRecord("BRL"));
        System.out.println(exchangeRatesModel);

        double value = 2;
        exchangeRatesModel.getExchangeRates(value);
    }

}