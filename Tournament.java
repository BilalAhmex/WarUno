package student;
//Bilal Ahmed

public class Tournament {
    /**
     * The main method prints all the possible win rate of every pair of AIs (9 in total).
     *
     * @param args command-line args -- not used
     */
    public static void main(String[] args) {
        AI randomAI = new AI();
        AI smallAI = new SmallestCardAI();
        AI bigAI = new BiggestCardAI();
        //Can use nTrial of 1000 or higher, I chose 100000 nTrials (to further reduce random chance).

        System.out.println(randomAI + " vs. " + randomAI + " winRate: " + new UnoWarMatch(randomAI, randomAI).winRate(100000));
        System.out.println(randomAI + " vs. " + smallAI + " winRate: " + new UnoWarMatch(randomAI, smallAI).winRate(100000));
        System.out.println(randomAI + " vs. " + bigAI + " winRate: " + new UnoWarMatch(randomAI, bigAI).winRate(100000));

        System.out.println(smallAI + " vs. " + randomAI + " winRate: " + new UnoWarMatch(smallAI, randomAI).winRate(100000));
        System.out.println(smallAI + " vs. " + smallAI + " winRate: " + new UnoWarMatch(smallAI, smallAI).winRate(100000));
        System.out.println(smallAI + " vs. " + bigAI + " winRate: " + new UnoWarMatch(smallAI, bigAI).winRate(100000));

        System.out.println(bigAI + " vs. " + randomAI + " winRate: " + new UnoWarMatch(bigAI, randomAI).winRate(100000));
        System.out.println(bigAI + " vs. " + smallAI + " winRate: " + new UnoWarMatch(bigAI, smallAI).winRate(100000));
        System.out.println(bigAI + " vs. " + bigAI + " winRate: " + new UnoWarMatch(bigAI, bigAI).winRate(100000));

    }

}