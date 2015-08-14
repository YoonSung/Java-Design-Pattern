package abstractfactory.factory;

/**
 * Created by yoon on 15. 8. 14..
 */
public abstract class Item {
    protected String caption;
    public Item(String caption) {
        this.caption = caption;
    }
    public abstract String makeHTML();
}
