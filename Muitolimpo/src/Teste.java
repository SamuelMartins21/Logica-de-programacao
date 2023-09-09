public class Teste {
    public static String customTrim(String input) {
        int startIndex = 0;
        int endIndex = input.length() - 1;

        // Encontra o índice do primeiro caractere não em branco no início da string
        while (startIndex <= endIndex && Character.isWhitespace(input.charAt(startIndex))) {
            startIndex++;
        }

        // Encontra o índice do primeiro caractere não em branco no final da string
        while (endIndex >= startIndex && Character.isWhitespace(input.charAt(endIndex))) {
            endIndex--;
        }

        // Cria uma nova string com os caracteres entre startIndex e endIndex
        return input.substring(startIndex, endIndex + 1);
    }
}
