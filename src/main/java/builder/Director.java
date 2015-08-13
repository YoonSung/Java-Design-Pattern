package builder;

/**
 * Created by yoon on 15. 8. 14..
 */
public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }

    public Object construct() {
        builder.makeTitle("Greeting");
        builder.makeString("아침과 낮에");
        builder.makeItems(new String[]{
                "좋은 아침입니다.",
                "안녕하세요."
        });
        builder.makeString("밤에");
        builder.makeItems(new String[] {
                "안녕하세요",
                "안녕히 주무세요",
                "안녕히 계세요"
        });

        //builder.close();
        return builder.getResult();
    }
}
