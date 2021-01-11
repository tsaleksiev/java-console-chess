package BoardEngine;

import Common.Coordinate;
import Pieces.Piece;
import Pieces.Square;

import java.util.List;

public abstract class BoardPrinter {
    public static void printBoard(Square[][] board) {
        for (int i = 0; i < Board.SIZE; i++) {
            System.out.print(8 - i + " ");
            for (int j = 0; j < Board.SIZE; j++) {
                Piece currSq = board[i][j].getPiece();
                if (currSq == null) {
                    System.out.print("-");
                } else {
                    String symbol = currSq.getSymbol();
                    System.out.print(symbol);
                }

            }
            System.out.println();
        }
        System.out.println("  abcdefgh");
    }

    public static void printBoardWithLegalMoves(Square[][] board,
                                                List<Coordinate> legalMoves) {
        for (int col = 0; col < Board.SIZE; col++) {
            System.out.print(8 - col + " ");
            for (int row = 0; row < Board.SIZE; row++) {
                Piece currSq = board[col][row].getPiece();
                if (currSq == null) {
                    if (checkForLegalMove(legalMoves, col, row)) {
                        continue;
                    }
                    System.out.print("-");
                } else {
                    String symbol = currSq.getSymbol();
                    System.out.print(symbol);
                }

            }
            System.out.println();
        }
        System.out.println("  abcdefgh");
    }

    private static boolean checkForLegalMove(List<Coordinate> legalMoves,
                                             int col, int row) {
        for (int k = 0; k < legalMoves.size(); k++) {
            int currCol = legalMoves.get(k).getCol();
            int currRow = legalMoves.get(k).getRow();
            if (currCol == col && currRow == row) {
                System.out.print("+");
                return true;
            }
        }
        return false;
    }
}