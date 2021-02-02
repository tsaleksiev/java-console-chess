package BoardEngine;

import Pieces.*;
import Common.*;

import java.util.List;

public abstract class BoardBuilder {
    public static void setupBoard(Square[][] board) {
        addEmptySquares(board);

        Player wPlayer = new Player("Belousov",
                ChessColor.WHITE);
        Player bPlayer = new Player("Chernev",
                ChessColor.BLACK);

        populateBoard(board, wPlayer.getPieces());
        populateBoard(board, bPlayer.getPieces());
    }

    public static void populateBoard(Square[][] board,
                                      List<Piece> pieces) {
        for (int i = 0; i < pieces.size(); i++) {
            Piece curr = pieces.get(i);
            int col = curr.getColIndex();
            int row = curr.getRowIndex();
            board[col][row].setPiece(curr);
        }
    }

    private static void addEmptySquares(Square[][] board) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Square();
            }
        }
    }
}