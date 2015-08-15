package command.drawer;

import command.command.Command;

import java.awt.*;

/**
 * Created by yoon on 15. 8. 15..
 */
public class DrawCommand implements Command {

    protected Drawable drawable;

    private Point position;

    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
