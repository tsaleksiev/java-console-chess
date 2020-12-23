package Pieces;
import java.util.ArrayList;
import java.util.List;

public class PieceSlot {
    private Square currSq;

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

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


    /* TODO */
}