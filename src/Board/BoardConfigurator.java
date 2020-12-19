package Board;

import Pieces.*;

public class BoardConfigurator {

    public static void setupBoard(Square[][] board) {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Square();
            }
        }

        //addPawns(board);
        //addRooks(board);
        //addKnights(board);
        //addBishops(board);
        //addKings(board);
        //addQueens(board);
        addWhiteFigures(board);

    }

    private static void addWhiteFigures(Square[][] board) {
        addPiece(board[7][0], new Rook("white"));
        PiecesCollection.whitePieces.put(new Rook("white"), "a1");
        addPiece(board[7][1], new Knight());
        PiecesCollection.whitePieces.put(new Knight(), "b1");
        addPiece(board[7][2], new Bishop());
        PiecesCollection.whitePieces.put(new Rook("white"), "c1");
        addPiece(board[7][3], new Queen());
        PiecesCollection.whitePieces.put(new Queen(), "d1");
        addPiece(board[7][4], new King());
        PiecesCollection.whitePieces.put(new King(), "e1");
        addPiece(board[7][5], new Bishop());
        PiecesCollection.whitePieces.put(new Bishop(), "f1");
        addPiece(board[7][6], new Knight());
        PiecesCollection.whitePieces.put(new Knight(), "g1");
        addPiece(board[7][7], new Rook("white"));
        PiecesCollection.whitePieces.put(new Rook("white"), "h1");

    }

    public static void addPiece(Square square, Piece piece) {
        square.addPiece(piece);
        square.isEmpty = false;
    }

    public static void clearSquare(Square square) {
        square.setPieceOnSquare(null);
        square.isEmpty = true;
    }

    private static void addQueens(Square[][] board) {
        addPiece(board[0][3], new Queen());
        addPiece(board[7][3], new Queen());
    }

    private static void removeQueens(Square[][] board) {
        clearSquare(board[0][3]);
        clearSquare(board[7][3]);
    }

    private static void addKings(Square[][] board) {
        addPiece(board[0][4], new King());
        addPiece(board[7][4], new King());
    }

    private static void removeKings(Square[][] board) {
        clearSquare(board[0][4]);
        clearSquare(board[7][4]);
    }

    private static void addBishops(Square[][] board) {
        addPiece(board[0][2], new Bishop());
        addPiece(board[0][5], new Bishop());
        addPiece(board[7][2], new Bishop());
        addPiece(board[7][5], new Bishop());
    }

    private static void removeBishops(Square[][] board) {
        clearSquare(board[0][2]);
        clearSquare(board[0][5]);
        clearSquare(board[7][2]);
        clearSquare(board[7][5]);
    }

    private static void addKnights(Square[][] board) {
        addPiece(board[0][1], new Knight());
        addPiece(board[0][6], new Knight());
        addPiece(board[7][1], new Knight());
        addPiece(board[7][6], new Knight());
    }

    private static void removeKnights(Square[][] board) {
        clearSquare(board[0][1]);
        clearSquare(board[0][6]);
        clearSquare(board[7][1]);
        clearSquare(board[7][6]);
    }

    private static void addRooks(Square[][] board) {
        addPiece(board[0][0], new Rook("white"));
        addPiece(board[0][7], new Rook("white"));
        addPiece(board[7][0], new Rook("white"));
        addPiece(board[7][7], new Rook("white"));
    }

    private static void removeRooks(Square[][] board) {
        clearSquare(board[0][0]);
        clearSquare(board[0][7]);
        clearSquare(board[7][0]);
        clearSquare(board[7][7]);
    }

    private static void addPawns(Square[][] board) {
        for (int i = 0; i < 8; i++) {
            addPiece(board[1][i], new Pawn());
        }
        for (int i = 0; i < 8; i++) {
            addPiece(board[6][i], new Pawn());
        }
    }

    private static void removePawns(Square[][] board) {
        for (int i = 0; i < 8; i++) {
            clearSquare(board[1][i]);
        }
        for (int i = 0; i < 8; i++) {
            clearSquare(board[6][i]);
        }
    }
}