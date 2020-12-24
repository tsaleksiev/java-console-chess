package Pieces;

public class Pawn extends Piece {
    @Override
    public String getSymbol() {
        return this.symbol;
    }

    private boolean isMoved = false;

    public Pawn(String color) {
        if (color.equals("black"))
            this.symbol = "p";
    }

    /* TODO */
    private String symbol = "P";

    @Override
    public void printLegalMoves(int upDownIndex, int leftRightIndex) {
        //Pawn legal moves
    }
}