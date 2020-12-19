package Pieces;

import java.util.List;

public class Queen extends Piece {
    /* TODO */

    @Override
    public String getSymbol() {
        return symbol;
    }

    public final String symbol = "Q";

    @Override
    public List<Square> getLegalMoves(Square[][] b) {
        //Under construction
        return null;
    }
}