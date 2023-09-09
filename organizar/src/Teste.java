public class Teste {

    public static String arrange(String sentence){
        String c = "";
        String[] separaStrings = sentence.split(" ");

        // Criar um array para armazenar as palavras ordenadas
        String[] palavrasOrdenadas = new String[separaStrings.length];

        // Inicializar o array com as palavras originais
        for (int i = 0; i < separaStrings.length; i++) {
            palavrasOrdenadas[i] = separaStrings[i];
        }

        // Ordenar o array de palavras com base no comprimento
        for (int i = 0; i < palavrasOrdenadas.length - 1; i++) {
            for (int j = i + 1; j < palavrasOrdenadas.length; j++) {
                if (palavrasOrdenadas[i].length() > palavrasOrdenadas[j].length()) {
                    String temp = palavrasOrdenadas[i];
                    palavrasOrdenadas[i] = palavrasOrdenadas[j];
                    palavrasOrdenadas[j] = temp;
                }
            }
        }

        // Construir a string resultante
        for (String palavra : palavrasOrdenadas) {
            c += palavra + " ";
        }

        return c.trim(); // Remover o espaço extra no final
    }
    }
