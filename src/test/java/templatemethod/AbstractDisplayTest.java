package templatemethod;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yoon on 15. 8. 12..
 */
public class AbstractDisplayTest {
    @Test
    public void display() {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello, World");

        d1.display();
        d2.display();
    }
}