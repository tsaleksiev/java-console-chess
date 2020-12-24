package Pieces;

public class Knight extends Piece {
    /* TODO */

    @Override
    public String getSymbol() {
        return symbol;
    }

    private String symbol = "N";

    public Knight(String color) {
        if (color.equals("black"))
            this.symbol = "n";
    }

    @Override
    public void printLegalMoves(int upDownIndex, int leftRightIndex) {
        System.out.println("Knight legal moves");
    }
}