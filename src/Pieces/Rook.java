package Pieces;

import java.util.List;

public class Rook extends Piece {
    /* TODO */

    @Override
    public String getSymbol() {
        return symbol;
    }

    String color;

    private final String symbol = "R";

    public Rook(String color) {
        this.color = color;
    }

    @Override
    public List<Square> getLegalMoves(Square[][] b) {
        //Under construction
        return null;
    }
}