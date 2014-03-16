package com.landon.chess.pieces;

import com.landon.chess.utils.Position;

public class Bishop extends Piece {
    public Bishop(Color color, Position p) {
        super(color, p);
    }

    @Override
    public String toString() {
        return "BSHP";
    }

    @Override
    public void possibleMoveNorth() {
        // Illegal move
        // throw new IllegalMovementException() from ChessException class;
    }
}
