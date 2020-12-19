package Pieces;

import java.util.List;

public class Bishop extends Piece {
    @Override
    public String getSymbol() {
        return symbol;
    }

    /* TODO */
    private String symbol = "B";

    @Override
    public List<Square> getLegalMoves(Square[][] b) {
        //Under construction
        return null;
    }
}