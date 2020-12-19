import Pieces.Piece;
import Pieces.Square;

public class Board {
    /* TODO */
    private static final int SIZE = 8;

    public static Square[][] getBoard() {
        return board;
    }

    private static Square[][] board = new Square[SIZE][SIZE];

    // Singleton
    private static Board grid;

    public static Board getInstance() {
        if (grid == null)
            grid = new Board();
        return grid;
    }

    public void printCurrentBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Square currPiece = board[i][j];
                String symbol = currPiece.getPieceOnSquare().getSymbol();
                if (symbol == null) {
                    System.out.print("-");
                } else {
                    System.out.print(symbol);
                }

            }
            System.out.println();
        }
    }
}