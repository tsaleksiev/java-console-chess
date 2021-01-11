package Common;

import BoardEngine.Board;
import Pieces.*;

import java.util.*;
import java.util.List;

public class Player {
    private String name;
    private List<Piece> pieces;
    private ChessColor color;

    public Player(String name, ChessColor color) {
        this.name = name;
        this.pieces = createPiecesSet(color);
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public List<Piece> createPiecesSet(ChessColor color) {
        List<Piece> pieces = new ArrayList<>();

        addPiecesToList(pieces, color);

        return pieces;
    }

    private int getStartCol(ChessColor color) {
        int startCol = 7;
        if (color.equals(ChessColor.BLACK)) {
            startCol = 0;
        }
        return startCol;
    }

    private void addPiecesToList(List<Piece> pieces,
                                 ChessColor color) {
        int col = getStartCol(color);
        //addPawnsToList(pieces, color);
        pieces.add(new Rook(color, col, 0));
        pieces.add(new Knight(color, col, 1));
        pieces.add(new Bishop(color, col, 2));
        pieces.add(new Queen(color, col, 3));
        pieces.add(new King(color, col, 4));
        pieces.add(new Bishop(color, col, 5));
        pieces.add(new Knight(color, col, 6));
        pieces.add(new Rook(color, col, 7));

        //test
        //pieces.add(new Knight(ChessColor.WHITE, 5, 3));
        pieces.add(new Knight(ChessColor.WHITE, 3, 3));
        pieces.add(new Knight(ChessColor.WHITE, 3, 4));
        pieces.add(new Knight(ChessColor.WHITE, 3, 5));
        pieces.add(new Knight(ChessColor.WHITE, 3, 6));
        pieces.add(new Knight(ChessColor.WHITE, 3, 7));
        pieces.add(new Rook(ChessColor.WHITE, 2, 3));
        pieces.add(new Rook(ChessColor.WHITE, 2, 4));
        pieces.add(new Queen(ChessColor.WHITE, 5, 6));
        pieces.add(new Queen(ChessColor.WHITE, 5, 7));
    }

    private void addPawnsToList(List<Piece> pieces,
                                ChessColor color) {
        int pawnStartCol = 6;
        if (color.equals(ChessColor.BLACK)) {
            pawnStartCol = 1;
        }
        for (int i = 0; i < Board.SIZE; i++) {
            pieces.add(new Pawn(color, pawnStartCol, i));
        }
    }
}