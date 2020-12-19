package Pieces;

import Pieces.Piece;

public class Square {

    private int xCoord;
    private int yCoord;
    public boolean isEmpty;

    public void setPieceOnSquare(Piece pieceOnSquare) {
        this.pieceOnSquare = pieceOnSquare;
    }

    private Piece pieceOnSquare = new Piece();

    public String getSymbol() {
        return symbol;
    }

    private String symbol = "-";

    public int getX() {
        return this.xCoord;
    }

    public int getY() {
        return this.yCoord;
    }

    public void addPiece(Piece piece) {
        this.pieceOnSquare = piece;
    }

    public Piece getPieceOnSquare() {
        return pieceOnSquare;
    }

    /* TODO */
}