public class Board {
    /* TODO */
    private static final int SIZE = 8;

    public static Square[][] getEmptyBoard() {
        return emptyBoard;
    }

    private static Square[][] emptyBoard = new Square[SIZE][SIZE];

    // Singleton
    private static Board board;
    public static Board getInstance() {
        if (board == null)
            board = new Board();
        return board;
    }
}