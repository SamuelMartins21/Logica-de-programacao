

public class Encurtador1 {

    public String truncate(String input) {
        if(input.length() <= 5){
            return input;
        } else {
            String input2 = input.substring(0, 5);
            return input2;
        }
    }
}
