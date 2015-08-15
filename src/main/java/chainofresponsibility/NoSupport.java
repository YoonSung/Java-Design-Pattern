package chainofresponsibility;

/**
 * Created by yoon on 15. 8. 15..
 */
public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
