public class Board {
    /* TODO */
    public static final int SIZE = 8;

    private static Square[][] grid = new Square[SIZE][SIZE];

    // Singleton
    private static Board board;
    public static Board getInstance() {
        if (board == null)
            board = new Board();
        return board;
    }
}