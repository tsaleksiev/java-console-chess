package Pieces;

import java.util.List;

public class Pawn extends Piece {
    @Override
    public String getSymbol() {
        return symbol;
    }

    /* TODO */
    private String symbol = "P";

    @Override
    public List<Square> getLegalMoves(Square[][] b) {
        //Under construction
        return null;
    }
}