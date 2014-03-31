package com.landon.chess.pieces;

import com.landon.chess.utils.Position;

public class King extends Piece {
    public King(Color color, Position p) {
        super(color, p);
    }

    @Override
    public String toString() {
        switch (this.color) {
        case BLACK:
            return "bKING";
        case WHITE:
            return "wKING";
        }
        return null;
    }

    @Override
    public void possibleMoveNorth() {
        // TODO Auto-generated method stub
    }
}
