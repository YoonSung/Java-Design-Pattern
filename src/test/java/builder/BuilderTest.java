package builder;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yoon on 15. 8. 14..
 */
public class BuilderTest {
    @Test
    public void builderTest() {
        Director director = new Director(new TextBuilder());
        String result = (String)director.construct();
        System.out.println(result);

        Director director2 = new Director(new HTMLBuilder());
        String filename = (String)director2.construct();
        System.out.println(filename + "가 작성되었습니다.");
    }
}