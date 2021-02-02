package Pieces;

import Common.Coordinate;

import java.util.List;

public interface Piece {
    int number = 0;





    public String getSymbol();

    public int getColIndex();

    public int getRowIndex();

    void setColRowIndex(int newCol, int newRow);

    void printLegalMoves();

    List<Coordinate> getLegalMoves();
}