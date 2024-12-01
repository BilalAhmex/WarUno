package student;

//Bilal Ahmed
public final class CardPile {
    /**
     * Variable representing the top card in the card pile.
     */
    private Card topCard;
    /**
     * The variable keeping track of the number of cards in the card pile.
     */
    private int cardsInCardPile;

    /**
     * Initializes a representation of the pile of cards that players play with.
     *
     * @param topCard the initial card that will be in the pile.
     */
    public CardPile(Card topCard) {
        this.topCard = topCard;
        this.cardsInCardPile = 1;
    }

    /**
     * Checks if the input card is legal to play on the current stack.
     *
     * @param card card object representing the card that could be played.
     * @return a boolean value returning whether the input card is legal to play or not.
     */
    public boolean canPlay(Card card) {
        //Can only play when a card is higher rank or same rank than the current top card
        //Or if it has a same suit as the current top card
        if (card == null) {
            return false;
        } else {
            if (((card.getRankNum() >= this.topCard.getRankNum()) || (card.getSuitNum() == this.topCard.getSuitNum()))) {
                return true;
            }
            return false;
        }

    }

    /**
     * Plays a card to the card pile, making the input card the new top card.
     * Checks if the card is valid, else prints an error message.
     *
     * @param card card object representing the card that will be played.
     */
    public void play(Card card) {
        if (canPlay(card)) {
            this.topCard = card;
            this.cardsInCardPile += 1;
        } else {
            System.out.println("Illegal move detected!");
        }
    }

    /**
     * Get the number of cards in the pile.
     *
     * @return int representing the number of cards in the pile
     */
    public int getNumCards() {
        return this.cardsInCardPile;
    }

    /**
     * Get the top card in the pile.
     *
     * @return card object representing the top card.
     */
    public Card getTopCard() {

        return this.topCard;
    }

}
