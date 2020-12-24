package Pieces;

public class Piece {
    private Square currSq;
    String color;
    String name;

    private int upDownIndex;
    private int leftRightIndex;

    public int getX() {
        return upDownIndex;
    }

    public void setX(int x) {
        this.upDownIndex = x;
    }

    public int getY() {
        return upDownIndex;
    }

    public void setY(int y) {
        this.leftRightIndex = y;
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

    public void printLegalMoves(int upDownIndex, int leftRightIndex) {
        System.out.println("Default legal moves printed");
        System.out.println("Default legal moves deleted");
    }

    public void findLegalMoves(int upDownIndex, int leftRightIndex) {
        System.out.println("Default legal moves available pinned on board");
    }

    public void movePiece(int upDownDestination, int leftRightDestination) {
        Move.addPiece(upDownDestination, leftRightDestination);
        System.out.println("Piece added to destination.");
        Move.removePiece(this.upDownIndex, this.leftRightIndex);
        System.out.println("Piece removed from origin.");

    }


    /* TODO */
}