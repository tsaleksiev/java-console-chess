package Pieces.MoveEngine;

import BoardEngine.Board;
import BoardEngine.BoardPrinter;
import Pieces.Piece;

public class MoveEngine {
    public static void movePiece(int colFrom, int rowFrom, int colTo, int rowTo) {
        Piece piece = Board.getBoard()[colFrom][rowFrom]
                .getPiece();
        //To-Do
        piece.setColIndex(colTo);
        piece.setRowIndex(rowTo);
        BoardPrinter.printBoard(Board.getBoard());
    }
}
