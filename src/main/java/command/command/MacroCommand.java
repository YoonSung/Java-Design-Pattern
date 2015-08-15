package command.command;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by yoon on 15. 8. 15..
 */
public class MacroCommand implements Command {

    private Stack commands = new Stack();

    public void execute() {
        Iterator it = commands.iterator();
        while (it.hasNext()) {
            ((Command)it.next()).execute();
        }
    }

    public void append(Command cmd) {
        //무한재귀호출이 발생하지 않도록 하기 위해
        if (cmd != this) {
            commands.push(cmd);
        }
    }

    public void undo() {
        if (!commands.empty()) {
            commands.pop();
        }
    }

    public void clear() {
        commands.clear();
    }
}
