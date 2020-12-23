package Pieces;

import Board.Board;
import Board.BoardConfigurator;

import java.util.List;

public class Bishop extends PieceSlot {
    @Override
    public String getSymbol() {
        return symbol;
    }

    /* TODO */
    private String symbol = "B";

    public Bishop(String color) {
        if (color.equals("black"))
            this.symbol = getSymbol().toLowerCase();
    }

}