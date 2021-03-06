package strategy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yoon on 15. 8. 14..
 */
public class StrategyPatternTest {

    @Test
    public void test() {
        int seed1 = 314;
        int seed2 = 15;

        Player player1 = new Player("두리", new WinningStrategy(seed1));
        Player player2 = new Player("하나", new ProbStrategy(seed2));

        for (int i = 0; i < 10000; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();

            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner : "+player1);
                player1.win();
                player2.lose();
            } else if (nextHand2.isStrongerThan(nextHand1)) {
                System.out.println("Winner:" + player2);
                player1.lose();
                player2.win();
            } else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }

        System.out.println("Total result:");
        System.out.println("" + player1);
        System.out.println("" + player2);

    }
}