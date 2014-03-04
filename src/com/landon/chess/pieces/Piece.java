package com.landon.chess.pieces;

public abstract class Piece {
    public enum Color {
        BLACK, WHITE
    }

    public Piece(Color color) {
        this.color = color;
    }

    public Color color;

    public abstract void move();

}
