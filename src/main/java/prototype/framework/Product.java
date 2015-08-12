package prototype.framework;

/**
 * Created by yoon on 15. 8. 12..
 */
public interface Product extends Cloneable {
    void use(String s);
    Product createClone();
}