package factorymethod.framework;

/**
 * Created by yoon on 15. 8. 12..
 */
public abstract class Factory {
    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product owner);
}
