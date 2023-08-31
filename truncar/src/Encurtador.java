import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encurtador {

    public String truncate(String input) {
        try {
            // Crie uma instância do MessageDigest usando o algoritmo MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

            // Calcule o hash da string de entrada
            byte[] hashBytes = md.digest(input.getBytes());

            // Converta o hash em uma representação hexadecimal
            BigInteger hashInt = new BigInteger(1, hashBytes);
            String hashHex = hashInt.toString(16);

            // Trunque o hash para 5 caracteres, adicionando zeros à esquerda, se necessário
            while (hashHex.length() < 5) {
                hashHex = "0" + hashHex;
            }

            // Pegue os primeiros 5 caracteres do hash truncado
            String trucatedHash = hashHex.substring(0, 5);

            System.out.println("String original: " + input);
            System.out.println("Truncated Hash: " + trucatedHash);

            return trucatedHash.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
