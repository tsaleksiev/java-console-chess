package Pieces;

import Common.ChessColor;
import Common.Coordinate;

import java.util.LinkedList;
import java.util.List;

public class Pawn implements Piece {
    private Coordinate coords = new Coordinate();
    private ChessColor color;
    private String symbol;
    private boolean pawnMoved = false;
    private List<Coordinate> legalMoves = new LinkedList<>();

    public boolean isPawnMoved() {
        return pawnMoved;
    }

    public void setPawnMoved(boolean pawnMoved) {
        this.pawnMoved = pawnMoved;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public int getColIndex() {
        return this.coords.getCol();
    }

    @Override
    public int getRowIndex() {
        return this.coords.getRow();
    }

    @Override
    public void setColIndex(int newCol) {

    }

    @Override
    public void setRowIndex(int newRow) {

    }

    @Override
    public void printLegalMoves() {
    }

    @Override
    public List<Coordinate> getLegalMoves() {
        return legalMoves;
    }

    public Pawn(ChessColor color, int col, int row) {
        this.color = color;
        this.coords.setCol(col);
        this.coords.setRow(row);
        switch (color) {
            case WHITE -> this.symbol = "P";
            case BLACK -> this.symbol = "p";
        }
    }
}