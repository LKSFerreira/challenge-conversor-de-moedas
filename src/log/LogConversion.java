package log;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class LogConversion {
    private final static List<String> conversionHistory = new ArrayList<>();

    public void logConversion(String conversion) {
        LocalDateTime timestamp = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedTimestamp = timestamp.format(formatter);
        String logEntry = String.format("%s - %s", formattedTimestamp, conversion);
        conversionHistory.add(logEntry);
    }

    public static void displayLogHistory() {
        if (conversionHistory.isEmpty()) {
            System.out.println("Nenhum histórico de conversão disponível.");
        } else {
            System.out.println("\nHistórico de Conversões:");
            conversionHistory.forEach(System.out::println);
            System.out.println();
        }
    }
}