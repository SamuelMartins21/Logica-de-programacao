public class ArmstrongNumber {
    boolean isArmstrongNumber(int numberToCheck) {
        int resultado = 0;
        String numeroString = Integer.toString(numberToCheck);
        int quantidadeDigitos = numeroString.length();

        for (int i = 0; i < numeroString.length(); i++) {
            char caractere = numeroString.charAt(i);
            int digito = Character.getNumericValue(caractere);
            resultado += (int) Math.pow(digito, quantidadeDigitos);
        }

        if (numberToCheck == resultado) {
            return true;
        }
        return false;
    }
}
