public class InversorDeStrings {
    private char ch;
    private String nstr = "";

    public void inversor(String a){
        for (int i=0; i<a.length(); i++)
      {
        ch= a.charAt(i); 
        nstr= ch+nstr;
      }
      System.out.println("String Invertida: "+ nstr);
      System.out.println("-----------------------");
    }
}
