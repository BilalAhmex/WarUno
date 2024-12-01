package student;

//Bilal Ahmed
public class UnoWarMatch {
    /**
     * Variable representing the first AI player.
     */
    private final AI ai1;
    /**
     * Variable representing the second AI player.
     */
    private final AI ai2;

    /**
     * Initializes a UnoWar Match against two AI bots.
     *
     * @param ai1 the first AI player
     * @param ai2 the second AI player
     */
    public UnoWarMatch(AI ai1, AI ai2) {

        this.ai1 = ai1;
        this.ai2 = ai2;
    }

    /**
     * Plays a Uno-War game against the 2 AI player's. Whoever win's 10 rounds wins.
     *
     * @return a boolean represernting whether true if ai1 wins, and false if ai2 wins
     */
    public boolean playGame() {
        /* RULES
            1. Shuffle the deck of cards
            2. Deal two 5-card hands two player 1 and player 2
            3. Player 1 plays first in the first round
            4. while no player has won 10 rounds play one round:
                (a) deal a card to start the card pile in the middle
                (b) Starting with player 1 in the first round, or whoever won the last round in all other
                    rounds, players take turns picking who goes first.
                (c) if a player has no legal cards, that player loses the round, and the other player wins.
                    The other player will have to go first next round.
                (d) Discard the card pile in the middle.
            5. Whoever won 10 rounds is the winner of the game!

         */


        Deck deckOfCards = new Deck();
        //AI 1 hand
        Hand aiHand1 = new Hand(deckOfCards, 5);
        //AI 2 hand
        Hand aiHand2 = new Hand(deckOfCards, 5);
        //AI 1 points
        int aiPoints1 = 0;
        //AI 2 points
        int aiPoints2 = 0;


        //Player one starts first
        int currentPlayer = 1;
        boolean roundDone = false;

        while (aiPoints1 != 10 && aiPoints2 != 10) {
            CardPile cardPile = new CardPile(deckOfCards.draw());


            while (!roundDone) {
                if (currentPlayer == 1) {
                    Card ai1card = ai1.getPlay(aiHand1, cardPile);
                    //Checks if player 1 AI has no valid card
                    if (ai1card == null) {
                        //Game ends
                        aiPoints2 += 1;
                        //Player 2 starts next game
                        currentPlayer = 2;


                        roundDone = true;

                    } else {
                        //player 1 AI plays card
                        cardPile.play(ai1card);
                        aiHand1.remove(ai1card);
                        currentPlayer = 2;
                    }
                } else {
                    Card ai2card = ai2.getPlay(aiHand2, cardPile);
                    //Checks if player 2 AI has no valid card.
                    if (ai2card == null) {
                        //Game ends

                        aiPoints1 += 1;
                        //Player 1 starts next game
                        currentPlayer = 1;
                        roundDone = true;
                    } else {
                        //AI2 plays a card
                        cardPile.play(ai2card);
                        aiHand2.remove(ai2card);
                        currentPlayer = 1;
                    }
                }


            }
            //Start over the round
            roundDone = false;
        }

        return aiPoints1 == 10;
    }

    /**
     * This method has the AIs play each other nTrials times.
     *
     * @param nTrials int representing the number of trials the games will be played.
     * @return a double representing the percent of times AI 1 wins against AI 2
     */
    public double winRate(int nTrials) {
        int ai1 = 0;
        for (int i = 0; i < nTrials; i++) {
            if (playGame()) {
                ai1 += 1;
            }
        }

        return ((ai1 / (double) nTrials));

    }
}
