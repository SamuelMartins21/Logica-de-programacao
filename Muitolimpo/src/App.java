public class App {
    public static void main(String[] args) throws Exception {
       String a = Muitolimpo.clean("my\0\r\u007FId");
       System.out.println(a);
    }
}
