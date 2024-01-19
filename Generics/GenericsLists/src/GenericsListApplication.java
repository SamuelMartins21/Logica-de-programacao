public class GenericsListApplication {
    public static void main(String[] args) throws Exception {
        LanguageList lista = new LanguageList();
        System.out.println(lista.isEmpty());
        lista.addLanguage("samuel");
        System.out.println(lista.isEmpty());
        lista.addLanguage("raissa");
        lista.addLanguage("marcio");
        lista.addLanguage("eusebio");
        //lista.addLanguage("Java");
        lista.removeLanguage("samuel");
        System.out.println(lista.firstLanguage());
        System.out.println(lista.count());
        System.out.println(lista.containsLanguage("caio"));
        System.out.println(lista.containsLanguage("raissa"));
        System.out.println(lista.isExciting());
    }
}
