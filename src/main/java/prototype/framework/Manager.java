package prototype.framework;

import java.util.HashMap;

/**
 * Created by yoon on 15. 8. 12..
 */
public class Manager {
    private HashMap showcase = new HashMap();

    public void register(String name, Product product) {
        showcase.put(name, product);
    }

    public Product create(String protoname) {
        Product product = (Product) showcase.get(protoname);
        return product.createClone();
    }
}
