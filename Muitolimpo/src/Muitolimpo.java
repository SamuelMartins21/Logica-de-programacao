public class Muitolimpo {
    public static String clean(String identifier){
        StringBuilder resultado = new StringBuilder();
        
        for(int i = 0; i <= identifier.length() - 1; i++){
            if(Character.isISOControl(identifier.charAt(i))){
                resultado.append("CTRL");
            } else if(Character.isWhitespace(identifier.charAt(i))){
                resultado.append("_");
            }else if(identifier.charAt(i) == '-'){
                if(Character.isLetter(identifier.charAt(++i)) == false){
                   resultado.append(""); 
                } else {
                resultado.append(Character.toUpperCase(identifier.charAt(i)));
                }
            } else if(Character.isLetter(identifier.charAt(i)) == false){
                resultado.append("");
            }else if(String.valueOf(identifier.charAt(i)).matches("[\\p{IsGreek}&&\\p{Ll}]")){
                resultado.append("");
            }else {
                char espacoOcupado = identifier.charAt(i);
                resultado.append(espacoOcupado);
            }
        }
        return resultado.toString();
    }

    public static String omitirLetrasGregas(String input) {
        // Usando regex para remover letras gregas (Unicode range para letras gregas
        // minúsculas e maiúsculas)
        String resultado = input.replaceAll("[\\p{InGreek}]", "");
        return resultado;
    }
}
