package Pieces;

public class King extends Piece {
    /* TODO */

    @Override
    public String getSymbol() {
        return symbol;
    }

    private String symbol = "K";

    public King(String color) {
        if (color.equals("black"))
            this.symbol = "k";
    }

    @Override
    public void printLegalMoves(int upDownIndex, int leftRightIndex) {
        //King legal moves
    }
}