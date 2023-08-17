public class ReverseString {
    private String revString = "";

    String reverse(String inputString) {
       for(int i = inputString.length() - 1; i >= 0; i--){
        revString += inputString.charAt(i);
       }
       return revString;
    }
}
