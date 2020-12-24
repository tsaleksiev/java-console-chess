package Pieces;

public class Bishop extends Piece {
    @Override
    public String getSymbol() {
        return symbol;
    }

    /* TODO */
    private String symbol = "B";

    public Bishop(String color) {
        if (color.equals("black"))
            this.symbol = getSymbol().toLowerCase();
    }

    @Override
    public void printLegalMoves(int upDownIndex, int leftRightIndex) {
        Move.printLegalBishopMoves(upDownIndex, leftRightIndex);
        System.out.println("Bishop legal moves");
        System.out.println("Bishop legal moves deleted");
    }
}