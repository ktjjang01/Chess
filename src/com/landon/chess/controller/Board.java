package com.landon.chess.controller;

import com.landon.chess.pieces.Bishop;
import com.landon.chess.pieces.King;
import com.landon.chess.pieces.Knight;
import com.landon.chess.pieces.Pawn;
import com.landon.chess.pieces.Piece;
import com.landon.chess.pieces.Queen;
import com.landon.chess.pieces.Rook;
import com.landon.chess.utils.Position;

public class Board {
    private Piece[][] board;

    public Board() {
        board = new Piece[8][8];

        init();
    }

    private void init() {
        for (int i = 0; i <= 7; i++) {
            board[1][i] = new Pawn(Piece.Color.BLACK, new Position(1, i));
            board[6][i] = new Pawn(Piece.Color.WHITE, new Position(6, i));
        }

        board[0][0] = new Rook(Piece.Color.BLACK, new Position(0, 0));
        board[0][7] = new Rook(Piece.Color.BLACK, new Position(0, 7));
        board[7][0] = new Rook(Piece.Color.WHITE, new Position(7, 0));
        board[7][7] = new Rook(Piece.Color.WHITE, new Position(7, 7));

        board[0][1] = new Knight(Piece.Color.BLACK, new Position(0, 1));
        board[0][6] = new Knight(Piece.Color.BLACK, new Position(0, 6));
        board[7][1] = new Knight(Piece.Color.WHITE, new Position(7, 1));
        board[7][6] = new Knight(Piece.Color.WHITE, new Position(7, 6));

        board[0][2] = new Bishop(Piece.Color.BLACK, new Position(0, 2));
        board[0][5] = new Bishop(Piece.Color.BLACK, new Position(0, 5));
        board[7][2] = new Bishop(Piece.Color.WHITE, new Position(7, 2));
        board[7][5] = new Bishop(Piece.Color.WHITE, new Position(7, 5));

        board[0][3] = new Queen(Piece.Color.BLACK, new Position(0, 3));
        board[7][3] = new Queen(Piece.Color.WHITE, new Position(7, 3));

        board[0][4] = new King(Piece.Color.BLACK, new Position(0, 4));
        board[7][4] = new King(Piece.Color.WHITE, new Position(7, 4));
    }

    public void printBoard() {
        System.out.println("-----------------------------------------");
        for (int i = 0; i <= 7; i++) {
            System.out.print("|");
            for (int j = 0; j <= 7; j++) {
                if (board[i][j] == null) {
                    System.out.format("%4s", " xx |"); //TODO: formatting
                } else {
                    System.out.format("%4s", board[i][j].toString() + "|");
                }
            }
            System.out.println();
            System.out.println("-----------------------------------------");
        }
    }

    public Piece[][] getBoard() {
        return board;
    }

    public Piece getPiece(Position p) {
        return board[p.getX()][p.getY()];
    }
}
