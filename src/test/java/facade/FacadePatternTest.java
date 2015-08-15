package facade;

import facade.pagemaker.PageMaker;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yoon on 15. 8. 15..
 */
public class FacadePatternTest {

    @Test
    public void test() {
        PageMaker.makeWelcomePage("a1@yoonsung.com", "welcome.html");
    }
}