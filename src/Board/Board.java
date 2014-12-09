package Board;

import java.util.ArrayList;

/**
 * Created by brianbenavides on 12/9/14.
 */
public class Board {

    private ArrayList<Space> boardSpaces = new ArrayList<Space>();

    public Board(int rows, int columns)
    {

    }

    private void  initializeBoard(int x, int y)
    {
        for(int i = 0; i < x; i++)
        {
            for(int j = 0; j < y; j++)
            {
                boardSpaces.add(new Space(x, y));
            }
        }
    }
}
