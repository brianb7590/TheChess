import Board.PlayArea;

import javax.swing.*;
import java.awt.*;

/**
 * Created by brianbenavides on 12/14/14.
 */
public class MainWindow extends JFrame
{
    public MainWindow(String title)
    {
        this.setTitle(title);
        this.getContentPane().setLayout(new FlowLayout());
        initChildren();
    }

    private void initChildren()
    {
        PlayArea pa = new PlayArea();
        pa.setMinimumSize(new Dimension(700,800));
        this.getContentPane().add(pa);

        PlayArea pa2 = new PlayArea();
        pa2.setMinimumSize(new Dimension(100,800));
        this.getContentPane().add(pa2);

        //GameControl gc = new GameControl();
        //this.getContentPane().add(gc, BorderLayout.EAST);
    }
}
