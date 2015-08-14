package abstractfactory.factory;

/**
 * Created by yoon on 15. 8. 14..
 */
public abstract class Link extends Item {
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
