package Board;

import Pieces.GamePiece;

import java.util.ArrayList;

/**
 * Created by brianbenavides on 12/9/14.
 */
public class Space {

    private GamePiece pieceOnSpace;
    private boolean isOccupied;
    private int row;
    private int column;

    public Space(int row, int column)
    {
        this.row = row;
        this.column = column;
        this.isOccupied = false;
        pieceOnSpace = null;
    }

    public int getRow()
    {
        return row;
    }

    public int getColumn()
    {
        return column;
    }
}
