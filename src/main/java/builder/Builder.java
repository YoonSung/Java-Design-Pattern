package builder;

/**
 * Created by yoon on 15. 8. 14..
 */
public abstract class Builder {
    abstract void makeTitle(String title);
    abstract void makeString(String string);
    abstract void makeItems(String[] items);
    abstract Object getResult();
}
