package visitor;

/**
 * Created by yoon on 15. 8. 15..
 */
public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
