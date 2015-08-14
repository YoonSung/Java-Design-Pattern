package abstractfactory.factory;

import java.util.Vector;

/**
 * Created by yoon on 15. 8. 14..
 */
public abstract class Tray extends Item {

    protected Vector tray = new Vector();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}
