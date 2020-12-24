package Pieces;

public class Rook extends Piece {
    /* TODO */

    @Override
    public String getSymbol() {
        return symbol;
    }

    private String color = "white";

    public String getColor() {
        return this.color;
    }

    private String symbol = "R";

    public Rook(String color) {
        if (color.equals("black")) {
            this.symbol = "r";
            this.color = "black";
        }

    }

    @Override
    public void findLegalMoves(int upDownIndex, int leftRightIndex) {
        Move.findLegalCrossMoves(upDownIndex, leftRightIndex);
    }

    @Override
    public void printLegalMoves(int upDownIndex, int leftRightIndex) {
        Move.printLegalRookMoves(upDownIndex, leftRightIndex);
        System.out.println("Rook legal moves");
        System.out.println("Rook legal moves deleted");
    }
}