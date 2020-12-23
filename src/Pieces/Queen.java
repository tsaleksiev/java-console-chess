package Pieces;

public class Queen extends PieceSlot {
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


}