package Board;

import javax.swing.*;
import java.awt.*;

/**
 * Created by brianbenavides on 12/14/14.
 */
public class PlayArea extends JPanel
{
    public PlayArea()
    {

        initChildren();

        this.invalidate();

    }

    private void initChildren()
    {
        Board b = new Board(8,8);
        b.setBackground(Color.red);
        b.setMinimumSize(new Dimension(400,400));
        //b.setSize(900,900);
        this.add(b);
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.BLACK);
        //g.fillRect(0,0, 700,700);
    }
}
