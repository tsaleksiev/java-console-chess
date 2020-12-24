package Board;

import Pieces.*;

import java.util.LinkedHashMap;
import java.util.Map;

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
        //addFiguresSet(board, "black");
        addPiece(board[4][0], new Queen("white"));
        addPiece(board[2][0], new Queen("white"));
        addPiece(board[3][7], new Bishop("white"));
        addPiece(board[5][1], new Bishop("white"));
        addPiece(board[1][2], new Queen("white"));
        addPiece(board[1][2], new Bishop("white"));
        addPiece(board[1][2], new Queen("white"));
        addFiguresSet(board, "white");


    }

    private static void addFiguresSet(Square[][] board, String color) {
        String upDownRow = "";
        int upDownCoords = 0;
        Map<Piece, String> collectionMap = new LinkedHashMap<>();

        if (color.equals("white")) {
            upDownRow = "1";
            upDownCoords = 7;
            collectionMap = PiecesCollection.whiteActivePieces;
        } else if (color.equals("black")) {
            upDownRow = "8";
            upDownCoords = 0;
            collectionMap = PiecesCollection.whiteActivePieces;
        }
        addPiece(board[upDownCoords][0], new Rook(color));
        collectionMap.put(new Rook(color), "a" + upDownRow);
        addPiece(board[upDownCoords][1], new Knight(color));
        collectionMap.put(new Knight(color), "b" + upDownRow);
        addPiece(board[upDownCoords][2], new Bishop(color));
        collectionMap.put(new Rook(color), "c" + upDownRow);
        addPiece(board[upDownCoords][3], new Queen(color));
        collectionMap.put(new Queen(color), "d" + upDownRow);
        addPiece(board[upDownCoords][4], new King(color));
        collectionMap.put(new King(color), "e" + upDownRow);
        addPiece(board[upDownCoords][5], new Bishop(color));
        collectionMap.put(new Bishop(color), "f" + upDownRow);
        addPiece(board[upDownCoords][6], new Knight(color));
        collectionMap.put(new Knight(color), "g" + upDownRow);
        addPiece(board[upDownCoords][7], new Rook(color));
        collectionMap.put(new Rook(color), "h" + upDownRow);

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
        addPiece(board[0][3], new Queen("black"));
        addPiece(board[7][3], new Queen("white"));
    }

    private static void removeQueens(Square[][] board) {
        clearSquare(board[0][3]);
        clearSquare(board[7][3]);
    }

    private static void addKings(Square[][] board) {
        addPiece(board[0][4], new King("black"));
        addPiece(board[7][4], new King("white"));
    }

    private static void removeKings(Square[][] board) {
        clearSquare(board[0][4]);
        clearSquare(board[7][4]);
    }

    private static void addBishops(Square[][] board) {
        addPiece(board[0][2], new Bishop("black"));
        addPiece(board[0][5], new Bishop("black"));
        addPiece(board[7][2], new Bishop("white"));
        addPiece(board[7][5], new Bishop("white"));
    }

    private static void removeBishops(Square[][] board) {
        clearSquare(board[0][2]);
        clearSquare(board[0][5]);
        clearSquare(board[7][2]);
        clearSquare(board[7][5]);
    }

    private static void addKnights(Square[][] board) {
        addPiece(board[0][1], new Knight("black"));
        addPiece(board[0][6], new Knight("black"));
        addPiece(board[7][1], new Knight("white"));
        addPiece(board[7][6], new Knight("white"));
    }

    private static void removeKnights(Square[][] board) {
        clearSquare(board[0][1]);
        clearSquare(board[0][6]);
        clearSquare(board[7][1]);
        clearSquare(board[7][6]);
    }

    private static void addRooks(Square[][] board) {
        addPiece(board[0][0], new Rook("black"));
        addPiece(board[0][7], new Rook("black"));
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
            addPiece(board[1][i], new Pawn("black"));
        }
        for (int i = 0; i < 8; i++) {
            addPiece(board[6][i], new Pawn("white"));
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