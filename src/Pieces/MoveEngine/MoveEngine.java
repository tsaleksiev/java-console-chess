package Pieces.MoveEngine;

import BoardEngine.Board;
import BoardEngine.BoardBuilder;
import BoardEngine.BoardPrinter;
import Pieces.Piece;

public class MoveEngine {
    public static void movePiece(int colFrom, int rowFrom, int colTo, int rowTo) {
        Piece piece = Board.getBoard()[colFrom][rowFrom]
                .getPiece();
        piece.setColRowIndex(colTo, rowTo);
        Board.getBoard()[colTo][rowTo].setPiece(piece);
        Board.getBoard()[colFrom][rowFrom].setPiece(null);
        BoardPrinter.printBoard(Board.getBoard());
    }
}
