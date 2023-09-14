public class App {
    public static void main(String[] args) throws Exception {
        Blackjack jogo = new Blackjack();
        
        System.out.println(jogo.firstTurn("ace", "king", "queen"));
    }
}
