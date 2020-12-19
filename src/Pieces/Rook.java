package Pieces;

import java.util.List;

public class Rook extends Piece {
    /* TODO */

    @Override
    public String getSymbol() {
        return symbol;
    }

    private final String symbol = "R";

    @Override
    public List<Square> getLegalMoves(Square[][] b) {
        //Under construction
        return null;
    }
}