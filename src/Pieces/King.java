package Pieces;

import Common.ChessColor;
import Common.Coordinate;

import java.util.LinkedList;
import java.util.List;

public class King implements Piece {
    private Coordinate coords = new Coordinate();
    private ChessColor color;
    private String symbol;
    private List<Coordinate> legalMoves = new LinkedList<>();

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
    public void setColRowIndex(int newCol, int newRow) {

    }

    @Override
    public void printLegalMoves() {

    }

    @Override
    public List<Coordinate> getLegalMoves() {
        return legalMoves;
    }


    public King(ChessColor color, int col, int row) {
        this.color = color;
        this.coords.setCol(col);
        this.coords.setRow(row);
        switch (color) {
            case WHITE -> this.symbol = "K";
            case BLACK -> this.symbol = "k";
        }
    }
}