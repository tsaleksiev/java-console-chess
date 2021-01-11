package Pieces;

import Common.Coordinate;

import java.util.List;

public interface Piece {
    public String getSymbol();

    public int getColIndex();

    public int getRowIndex();

    void setColIndex(int newCol);

    void setRowIndex(int newRow);

    void printLegalMoves();

    List<Coordinate> getLegalMoves();
}