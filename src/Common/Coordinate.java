package Common;

public class Coordinate {
    private int col;
    private int row;

    public void setCol(int col) {
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return this.col;
    }

    public int getRow() {
        return this.row;
    }

    public Coordinate() {
    }

    public Coordinate(int col, int row) {
        this.col = col;
        this.row = row;
    }
}