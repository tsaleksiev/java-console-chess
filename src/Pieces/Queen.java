package Pieces;

public class Queen extends Piece {
    /* TODO */

    @Override
    public String getSymbol() {
        return symbol;
    }

    private String symbol = "Q";

    public Queen(String color) {
        if (color.equals("black"))
            this.symbol = "q";
    }

    @Override
    public void printLegalMoves(int upDownIndex, int leftRightIndex) {
        Move.printLegalQueenMoves(upDownIndex, leftRightIndex);
        System.out.println("Queen legal moves");
    }
}