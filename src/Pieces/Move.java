package Pieces;

import Board.*;
import Pieces.LegalMove;
import Pieces.Piece;
import Pieces.Square;

public class Move {
    /* TODO */

    Piece piece;

    private int x1, y1, x2, y2;

    public Move(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public static void getAvailablePawnMoves(Square[][] board, char column) {
        int num = (char) (column - 97);
        BoardConfigurator.addPiece(board[4][num], new LegalMove());
        BoardConfigurator.addPiece(board[5][num], new LegalMove());
        Board.printCurrentBoard();
        BoardConfigurator.addPiece(board[4][num], new Piece());
        BoardConfigurator.addPiece(board[5][num], new Piece());
    }

    public static void findLegalCrossMoves(int upDownIndex, int leftRightIndex) {
        Piece emptyPiece = new Piece();
        LegalMove emptyAvailableMove = new LegalMove();

        //find up
        for (int i = upDownIndex - 1; i >= 0; i--) {
            Object obj = Board.getBoard()[i][leftRightIndex].getPieceOnSquare();

            if (obj.getClass().equals(emptyPiece.getClass()))
                BoardConfigurator.addPiece(Board.getBoard()[i][leftRightIndex], new LegalMove());
            else
                break;

        }

        //find down
        for (int i = upDownIndex + 1; i < 8; i++) {
            Object obj = Board.getBoard()[i][leftRightIndex].getPieceOnSquare();
            if (obj.getClass().equals(emptyPiece.getClass()))
                BoardConfigurator.addPiece(Board.getBoard()[i][leftRightIndex], new LegalMove());
            else
                break;
        }

        //find left
        for (int i = leftRightIndex - 1; i >= 0; i--) {
            Object obj = Board.getBoard()[upDownIndex][i].getPieceOnSquare();
            if (obj.getClass().equals(emptyPiece.getClass()))
                BoardConfigurator.addPiece(Board.getBoard()[upDownIndex][i], new LegalMove());
            else
                break;
        }

        //find right
        for (int i = leftRightIndex + 1; i < 8; i++) {
            Object obj = Board.getBoard()[upDownIndex][i].getPieceOnSquare();
            if (obj.getClass().equals(emptyPiece.getClass()))
                BoardConfigurator.addPiece(Board.getBoard()[upDownIndex][i], new LegalMove());
            else
                break;
        }
    }

    public static void clearLegalCrossMoves(int upDownIndex, int leftRightIndex) {
        Piece emptyPiece = new Piece();
        LegalMove emptyAvailableMove = new LegalMove();


        //clear up
        for (int i = upDownIndex - 1; i >= 0; i--) {
            Object obj = Board.getBoard()[i][leftRightIndex].getPieceOnSquare();

            if (obj.getClass().equals(emptyAvailableMove.getClass()))
                BoardConfigurator.addPiece(Board.getBoard()[i][leftRightIndex], new Piece());
            else
                break;

        }

        //clear down
        for (int i = upDownIndex + 1; i < 8; i++) {
            Object obj = Board.getBoard()[i][leftRightIndex].getPieceOnSquare();
            if (obj.getClass().equals(emptyAvailableMove.getClass()))
                BoardConfigurator.addPiece(Board.getBoard()[i][leftRightIndex], new Piece());
            else
                break;
        }

        //clear left
        for (int i = leftRightIndex - 1; i >= 0; i--) {
            Object obj = Board.getBoard()[upDownIndex][i].getPieceOnSquare();
            if (obj.getClass().equals(emptyAvailableMove.getClass()))
                BoardConfigurator.addPiece(Board.getBoard()[upDownIndex][i], new Piece());
            else
                break;
        }

        //clear right
        for (int i = leftRightIndex + 1; i < 8; i++) {
            Object obj = Board.getBoard()[upDownIndex][i].getPieceOnSquare();
            if (obj.getClass().equals(emptyAvailableMove.getClass()))
                BoardConfigurator.addPiece(Board.getBoard()[upDownIndex][i], new Piece());
            else
                break;
        }
    }


    public static void printLegalQueenMoves(int upDownIndex, int leftRightIndex) {
        findLegalCrossMoves(upDownIndex, leftRightIndex);

        //find diagonals
        findLegalDiagonalMoves(upDownIndex, leftRightIndex);

        Board.printCurrentBoard();

        clearLegalCrossMoves(upDownIndex, leftRightIndex);

        //clear diagonals
        clearLegalDiagonalMoves(upDownIndex, leftRightIndex);
    }

    private static void clearLegalDiagonalMoves(int upDownIndex, int leftRightIndex) {
        //todo
        Piece emptyPiece = new Piece();
        LegalMove emptyAvailableMove = new LegalMove();

        //up right
        int j = leftRightIndex + 1;
        for (int i = upDownIndex - 1; i >= 0; i--) {
            if (j > 7) break;

            Object obj = Board.getBoard()[i][j].getPieceOnSquare();
            if (obj.getClass().equals(emptyAvailableMove.getClass())) {
                BoardConfigurator.addPiece(Board.getBoard()[i][j], new Piece());
                j++;
                if (j == 8) break;
            } else {
                break;
            }
        }

        //down right
        j = leftRightIndex + 1;
        for (int i = upDownIndex + 1; i < 8; i++) {
            if (j > 7) break;
            Object obj = Board.getBoard()[i][j].getPieceOnSquare();
            if (obj.getClass().equals(emptyAvailableMove.getClass())) {
                BoardConfigurator.addPiece(Board.getBoard()[i][j], new Piece());
                j++;
                if (j == 8) break;
            } else {
                break;
            }
        }

        //down left
        j = leftRightIndex - 1;
        for (int i = upDownIndex + 1; i < 8; i++) {
            if (j < 0) break;

            Object obj = Board.getBoard()[i][j].getPieceOnSquare();
            if (obj.getClass().equals(emptyAvailableMove.getClass())) {
                BoardConfigurator.addPiece(Board.getBoard()[i][j], new Piece());
                j--;
                if (j < 0) break;
            } else {
                break;
            }
        }

        //up left
        j = leftRightIndex - 1;
        for (int i = upDownIndex - 1; i >= 0; i--) {
            if (j < 0) break;
            Object obj = Board.getBoard()[i][j].getPieceOnSquare();
            if (obj.getClass().equals(emptyAvailableMove.getClass())) {
                BoardConfigurator.addPiece(Board.getBoard()[i][j], new Piece());
                j--;
                if (j < 0) break;
            } else {
                break;
            }
        }
    }

    private static void findLegalDiagonalMoves(int upDownIndex, int leftRightIndex) {
        //todo
        Piece emptyPiece = new Piece();
        LegalMove emptyAvailableMove = new LegalMove();

        //up right
        int j = leftRightIndex + 1;
        for (int i = upDownIndex - 1; i >= 0; i--) {
            if (j > 7) break;
            Object obj = Board.getBoard()[i][j].getPieceOnSquare();
            if (obj.getClass().equals(emptyPiece.getClass())) {
                BoardConfigurator.addPiece(Board.getBoard()[i][j], new LegalMove());
                j++;
                if (j == 8) break;
            } else {
                break;
            }
        }

        //down right
        j = leftRightIndex + 1;
        for (int i = upDownIndex + 1; i < 8; i++) {
            if (j > 7) break;
            Object obj = Board.getBoard()[i][j].getPieceOnSquare();
            if (obj.getClass().equals(emptyPiece.getClass())) {
                BoardConfigurator.addPiece(Board.getBoard()[i][j], new LegalMove());
                j++;
                if (j == 8) break;
            } else {
                break;
            }
        }

        //down left
        j = leftRightIndex - 1;
        for (int i = upDownIndex + 1; i < 8; i++) {
            if (j < 0) break;

            Object obj = Board.getBoard()[i][j].getPieceOnSquare();
            if (obj.getClass().equals(emptyPiece.getClass())) {
                BoardConfigurator.addPiece(Board.getBoard()[i][j], new LegalMove());
                j--;
                if (j < 0) break;
            } else {
                break;
            }
        }

        //up left
        j = leftRightIndex - 1;
        for (int i = upDownIndex - 1; i >= 0; i--) {
            if (j < 0) break;

            Object obj = Board.getBoard()[i][j].getPieceOnSquare();
            if (obj.getClass().equals(emptyPiece.getClass())) {
                BoardConfigurator.addPiece(Board.getBoard()[i][j], new LegalMove());
                j--;
                if (j < 0) break;
            } else {
                break;
            }
        }

    }

    public static void printLegalRookMoves(int upDownCol, int leftRightRow) {
        findLegalCrossMoves(upDownCol, leftRightRow);
        Board.printCurrentBoard();
        clearLegalCrossMoves(upDownCol, leftRightRow);
    }

    public static void printLegalBishopMoves(int upDownCol, int leftRightRow) {
        findLegalDiagonalMoves(upDownCol, leftRightRow);
        Board.printCurrentBoard();
        clearLegalDiagonalMoves(upDownCol, leftRightRow);
    }

    public static void printLegalKnightMoves(int upDownIndex, int leftRightIndex) {
        /* TODO */

    }

    public static void printLegalKingMoves(int upDownCol, int leftRightRow) {
        findLegalKingMoves(upDownCol, leftRightRow);
        Board.printCurrentBoard();
        clearLegalKingMoves(upDownCol, leftRightRow);
    }

    private static void clearLegalKingMoves(int upDownIndex, int leftRightIndex) {
        //TODO
        Piece emptyPiece = new Piece();
        LegalMove emptyAvailableMove = new LegalMove();

    }

    private static void findLegalKingMoves(int upDownIndex, int leftRightIndex) {
        //TODO
        Piece emptyPiece = new Piece();
        LegalMove emptyAvailableMove = new LegalMove();

        //find up
        if (upDownIndex - 1 >= 0) {
            Object obj = Board.getBoard()[upDownIndex - 1][leftRightIndex].getPieceOnSquare();

            if (obj.getClass().equals(emptyPiece.getClass()))
                BoardConfigurator.addPiece(Board.getBoard()[upDownIndex - 1][leftRightIndex], new LegalMove());
        }

        //find down
        if (upDownIndex - 1 >= 0) {
            Object obj = Board.getBoard()[upDownIndex - 1][leftRightIndex].getPieceOnSquare();

            if (obj.getClass().equals(emptyPiece.getClass()))
                BoardConfigurator.addPiece(Board.getBoard()[upDownIndex - 1][leftRightIndex], new LegalMove());
        }

        //find left
        if (upDownIndex - 1 >= 0) {
            Object obj = Board.getBoard()[upDownIndex - 1][leftRightIndex].getPieceOnSquare();

            if (obj.getClass().equals(emptyPiece.getClass()))
                BoardConfigurator.addPiece(Board.getBoard()[upDownIndex - 1][leftRightIndex], new LegalMove());
        }

        //find right
        if (upDownIndex - 1 >= 0) {
            Object obj = Board.getBoard()[upDownIndex - 1][leftRightIndex].getPieceOnSquare();

            if (obj.getClass().equals(emptyPiece.getClass()))
                BoardConfigurator.addPiece(Board.getBoard()[upDownIndex - 1][leftRightIndex], new LegalMove());
        }

        //up right
        int j = leftRightIndex + 1;
        if (j < 7 && upDownIndex - 1 >= 0) {
            Object obj = Board.getBoard()[upDownIndex - 1][j].getPieceOnSquare();
            if (obj.getClass().equals(emptyPiece.getClass())) {
                BoardConfigurator.addPiece(Board.getBoard()[upDownIndex - 1][j], new LegalMove());
            }
        }

        //down right
        j = leftRightIndex + 1;
        if (j < 7 && upDownIndex - 1 >= 0) {
            Object obj = Board.getBoard()[upDownIndex - 1][j].getPieceOnSquare();
            if (obj.getClass().equals(emptyPiece.getClass())) {
                BoardConfigurator.addPiece(Board.getBoard()[upDownIndex - 1][j], new LegalMove());
            }
        }

        //down left
        j = leftRightIndex + 1;
        if (j < 7 && upDownIndex - 1 >= 0) {
            Object obj = Board.getBoard()[upDownIndex - 1][j].getPieceOnSquare();
            if (obj.getClass().equals(emptyPiece.getClass())) {
                BoardConfigurator.addPiece(Board.getBoard()[upDownIndex - 1][j], new LegalMove());
            }
        }

        //up left
        j = leftRightIndex + 1;
        if (j < 7 && upDownIndex - 1 >= 0) {
            Object obj = Board.getBoard()[upDownIndex - 1][j].getPieceOnSquare();
            if (obj.getClass().equals(emptyPiece.getClass())) {
                BoardConfigurator.addPiece(Board.getBoard()[upDownIndex - 1][j], new LegalMove());
            }
        }

    }

    public static void addPiece(int upDownDestination, int leftRightDestination) {
        System.out.println("Piece added");
    }

    public static void removePiece(int upDownIndex, int leftRightIndex) {
        System.out.printf("Piece removed");
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
}