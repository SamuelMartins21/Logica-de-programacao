public class App {
    public static void main(String[] args) throws Exception {
        FaturamentoMensal faturamentoMensal = new FaturamentoMensal();
        int n[] = {3,5,8,6};
        System.out.println("Menor faturamento " + faturamentoMensal.menorFaturamento(n));
        System.out.println("Maior faturamento " + faturamentoMensal.maiorFaturamento(n));
        faturamentoMensal.diasSuperioresAMediaMensal(n);
    }
}
