package com.landon.chess.pieces;

import com.landon.chess.utils.Position;

public class Knight extends Piece {
    public Knight(Color color, Position p) {
        super(color, p);
    }

    @Override
    public String toString() {
        return "KNHT";
    }

    @Override
    public void possibleMoveNorth() {
        // Illegal move
        // throw new IllegalMovementException() from ChessException class;
    }
}
