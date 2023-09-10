public class App {
    public static void main(String[] args) throws Exception {
       String a = Muitolimpo.clean("My\u039F\u03B2\u03B9\u03B5\u03B3\u03C4Finder");
       System.out.println(a);


       String b = Muitolimpo.omitirLetrasGregas("Este é um exemplo com letras gregas: αβγδεΑΒΓΔΕ");

       System.out.println(b);
    }
}
