package flyweight;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by yoon on 15. 8. 15..
 */
public class FlyweightPatternTest {

    @Test
    public void test() {
        BigString bs = new BigString("-1234567890");
        bs.print();
    }
}