package abstractfactory.tablefactory;

import abstractfactory.factory.Link;

/**
 * Created by yoon on 15. 8. 14..
 */
public class TableLink extends Link {
    public TableLink(String caption, String url) {
        super(caption, url);
    }
    public String makeHTML() {
        return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
    }
}
