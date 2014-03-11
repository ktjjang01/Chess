package com.landon.chess.pieces;

import com.landon.chess.utils.Position;

public class Pawn extends Piece {
    public Pawn(Color color, Position p) {
        super(color, p);
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub
    }

    @Override
    public String toString() {
        return "PAWN";
    }
}
