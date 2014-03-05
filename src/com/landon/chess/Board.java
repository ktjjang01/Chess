package com.landon.chess;

import com.landon.chess.pieces.Bishop;
import com.landon.chess.pieces.King;
import com.landon.chess.pieces.Knight;
import com.landon.chess.pieces.Pawn;
import com.landon.chess.pieces.Piece;
import com.landon.chess.pieces.Queen;
import com.landon.chess.pieces.Rook;

public class Board {
    Piece[][] board;

    public Board() {
        board = new Piece[8][8];

        init();
    }

    private void init() {
        for (int i = 0; i <= 7; i++) {
            board[1][i] = new Pawn(Piece.Color.BLACK);
            board[6][i] = new Pawn(Piece.Color.WHITE);
        }

        board[0][0] = new Rook(Piece.Color.BLACK);
        board[0][7] = new Rook(Piece.Color.BLACK);
        board[7][0] = new Rook(Piece.Color.WHITE);
        board[7][7] = new Rook(Piece.Color.WHITE);

        board[0][1] = new Knight(Piece.Color.BLACK);
        board[0][6] = new Knight(Piece.Color.BLACK);
        board[7][1] = new Knight(Piece.Color.WHITE);
        board[7][6] = new Knight(Piece.Color.WHITE);

        board[0][2] = new Bishop(Piece.Color.BLACK);
        board[0][5] = new Bishop(Piece.Color.BLACK);
        board[7][2] = new Bishop(Piece.Color.WHITE);
        board[7][5] = new Bishop(Piece.Color.WHITE);

        board[0][3] = new Queen(Piece.Color.BLACK);
        board[7][3] = new Queen(Piece.Color.WHITE);

        board[0][4] = new King(Piece.Color.BLACK);
        board[7][4] = new King(Piece.Color.WHITE);
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
}
