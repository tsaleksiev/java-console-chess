package Pieces;

public class Square {

    private int xCoord;
    private int yCoord;
    public boolean isEmpty = true;

    public void setPieceOnSquare(PieceSlot pieceOnSquare) {
        this.pieceOnSquare = pieceOnSquare;
    }

    private PieceSlot pieceOnSquare = new PieceSlot();

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

    public void addPiece(PieceSlot piece) {
        this.pieceOnSquare = piece;
    }

    public void clearSquare() {
        this.pieceOnSquare = new PieceSlot();
    }

    public PieceSlot getPieceOnSquare() {
        return pieceOnSquare;
    }

    /* TODO */
}