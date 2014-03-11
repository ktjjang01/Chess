package com.landon.chess.utils;

public class ChessUtil {
    public static boolean insideOfBoard(Position p) {
        int x = p.getX();
        int y = p.getY();

        return x >= 0 && x < 8 && y >= 0 && y < 8;
    }

    //TODO: Refactor somehow?
    public static Position getPositionNorth(Position p) {
        Position target = new Position(p.getX(), p.getY() - 1);
        if (insideOfBoard(target)) return target;

        return null;
    }

    public static Position getPositionSouth(Position p) {
        Position target = new Position(p.getX(), p.getY() + 1);
        if (insideOfBoard(target)) return target;

        return null;
    }

    public static Position getPositionEast(Position p) {
        Position target = new Position(p.getX() + 1, p.getY());
        if (insideOfBoard(target)) return target;

        return null;
    }

    public static Position getPossitionWest(Position p) {
        Position target = new Position(p.getX() - 1, p.getY());
        if (insideOfBoard(target)) return target;

        return null;
    }

    public static Position getPositionNorthWest(Position p) {
        Position target = new Position(p.getX() - 1, p.getY() - 1);
        if (insideOfBoard(target)) return target;

        return null;
    }

    public static Position getPositionNorthEast(Position p) {
        Position target = new Position(p.getX() + 1, p.getY() - 1);
        if (insideOfBoard(target)) return target;

        return null;
    }

    public static Position getPositionSouthWest(Position p) {
        Position target = new Position(p.getX() - 1, p.getY() + 1);
        if (insideOfBoard(target)) return target;

        return null;
    }

    public static Position getPositionSouthEast(Position p) {
        Position target = new Position(p.getX() + 1, p.getY() + 1);
        if (insideOfBoard(target)) return target;

        return null;
    }
}
