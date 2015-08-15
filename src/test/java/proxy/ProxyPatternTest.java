package proxy;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by yoon on 15. 8. 15..
 */
public class ProxyPatternTest {

    @Test
    public void test() {
        Printable p = new PrinterProxy("Alice");
        System.out.println("이름은 현재 " + p.getPrinterName() + "입니다.");
        p.setPrinterName("Bob");
        System.out.println("이름은 현재 " + p.getPrinterName() + "입니다.");
        p.print("Hello, world.");
    }
}