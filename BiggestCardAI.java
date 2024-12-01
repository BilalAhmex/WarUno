package student;

//Bilal Ahmed
public class BiggestCardAI extends AI {
    /**
     * This function picks the biggest-rank card in the hand that is valid.
     * This function returns the cards, marking the card the AI will play.
     *
     * @param hand     the hand, full of cards the AI is allowed to play,
     * @param cardPile the cardPile that the AI is playing on
     * @return a Card object indicating the Card AI will play.
     */
    @Override
    public Card getPlay(Hand hand, CardPile cardPile) {
        Card big = null;
        for (int i = 0; i < hand.getSize(); i++) {
            if (cardPile.canPlay(hand.get(i))) {
                if (big == null) {
                    big = hand.get(i);
                } else {
                    if (hand.get(i).getRankNum() > big.getRankNum()) {
                        big = hand.get(i);
                    }
                }
            }
        }

        return big;
    }

    /**
     * Get the name of the AI.
     *
     * @return String representing the name of the AI
     */
    @Override
    public String toString() {
        return "Biggest Card AI";
    }
}
