package Pieces;

public class Square {

    private int xCoord;
    private int yCoord;
    public boolean isEmpty = true;

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

    public void clearSquare() {
        this.pieceOnSquare = new Piece();
    }

    public Piece getPieceOnSquare() {
        return pieceOnSquare;
    }

    /* TODO */
}