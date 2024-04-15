package views;

import java.util.Map;
import java.util.Scanner;

import models.ExchangeRatesModel;
import services.ExchangeRateService;
import utils.MyConsole;

public class Dashboard {
    public static ExchangeRatesModel selectExchangeRate(Scanner scanner) {
        Map<String, String> opcoesParaMoedas = Map.of(
                "1", "BRL",
                "2", "USD",
                "3", "ARS",
                "4", "CLP",
                "5", "COP",
                "6", "BOB");

        while (true) {
            moedasOrigem();
            var opcao = scanner.next();

            if (opcoesParaMoedas.containsKey(opcao)) {
                return new ExchangeRatesModel(
                        ExchangeRateService.getExchangeRateRecord(opcoesParaMoedas.get(opcao)));
            } else if ("7".equals(opcao)) {
                // System.out.println("Digite o código da moeda de origem (Ex: 'BRL'):");
                // var moedaOrigem = scanner.next();

                // var value = getValueToConvert(scanner);

                // System.out.println("Digite o código da moeda de destino (Ex: 'USD'):");
                // var moedaDestino = scanner.next();
                return null;
            } else {
                System.out.println("Opção inválida.\n");
            }
        }
    }

    public static double getValueToConvert(Scanner scanner) {

        while (true) {

            System.out.print("Digite o valor a ser convertido: ");
            var value = scanner.next();
            try {
                return Double.parseDouble(value);
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido.\n");
            }
        }
    }

    private static void moedasOrigem() {
        System.out.println("Selecione a moeda de origem:");
        MyConsole.printColor("1 - Real (BRL)", MyConsole.YELLOW);
        MyConsole.printColor("2 - Dólar Americano (USD)", MyConsole.BLUE);
        MyConsole.printColor("3 - Peso Argentino (ARS)", MyConsole.WHITE);
        MyConsole.printColor("4 - Peso Chileno (CLP)", MyConsole.PURPLE);
        MyConsole.printColor("5 - Peso Colombiano (COP)", MyConsole.CYAN);
        MyConsole.printColor("6 - Boliviano Boliviano (BOB)", MyConsole.RED);
        MyConsole.printColor("7 - Outra Moeda", MyConsole.ORANGE);
    }

    public static void exchangeOneToOne(Scanner scanner) {
        // System.out.print("Digite o código da moeda de origem (Ex: 'BRL'): ");
        // var moedaOrigem = scanner.next();

        // var value = getValueToConvert(scanner);

        // System.out.print("Digite o código da moeda de destino (Ex: 'USD'): ");
        // var moedaDestino = scanner.next();
    }

}
