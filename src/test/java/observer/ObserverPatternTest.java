package observer;

import org.junit.Test;

/**
 * Created by yoon on 15. 8. 15..
 */
public class ObserverPatternTest {

    @Test
    public void test() {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();
    }
}