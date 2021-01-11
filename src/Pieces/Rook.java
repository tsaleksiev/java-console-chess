package Pieces;

import BoardEngine.Board;
import BoardEngine.BoardPrinter;
import Common.ChessColor;
import Common.Coordinate;
import Pieces.LegalMoveEngine.LegalMoveEngine;

import java.util.LinkedList;
import java.util.List;

public class Rook implements Piece {
    /* TODO */
    private Coordinate coords = new Coordinate();
    private ChessColor color;
    private String symbol;
    private List<Coordinate> legalMoves = new LinkedList<>();

    public String getSymbol() {
        return symbol;
    }

    public Rook(ChessColor color, int col, int row) {
        this.color = color;
        this.coords.setCol(col);
        this.coords.setRow(row);
        switch (color) {
            case WHITE -> this.symbol = "R";
            case BLACK -> this.symbol = "r";
        }
    }

    @Override
    public List<Coordinate> getLegalMoves() {
        return legalMoves;
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
        LegalMoveEngine.findRookLegalMoves(legalMoves, this.coords.getCol(), this.coords.getRow());
    }
}