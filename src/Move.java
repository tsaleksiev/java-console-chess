import Pieces.AvailableMove;
import Pieces.Piece;
import Pieces.Queen;
import Pieces.Square;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Move {
    /* TODO */

    Piece piece;

    String moveRegex = "(?<moveNum>\\d{1,3})" +
            "(?<whMove>(?:(?:O-O[-0]?)|(?:[KQNBR][a-h]?x?[a-h]x?[1-8])|(?:(?<whPawn>[a-h])(?<whCapt>x?)[a-h]?(?<whCol>[1-8])))\\+?)" +
            "(?<blMove>(?:(?:O-O[-0]?)|(?:[KQNBR][a-h]?x?[a-h]x?[1-8])|(?:(?<blPawn>[a-h])(?<blCapt>x?)[a-h]?(?<blCol>[1-8])))\\+?)";
    Pattern movePattern = Pattern.compile(moveRegex);

    public Move(String move) {
        Matcher moveMatcher = movePattern.matcher(move);
        int moveNumber = Integer.parseInt(moveMatcher.group("moveNum"));
        String whMove = moveMatcher.group("whMove");
        String blMove = moveMatcher.group("blMove");
    }

    private int x1, y1, x2, y2;

    public Move(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public static void showAvailablePawnMoves(Square[][] board, char whiteFigure) {
        int num = (char) (whiteFigure - 97);
        BoardConfigurator.addPiece(board[4][num], new AvailableMove());
        BoardConfigurator.addPiece(board[5][num], new AvailableMove());
        Board.printCurrentBoard();
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
}