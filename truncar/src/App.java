import java.nio.charset.StandardCharsets;

public class App {
    public static void main(String[] args) throws Exception {
        Encurtador encurtador = new Encurtador();
        System.out.println(encurtador.truncate("exemplo de String"));


        String text = "Olá, mundo!"; // Texto que será convertido

        // Convertendo para bytes usando ASCII
        byte[] asciiBytes = text.getBytes(StandardCharsets.US_ASCII);

        // Convertendo para bytes usando UTF-8
        byte[] utf8Bytes = text.getBytes(StandardCharsets.UTF_8);

        // Convertendo para bytes usando UTF-16
        byte[] utf16Bytes = text.getBytes(StandardCharsets.UTF_16);

        System.out.println("Texto original: " + text);
        System.out.println("ASCII Bytes: " + asciiBytes.toString());
        System.out.println("UTF-8 Bytes: " + utf8Bytes.toString());
        System.out.println("UTF-16 Bytes: " + utf16Bytes.toString());

    }

    }

