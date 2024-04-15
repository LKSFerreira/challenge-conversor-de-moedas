package utils;

public enum MyConsole {
    // Métodos
    RESET("\u001B[0m"),
    ANSI_CLEAR("\u001B[2J"),

    // Regular Colors
    GREEN("\u001B[32m"),
    RED("\u001B[31m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    PURPLE("\u001B[35m"),
    CYAN("\u001B[36m"),
    WHITE("\u001B[37m"),
    ORANGE("\u001B[38;5;208m");

    private final String escapeCode;

    MyConsole(String escapeCode) {
        this.escapeCode = escapeCode;
    }

    public static void clearConsole() {
        // Tenta limpar o console. Isso pode não funcionar em todos os terminais.
        System.out.print(ANSI_CLEAR.escapeCode);
        System.out.flush();
    }

    public static void printColor(String text, MyConsole color) {
        // Imprime o texto do banner na cor especificada
        System.out.println(color.escapeCode + text + RESET.escapeCode);
    }

    public static void printColor(Banner banner, MyConsole color) {
        System.out.println(color.escapeCode + banner.getBannerText() + RESET.escapeCode);
    }
}