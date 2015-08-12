package factorymethod.idcard;

import factorymethod.framework.Product;

/**
 * Created by yoon on 15. 8. 12..
 */
public class IDCard extends Product {
    @Override
    public void use() {
        System.out.println(owner + "의 카드를 사용합니다");
    }

    private String owner;

    IDCard(String owner) {
        System.out.println(owner + "의 카드를 만듭니다");
        this.owner = owner;
    }
    public String getOwner() {
        return owner;
    }
}
