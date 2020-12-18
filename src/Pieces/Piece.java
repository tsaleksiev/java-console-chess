package Pieces;
import java.util.List;

public abstract class Piece {
    private Square currSq;

    public Square getPosition() {
        return currSq;
    }

    public void setPosition(Square sq) {
        this.currSq = sq;
    }

    public abstract List<Square> getLegalMoves(Square[][] b);

    public Square[][] getLegalMoves(Square[][] currentBoard, Piece piece) {
        //Under construction
        return null;
    }

    /* TODO */
}