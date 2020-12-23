package Pieces;

import java.util.List;

public class Rook extends PieceSlot {
    /* TODO */

    @Override
    public String getSymbol() {
        return symbol;
    }

    private String color = "white";

    public String getColor() {
        return this.color;
    }

    private String symbol = "R";

    public Rook(String color) {
        if (color.equals("black")) {
            this.symbol = "r";
            this.color = "black";
        }

    }



}