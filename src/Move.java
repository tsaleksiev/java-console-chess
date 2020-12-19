import Board.*;
import Pieces.AvailableMove;
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
        BoardConfigurator.addPiece(board[4][num], new AvailableMove());
        BoardConfigurator.addPiece(board[5][num], new AvailableMove());
        Board.printCurrentBoard();
        BoardConfigurator.addPiece(board[4][num], new Piece());
        BoardConfigurator.addPiece(board[5][num], new Piece());
    }


    public static void getAvailableQueenMoves() {
        for (int i = 6; i >= 0; i--) {
            BoardConfigurator.addPiece(Board.getBoard()[i][3], new AvailableMove());
        }

        BoardConfigurator.addPiece(Board.getBoard()[6][2], new AvailableMove());
        BoardConfigurator.addPiece(Board.getBoard()[6][4], new AvailableMove());
        BoardConfigurator.addPiece(Board.getBoard()[5][1], new AvailableMove());
        BoardConfigurator.addPiece(Board.getBoard()[5][5], new AvailableMove());
        BoardConfigurator.addPiece(Board.getBoard()[4][0], new AvailableMove());
        BoardConfigurator.addPiece(Board.getBoard()[4][6], new AvailableMove());
        BoardConfigurator.addPiece(Board.getBoard()[3][7], new AvailableMove());


        Board.printCurrentBoard();

        for (int i = 6; i >= 0; i--) {
            BoardConfigurator.addPiece(Board.getBoard()[i][3], new Piece());
        }

        BoardConfigurator.addPiece(Board.getBoard()[6][2], new Piece());
        BoardConfigurator.addPiece(Board.getBoard()[6][4], new Piece());
        BoardConfigurator.addPiece(Board.getBoard()[5][1], new Piece());
        BoardConfigurator.addPiece(Board.getBoard()[5][5], new Piece());
        BoardConfigurator.addPiece(Board.getBoard()[4][0], new Piece());
        BoardConfigurator.addPiece(Board.getBoard()[4][6], new Piece());
        BoardConfigurator.addPiece(Board.getBoard()[3][7], new Piece());
    }

    public static void getAvailableRookMoves() {
        for (int i = 0; i < 7; i++) {
            BoardConfigurator.addPiece(Board.getBoard()[i][0], new AvailableMove());
        }
        Board.printCurrentBoard();
        for (int i = 0; i < 7; i++) {
            BoardConfigurator.addPiece(Board.getBoard()[i][0], new Piece());
        }

    }

    public static void getAvailableBishopMoves() {
        BoardConfigurator.addPiece(Board.getBoard()[6][1], new AvailableMove());
        BoardConfigurator.addPiece(Board.getBoard()[5][0], new AvailableMove());
        Board.printCurrentBoard();
        BoardConfigurator.addPiece(Board.getBoard()[6][1], new Piece());
        BoardConfigurator.addPiece(Board.getBoard()[5][0], new Piece());
    }

    public static void getAvailableKnightMoves() {
        /* TODO */
    }

    public static void getAvailableKingMoves() {
        /* TODO */
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