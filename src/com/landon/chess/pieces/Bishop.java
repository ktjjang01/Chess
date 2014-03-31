package com.landon.chess.pieces;

import com.landon.chess.exceptions.IllegalMovementException;
import com.landon.chess.utils.Position;

public class Bishop extends Piece {
    public Bishop(Color color, Position p) {
        super(color, p);
    }

    @Override
    public String toString() {
        switch (this.color) {
        case BLACK:
            return "bBISP";
        case WHITE:
            return "wBISP";
        }
        return null;
    }

    @Override
    public void possibleMoveNorth() throws IllegalMovementException {
        throw new IllegalMovementException(this.toString() + " cannot move North.");
    }
}
