package abstractfactory;

import abstractfactory.factory.Factory;
import abstractfactory.factory.Link;
import abstractfactory.factory.Page;
import abstractfactory.factory.Tray;
import org.junit.Test;

/**
 * Created by yoon on 15. 8. 14..
 */
public class AbstractFactory {

    @Test
    public void listfactory() {
        Factory factory = Factory.getFactory("abstractfactory.listfactory.ListFactory");
        create(factory);
    }

    @Test
    public void tablefactory() {
        Factory factory = Factory.getFactory("abstractfactory.tablefactory.TableFactory");
        create(factory);
    }

    private void create(Factory factory) {
        Link joins = factory.createLink("중앙일보", "http://www.joins.com/");
        Link hani = factory.createLink("조선일보", "http://www.hani.co.kr/");

        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
        Link kr_yahoo = factory.createLink("Yahoo!Korea", "http://www.yahoo.co.kr/");
        Link excite = factory.createLink("Excite", "http://www.excite.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");

        Tray traynews = factory.createTray("신문");
        traynews.add(joins);
        traynews.add(hani);

        Tray trayyahoo = factory.createTray("Yahoo!");
        trayyahoo.add(us_yahoo);
        trayyahoo.add(kr_yahoo);

        Tray traysearch = factory.createTray("검색엔진");
        traysearch.add(trayyahoo);
        traysearch.add(excite);
        traysearch.add(google);

        Page page = factory.createPage("LinkPage", "영진닷컴");
        page.add(traynews);
        page.add(traysearch);
        page.output();
    }
}
