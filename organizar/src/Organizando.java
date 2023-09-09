public class Organizando {

    public static String arrange(String sentence){
        String c = "";
        String [] separaStrings = sentence.split(" ");
        for(int cc = 0; cc <= separaStrings.length; cc++){
            if(separaStrings[cc].length() == separaStrings[cc+1].length() ){
            c = c + separaStrings[cc] + " ";
            } else if(separaStrings[cc].length() < separaStrings[cc++].length()){
                c = c + separaStrings[cc] + " ";
            }
        }
        return c;
    }
}
