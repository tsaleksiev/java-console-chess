package Pieces;

import java.util.List;

public class King extends Piece {
    /* TODO */

    @Override
    public String getSymbol() {
        return symbol;
    }

    private String symbol = "K";

    @Override
    public List<Square> getLegalMoves(Square[][] b) {
        //Under construction
        return null;
    }
}