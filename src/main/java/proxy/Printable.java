package proxy;

/**
 * Created by yoon on 15. 8. 15..
 */
public interface Printable {
    void setPrinterName(String name);
    String getPrinterName();
    void print(String string);
}
