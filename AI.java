package student;
//Bilal Ahmed

public class AI {
    /**
     * This function picks the first card in the hand that is valid processing from left-to-right.
     * This function returns the cards/null, marking the card the AI will play.
     *
     * @param hand     the hand, full of cards the AI is allowed to play,
     * @param cardPile the cardPile that the AI is playing on
     * @return a Card object indicating the Card AI will play.
     * Can also return null, indicating the AI will not play a move.
     */
    public Card getPlay(Hand hand, CardPile cardPile) {
        for (int i = 0; i < hand.getSize(); i++) {
            if (cardPile.canPlay(hand.get(i))) {
                return hand.get(i);
            }
        }
        //AI will not play their turn if null is returned.
        return null;
    }

    /**
     * Get the name of the AI.
     *
     * @return String representing the name of the AI
     */
    @Override
    public String toString() {
        return "Random Card AI";
    }
}
