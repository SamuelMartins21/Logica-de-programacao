public class FaturamentoMensalDistribuidora {

    private float sp = 67.83643f;
    private float rj = 36.67866f;
    private float mg = 29.22988f;
    private float es = 27.16548f;
    private float out = 19.84953f;

    public void faturamentoPersentualDeCadaEstado() {
        float total = sp + rj + mg + es + out;

        float percentualSP = ((sp / total) * 100);
        float percentualRJ = ((rj / total) * 100);
        float percentualMG = ((mg / total) * 100);
        float percentualES = ((es / total) * 100);
        float percentualOUT = ((out / total) * 100);

        System.out.println("--------------------");
        System.out.println("Porcentagem de SP: " + percentualSP);
        System.out.println("Porcentagem de RJ: " + percentualRJ);
        System.out.println("Porcentagem de MG: " + percentualMG);
        System.out.println("Porcentagem de ES: " + percentualES);
        System.out.println("Porcentagem de OUT: " + percentualOUT);
        System.out.println("-----------------------");

    }

}
