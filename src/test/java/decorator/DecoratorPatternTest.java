package decorator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yoon on 15. 8. 15..
 */
public class DecoratorPatternTest {

    @Test
    public void test() {
        Display b1 = new StringDisplay("Hello, world.");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);
        b1.show();
        b2.show();
        b3.show();
        Display b4 =
                new SideBorder(
                        new FullBorder(
                                new FullBorder(
                                        new SideBorder(
                                                new FullBorder(
                                                        new StringDisplay("Hello")
                                                ),
                                                '*'
                                        )
                                )
                        ),
                        '/'
                );
        b4.show();
    }

}