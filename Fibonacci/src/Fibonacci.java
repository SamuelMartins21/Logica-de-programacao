public class Fibonacci {

    public void sequênciaDeFibonnaci(int n) {
        int a = 0;
        int b = 1;
        int valor = 0;

        while (valor < n) {
            valor = a + b;
            a = b;
            b = valor;
        }
        if (n == valor) {
            System.out.println("Pertence a sequência de Fibonacci.");
        } else {
            System.out.println("Não pertence a sequência de Fibonacci.");
        }
    }

}
