package Pieces;

import java.util.List;

public class Pawn extends PieceSlot {
    @Override
    public String getSymbol() {
        return this.symbol;
    }

    public Pawn(String color) {
        if (color.equals("black"))
            this.symbol = "p";
    }

    /* TODO */
    private String symbol = "P";


}