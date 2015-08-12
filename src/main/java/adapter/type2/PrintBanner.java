package adapter.type2;

import adapter.Banner;

/**
 * Created by yoon on 15. 8. 12..
 */
// Adapter ROLE, Type2 (Use Instance)
public class PrintBanner extends Print {

    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
