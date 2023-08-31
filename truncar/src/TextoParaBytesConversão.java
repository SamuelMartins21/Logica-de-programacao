import java.nio.charset.StandardCharsets;

public class TextoParaBytesConversão {
        
    
        String text = "Olá, mundo!"; // Texto que será convertido

        // Convertendo para bytes usando ASCII
        byte[] asciiBytes = text.getBytes(StandardCharsets.US_ASCII);

        // Convertendo para bytes usando UTF-8
        byte[] utf8Bytes = text.getBytes(StandardCharsets.UTF_8);

        // Convertendo para bytes usando UTF-16
        byte[] utf16Bytes = text.getBytes(StandardCharsets.UTF_16);


    // Função auxiliar para converter bytes em uma representação de string
    public static String byteArrayToString(byte[] bytes) {
        StringBuilder result = new StringBuilder();
        for (byte b : bytes) {
            result.append(String.format("%02X ", b)); // Converte byte para hexadecimal
        }
        return result.toString();
    }
}
    
