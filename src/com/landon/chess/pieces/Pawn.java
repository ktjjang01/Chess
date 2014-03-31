package com.landon.chess.pieces;

import com.landon.chess.utils.Position;

public class Pawn extends Piece {
    public Pawn(Color color, Position p) {
        super(color, p);
    }

    @Override
    public String toString() {
    	switch (this.color) {
		case BLACK:
			return "bPAWN";
		case WHITE:
			return "wPAWN";
        }
		return null;
    }

    @Override
    public void possibleMoveNorth() {
        // TODO Auto-generated method stub
    }
}
