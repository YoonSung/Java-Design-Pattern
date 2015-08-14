package abstractfactory.listfactory;

import abstractfactory.factory.Link;

/**
 * Created by yoon on 15. 8. 14..
 */
public class ListLink extends Link {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "  <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
