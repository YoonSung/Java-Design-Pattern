package factorymethod.idcard;

import factorymethod.framework.Factory;
import factorymethod.framework.Product;

import java.util.Vector;

/**
 * Created by yoon on 15. 8. 12..
 */
public class IDCardFactory extends Factory {

    private Vector owners = new Vector();

    public Vector getOwners() {
        return owners;
    }

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }
}
