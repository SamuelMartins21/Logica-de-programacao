public class Blackjack {

    public int parseCard(String card) {
        int resultado;
        String cardMin = card.toLowerCase();
        switch (cardMin) {
            case "ace":
                resultado = 11;
                break;
            case "two":
                resultado = 2;
                break;
            case "three":
                resultado = 3;
                break;
            case "four":
                resultado = 4;
                break;
            case "five":
                resultado = 5;
                break;
            case "six":
                resultado = 6;
                break;
            case "seven":
                resultado = 7;
                break;
            case "eight":
                resultado = 8;
                break;
            case "nine":
                resultado = 9;
                break;
            case "ten":
            case "queen":
            case "king":
            case "jack":
                resultado = 10;
                break;
            default:
                resultado = 0;
        }
        return resultado;
    }

    public boolean isBlackjack(String card1, String card2) {
        int cardInt1 = parseCard(card1);
        int cardInt2 = parseCard(card2);
        return (cardInt1 + cardInt2 == 21);
    }

    public String largeHand( boolean isBlackjack , int dealerScore) {
        if(isBlackjack == false){
            return "P";
        } else if(isBlackjack == true && (dealerScore != 11 && dealerScore != 10)){
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
