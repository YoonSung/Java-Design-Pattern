package adapter;

import org.junit.Test;

/**
 * Created by yoon on 15. 8. 12..
 */
public class PrintBannerTest {
    @Test
    public void type1() {
        adapter.type1.Print print = new adapter.type1.PrintBanner("Hello");
        print.printWeak();
        print.printStrong();
    }

    @Test
    public void type2() {
        adapter.type2.Print print = new adapter.type2.PrintBanner("Hello");
        print.printWeak();
        print.printStrong();
    }
}