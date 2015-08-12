package adapter.type1;

import adapter.Banner;

/**
 * Created by yoon on 15. 8. 12..
 */
// Adapter ROLE, Type1 (Use Extend)
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    public void printWeak() {
        showWithParen();
    }

    public void printStrong() {
        showWithAster();
    }
}
