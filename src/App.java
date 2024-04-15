import java.io.IOException;
import java.util.Scanner;

import exceptions.ApiKeyNotFoundException;
import models.ExchangeRatesModel;
import services.ExchangeRateService;
import utils.Banner;
import utils.MyConsole;
import views.Dashboard;

public class App {

    public static void main(String[] args) throws ApiKeyNotFoundException, IOException, InterruptedException {

        MyConsole.clearConsole();
        MyConsole.printColor(Banner.LOGO, MyConsole.GREEN);
        ExchangeRatesModel exchangeRatesModel = new ExchangeRatesModel(
                ExchangeRateService.getExchangeRateRecord("BRL"));
        MyConsole.printColor("Cotação do Real (BRL)", MyConsole.BLUE);
        System.out.println(exchangeRatesModel);

        Scanner scanner = new Scanner(System.in); // Criar apenas uma instância de Scanner

        try {
            while (true) {
                exchangeRatesModel = Dashboard.selectExchangeRate(scanner);

                if (exchangeRatesModel == null) {
                    System.out.println("Escolheu a opcao 7");
                } else {
                    var value = Dashboard.getValueToConvert(scanner);
                    exchangeRatesModel.getExchangeRates(value);
                }

                scanner.nextLine();
                System.out.print("Pressione 'Enter' para continuar ou 'q' para sair: \n");
                var key = scanner.nextLine();

                if ("q".equalsIgnoreCase(key.trim()) || "quit".equalsIgnoreCase(key.trim())
                        || "sair".equalsIgnoreCase(key.trim())) {
                    return;
                }
            }
        } finally {
            scanner.close(); // Fechar o Scanner uma única vez, ao final do uso
        }
    }
}