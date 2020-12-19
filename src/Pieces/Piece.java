package Pieces;
import java.util.ArrayList;
import java.util.List;

public class Piece {
    private Square currSq;

    public String getSymbol() {
        return this.symbol;
    }

    private String symbol;

    public Square getPosition() {
        return currSq;
    }

    public void setPosition(Square sq) {
        this.currSq = sq;
    }

    public List<Square> getLegalMoves(Square[][] b) {
        List<Square> legalMoves = new ArrayList<>();
        return legalMoves;
    }

    public Square[][] getLegalMoves(Square[][] currentBoard, Piece piece) {
        //Under construction
        return null;
    }

    /* TODO */
}