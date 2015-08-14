package strategy;

/**
 * Created by yoon on 15. 8. 14..
 */
public interface Strategy {
    Hand nextHand();
    void study(boolean win);
}
