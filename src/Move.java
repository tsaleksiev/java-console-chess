import Board.*;
import Pieces.AvailableMove;
import Pieces.PieceSlot;
import Pieces.Square;

public class Move {
    /* TODO */

    PieceSlot piece;

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
        BoardConfigurator.addPiece(board[4][num], new PieceSlot());
        BoardConfigurator.addPiece(board[5][num], new PieceSlot());
    }

    public static void getAvailableCrossMoves(int leftRightRow, int upDownCol) {
        PieceSlot emptyPiece = new PieceSlot();
        AvailableMove emptyAvailableMove = new AvailableMove();
        //print up - rdy
        for (int i = upDownCol - 1; i >= 0; i--) {
            Object obj = Board.getBoard()[i][leftRightRow].getPieceOnSquare();

            if (obj.getClass().equals(emptyPiece.getClass()))
                BoardConfigurator.addPiece(Board.getBoard()[i][leftRightRow], new AvailableMove());
            else
                break;

        }

        //print down - rdy
        for (int i = upDownCol + 1; i < 8; i++) {
            Object obj = Board.getBoard()[i][leftRightRow].getPieceOnSquare();
            if (obj.getClass().equals(emptyPiece.getClass()))
                BoardConfigurator.addPiece(Board.getBoard()[i][leftRightRow], new AvailableMove());
            else
                break;
        }

        //print left
        for (int i = leftRightRow - 1; i >= 0; i--) {
            Object obj = Board.getBoard()[upDownCol][i].getPieceOnSquare();
            if (obj.getClass().equals(emptyPiece.getClass()))
                BoardConfigurator.addPiece(Board.getBoard()[upDownCol][i], new AvailableMove());
            else
                break;
        }

        //print right
        for (int i = leftRightRow + 1; i < 8; i++) {
            Object obj = Board.getBoard()[upDownCol][i].getPieceOnSquare();
            if (obj.getClass().equals(emptyPiece.getClass()))
                BoardConfigurator.addPiece(Board.getBoard()[upDownCol][i], new AvailableMove());
            else
                break;
        }


    }

    public static void clearAvailableCrossMoves(int leftRightRow, int upDownCol) {
        PieceSlot emptyPiece = new PieceSlot();
        AvailableMove emptyAvailableMove = new AvailableMove();


        //clear up - rdy
        for (int i = upDownCol - 1; i >= 0; i--) {
            Object obj = Board.getBoard()[i][leftRightRow].getPieceOnSquare();

            if (obj.getClass().equals(emptyAvailableMove.getClass()))
                BoardConfigurator.addPiece(Board.getBoard()[i][leftRightRow], new PieceSlot());
            else
                break;

        }

        //clear down - rdy
        for (int i = upDownCol + 1; i < 8; i++) {
            Object obj = Board.getBoard()[i][leftRightRow].getPieceOnSquare();
            if (obj.getClass().equals(emptyAvailableMove.getClass()))
                BoardConfigurator.addPiece(Board.getBoard()[i][leftRightRow], new PieceSlot());
            else
                break;
        }

        //clear left
        for (int i = leftRightRow - 1; i >= 0; i--) {
            Object obj = Board.getBoard()[upDownCol][i].getPieceOnSquare();
            if (obj.getClass().equals(emptyAvailableMove.getClass()))
                BoardConfigurator.addPiece(Board.getBoard()[upDownCol][i], new PieceSlot());
            else
                break;
        }

        //clear right
        for (int i = leftRightRow + 1; i < 8; i++) {
            Object obj = Board.getBoard()[upDownCol][i].getPieceOnSquare();
            if (obj.getClass().equals(emptyAvailableMove.getClass()))
                BoardConfigurator.addPiece(Board.getBoard()[upDownCol][i], new PieceSlot());
            else
                break;
        }
    }


    public static void printAvailableQueenMoves() {
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
            BoardConfigurator.addPiece(Board.getBoard()[i][3], new PieceSlot());
        }

        BoardConfigurator.addPiece(Board.getBoard()[6][2], new PieceSlot());
        BoardConfigurator.addPiece(Board.getBoard()[6][4], new PieceSlot());
        BoardConfigurator.addPiece(Board.getBoard()[5][1], new PieceSlot());
        BoardConfigurator.addPiece(Board.getBoard()[5][5], new PieceSlot());
        BoardConfigurator.addPiece(Board.getBoard()[4][0], new PieceSlot());
        BoardConfigurator.addPiece(Board.getBoard()[4][6], new PieceSlot());
        BoardConfigurator.addPiece(Board.getBoard()[3][7], new PieceSlot());
    }

    public static void printAvailableRookMoves(int leftRightRow, int upDownCol) {
        getAvailableCrossMoves(leftRightRow, upDownCol);
        Board.printCurrentBoard();
        clearAvailableCrossMoves(leftRightRow, upDownCol);
    }

    public static void printAvailableBishopMoves() {
        BoardConfigurator.addPiece(Board.getBoard()[6][1], new AvailableMove());
        BoardConfigurator.addPiece(Board.getBoard()[6][3], new AvailableMove());
        BoardConfigurator.addPiece(Board.getBoard()[5][0], new AvailableMove());
        BoardConfigurator.addPiece(Board.getBoard()[5][4], new AvailableMove());
        Board.printCurrentBoard();
        BoardConfigurator.addPiece(Board.getBoard()[6][1], new PieceSlot());
        BoardConfigurator.addPiece(Board.getBoard()[6][3], new PieceSlot());
        BoardConfigurator.addPiece(Board.getBoard()[5][0], new PieceSlot());
        BoardConfigurator.addPiece(Board.getBoard()[5][4], new PieceSlot());
    }

    public static void printAvailableKnightMoves() {
        /* TODO */
    }

    public static void printAvailableKingMoves() {
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