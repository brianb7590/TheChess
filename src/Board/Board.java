package Board;


import javax.swing.*;
import java.awt.*;

/**
 * Created by brianbenavides on 12/9/14.
 */
public class Board extends JPanel{

    private Space[][] boardSpaces;
    private int boardRows;
    private int boardColumns;

    public Board(int rows, int columns)
    {
        //boardSpaces = new Space[rows][columns];
        //initializeBoard(rows, columns);
    }

    public void paint(Graphics g)
    {
        super.paint(g);

        g.setColor(Color.CYAN);
        g.fillRect(0,0,5,5);
    }

    private void initializeBoard(int x, int y)
    {
        for(int i = 0; i < x; i++)
        {
            for(int j = 0; j < y; j++)
            {
                boardSpaces[i][j] = new Space(x, y);
                //this.add(boardSpaces[i][j]);
            }
        }
    }

    public Space getSpaceAt(int row, int column)
    {
        if(row > boardRows || column > boardColumns)
        {//Possibly throw custom exception
            return null;
        }
        else
        {
            return boardSpaces[row-1][column-1];
        }
    }

    public int getBoardRows()
    {
        return boardRows;
    }

    public int getBoardColumns()
    {
        return boardColumns;
    }
}
