package Pieces;

import java.util.List;

public class Knight extends PieceSlot {
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


}