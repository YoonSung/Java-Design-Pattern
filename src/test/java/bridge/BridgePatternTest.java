package bridge;

import org.junit.Test;

/**
 * Created by yoon on 15. 8. 14..
 */
public class BridgePatternTest {
    @Test
    public void test() {
        Display d1 = new Display(new StringDisplayImpl("Hello, Korea."));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));

        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));

        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }
}