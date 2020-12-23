package Pieces;

import java.util.List;

public class King extends PieceSlot {
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

}