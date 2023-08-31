public class App {
    public static void main(String[] args) throws Exception {
        Encurtador1 encurtador = new Encurtador1();
        System.out.println(encurtador.truncate("exemplo de String"));

        Teste1 teste1 = new Teste1();
        System.out.println(teste1.truncate("\u2744\u1F321\u1F927\u1F912\u1F3E5\u1F570\u1F600"));

    }

    }

