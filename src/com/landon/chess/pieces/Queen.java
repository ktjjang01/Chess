package com.landon.chess.pieces;

import com.landon.chess.utils.ChessUtil;
import com.landon.chess.utils.Position;

public class Queen extends Piece {
    public Queen(Color color, Position p) {
        super(color, p);
    }

    @Override
    public String toString() {
        switch (this.color) {
        case BLACK:
            return "bQUEN";
        case WHITE:
            return "wQUEN";
        }
        return null;
    }

    @Override
    public void possibleMoveNorth() {
        Position destination = ChessUtil.getPositionNorth(curPosition);

        while (destination != null) {
            Piece p = curBoard.getBoard()[destination.getX()][destination.getY()];

            if (p == null) { // unoccupied
                possibleNxtMoves.put(destination, Action.MOVE);
            } else {
                if (p.getColor() != this.color) { // an enemy
                    possibleNxtMoves.put(destination, Action.ATTACK);
                }
                break;
            }

            destination = ChessUtil.getPositionNorth(destination);
        }
    }
}
