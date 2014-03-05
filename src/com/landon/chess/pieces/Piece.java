package com.landon.chess.pieces;

public abstract class Piece {
    public Color color;

    public enum Color {
        BLACK, WHITE
    }

    public Piece(Color color) {
        this.color = color;
    }

    public abstract void move();

    public Color getColor() {
        return color;
    }
}
