package decorator;

/**
 * Created by yoon on 15. 8. 15..
 */
public abstract class Border extends Display {
    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }
}
