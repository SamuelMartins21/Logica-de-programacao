public class FaturamentoMensal {
    private int maior;
    private int menor;
    private int media;

    public int maiorFaturamento(int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            if (maior < vetor[i]) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    public int menorFaturamento(int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            menor = vetor[0];
            if (menor > vetor[i]) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    public void diasSuperioresAMediaMensal(int vetor[]) {
        int smt = 0;
        for (int i = 0; i < vetor.length; i++) {
            smt = smt + vetor[i];
        }
        media = smt / vetor.length;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > media) {
                System.out.println("Maior que a média " + vetor[i]);
            }
        }
    }
}
