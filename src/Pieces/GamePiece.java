package Pieces;

/**
 * Created by brianbenavides on 12/8/14.
 */
public interface GamePiece {

    public boolean canMove();

    public void moveTo(int x, int y);

    public boolean getPieceName();

    public boolean getId();

}
