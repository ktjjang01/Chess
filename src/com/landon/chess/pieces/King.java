package com.landon.chess.pieces;

import com.landon.chess.utils.Position;

public class King extends Piece {
    public King(Color color, Position p) {
        super(color, p);
    }

    @Override
    public String toString() {
        return "KING";
    }

    @Override
    public void possibleMoveNorth() {
        // TODO Auto-generated method stub
    }
}
