package models;

public class ExchangeRatesModel {
    private double pesoArgentino;
    private double bolivianoBoliviano;
    private double realBrasileiro;
    private double pesoChileno;
    private double pesoColombiano;
    private double dolarAmericano;

    public ExchangeRatesModel(ExchangeRatesRecord exchangeRatesRecord) {
        this.pesoArgentino = exchangeRatesRecord.ars();
        this.bolivianoBoliviano = exchangeRatesRecord.bob();
        this.realBrasileiro = exchangeRatesRecord.brl();
        this.pesoChileno = exchangeRatesRecord.clp();
        this.pesoColombiano = exchangeRatesRecord.cop();
        this.dolarAmericano = exchangeRatesRecord.usd();
    }

    public void getExchangeRates(double value) {

        if (value <= 0) {
            throw new IllegalArgumentException("O valor não pode ser menor ou igual a zero.");
        }

        if (pesoArgentino <= 0 || bolivianoBoliviano <= 0 || realBrasileiro <= 0 || pesoChileno <= 0
                || pesoColombiano <= 0 || dolarAmericano <= 0) {
            throw new IllegalArgumentException("As taxas de câmbio não podem ser menores ou iguais a zero.");
        }

        if (Double.isInfinite(value) || Double.isNaN(value)) {
            throw new IllegalArgumentException("O valor não pode ser infinito ou NaN.");
        }

        System.out.printf("Valor em Peso argentino:        %,.4f%n",
                value < pesoArgentino ? value * pesoArgentino : value / pesoArgentino);

        System.out.printf("Valor em Boliviano boliviano:   %,.4f%n",
                value < bolivianoBoliviano ? value * bolivianoBoliviano : value / bolivianoBoliviano);

        System.out.printf("Valor em Real brasileiro:       %,.4f%n",
                value < realBrasileiro ? value * realBrasileiro : value / realBrasileiro);

        System.out.printf("Valor em Peso chileno:          %,.4f%n",
                value < pesoChileno ? value * pesoChileno : value / pesoChileno);

        System.out.printf("Valor em Peso colombiano:       %,.4f%n",
                value < pesoColombiano ? value * pesoColombiano : value / pesoColombiano);

        System.out.printf("Valor em Dólar americano:       %,.4f%n",
                value < dolarAmericano ? value * dolarAmericano : value / dolarAmericano);
    }

    @Override
    public String toString() {
        return String.format(
                "Peso argentino:        %,.4f%n" +
                        "Boliviano boliviano:   %,.4f%n" +
                        "Real brasileiro:       %,.4f%n" +
                        "Peso chileno:          %,.4f%n" +
                        "Peso colombiano:       %,.4f%n" +
                        "Dólar americano:       %,.4f%n",
                pesoArgentino, bolivianoBoliviano, realBrasileiro, pesoChileno, pesoColombiano, dolarAmericano);
    }

}
