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
        //this.getContentPane().setLayout(new FlowLayout());
        initChildren();
    }

    private void initChildren()
    {
        PlayArea pa = new PlayArea();
        pa.setSize(700,700);
        this.getContentPane().add(pa);

        //GameControl gc = new GameControl();
        //this.getContentPane().add(gc, BorderLayout.EAST);
    }
}
