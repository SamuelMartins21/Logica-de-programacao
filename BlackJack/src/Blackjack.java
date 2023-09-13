public class Blackjack {

    public int parseCard(String card) {
        int resultado;
        String cardMin = card.toLowerCase();
        if(cardMin.equals("ace")){
            resultado = 11;
        } else if (cardMin.equals("two")){
            resultado = 2;
        } else if (cardMin.equals("three")){
            resultado = 3;
        } else if (cardMin.equals("four")){
            resultado = 4;
        } else if (cardMin.equals("five")){
            resultado = 5;
        } else if (cardMin.equals("six")){
            resultado = 6;
        } else if (cardMin.equals("seven")){
            resultado = 7;
        } else if (cardMin.equals("eight")){
            resultado = 8;
        } else if (cardMin.equals("nine")){
            resultado = 9;
        } else if (cardMin.equals("ten") || cardMin.equals("queen") || cardMin.equals("king") || cardMin.equals("jack") ){
            resultado = 10;
        } else {
            resultado = 0;
        }
        return resultado;
    }

    public boolean isBlackjack(String card1, String card2) {
        int cardInt1 = parseCard(card1);
        int cardInt2 = parseCard(card2);
        if(cardInt1 + cardInt2 == 21){
            return true;
        } else{
            return false;
        }
    }

    public String largeHand(, int dealerScore) {
        if(isBlackjack == isBlackjack("ace", "ace")){
            return "P";
        } else if(isBlackjack == true && (dealerScore != 11 || dealerScore != 10)){
            return "W";
        } else {
            return "S";
        }
    }

    public String smallHand(int handScore, int dealerScore) {
        if(handScore >= 17){
            return "S";
        } else if(handScore <= 11){
            return "H";
        } else if(dealerScore >= 7){
            return "H";
        } else{
            return "S";
        }
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the
    // cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls
    // the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
