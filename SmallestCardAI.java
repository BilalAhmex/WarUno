package student;

//Bilal Ahmed
public class SmallestCardAI extends AI {
    /**
     * This function picks the smallest card in the hand that is valid.
     * This function returns the cards, marking the card the AI will play.
     *
     * @param hand     the hand, full of cards the AI is allowed to play,
     * @param cardPile the cardPile that the AI is playing on
     * @return a Card object indicating the Card AI will play.
     */
    @Override
    public Card getPlay(Hand hand, CardPile cardPile) {
        Card small = null;
        for (int i = 0; i < hand.getSize(); i++) {
            if (cardPile.canPlay(hand.get(i))) {
                if (small == null) {
                    small = hand.get(i);
                } else {
                    if (hand.get(i).getRankNum() < small.getRankNum()) {
                        small = hand.get(i);
                    }

                }

            }
        }

        return small;
    }

    /**
     * Get the name of the AI.
     *
     * @return String representing the name of the AI
     */
    @Override
    public String toString() {
        return "Smallest Card AI";
    }


}

