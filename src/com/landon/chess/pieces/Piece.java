package com.landon.chess.pieces;

import java.util.HashMap;
import java.util.Map;

import com.landon.chess.controller.Board;
import com.landon.chess.exceptions.IllegalMovementException;
import com.landon.chess.utils.Position;

public abstract class Piece {
    public Color color;
    public Position curPosition;
    public Board curBoard;

    protected Map<Position, Action> possibleNxtMoves; 

    public enum Color {
        BLACK, WHITE
    }

    public enum Action {
        MOVE, ATTACK
    }

    public Piece(Color color, Position p) {
        this.color = color;
        curPosition = p;
        possibleNxtMoves = new HashMap<Position, Piece.Action>();
    }

    public abstract void possibleMoveNorth() throws IllegalMovementException;

    public Color getColor() {
        return color;
    }

    public Map<Position, Action> getPossibleNxtMoves() {
        return possibleNxtMoves;
    }
}
