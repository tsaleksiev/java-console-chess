package BoardEngine;

import Pieces.Square;

public abstract class Board {
    /* TODO */
    public static final int SIZE = 8;

    private static Square[][] board = new Square[SIZE][SIZE];

    // Singleton
    public static Square[][] getBoard() {
        return board;
    }
}