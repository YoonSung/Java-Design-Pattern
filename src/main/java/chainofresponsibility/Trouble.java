package chainofresponsibility;

/**
 * Created by yoon on 15. 8. 15..
 */
public class Trouble {
    private int number;
    public Trouble(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String toString() {
        return "[Trouble " + number + "]";
    }
}
