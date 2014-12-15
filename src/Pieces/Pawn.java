package Pieces;

import javax.swing.*;

/**
 * Created by brianbenavides on 12/9/14.
 */
public class Pawn extends JComponent implements GamePiece {

    @Override
    public boolean canMove() {
        return false;
    }

    @Override
    public void moveTo(int x, int y) {
    }

    @Override
    public boolean getPieceName() {
        return false;
    }

    @Override
    public boolean getId() {
        return false;
    }
}
