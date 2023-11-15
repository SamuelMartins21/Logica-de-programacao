public class App {
    public static void main(String[] args) throws Exception {
        MontagemCarros teste = new MontagemCarros();
        double retorno = teste.productionRatePerHour(7);
        System.out.println(retorno);
    }
}
