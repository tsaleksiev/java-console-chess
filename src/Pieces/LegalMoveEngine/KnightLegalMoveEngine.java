package Pieces.LegalMoveEngine;

public class KnightLegalMoveEngine {
    private static int smallUpCol;
    private static int smallDownCol;
    private static int bigUpCol;
    private static int bigDownCol;
    private static int smallLeftRow;
    private static int smallRightRow;
    private static int bigLeftRow;
    private static int bigRightRow;

    public static void startEngine(int col, int row) {
        setBigDownCol(col);
        setBigUpCol(col);
        setBigLeftRow(row);
        setBigRightRow(row);
        setSmallDownCol(col);
        setSmallUpCol(col);
        setSmallRightRow(row);
        setSmallLeftRow(row);
    }

    public static int getSmallUpCol() {
        return smallUpCol;
    }

    private static void setSmallUpCol(int col) {
        smallUpCol = col - 1;
    }

    public static int getSmallDownCol() {
        return smallDownCol;
    }

    private static void setSmallDownCol(int col) {
        smallDownCol = col + 1;
    }

    public static int getBigUpCol() {
        return bigUpCol;
    }

    private static void setBigUpCol(int col) {
        bigUpCol = col - 2;
    }

    public static int getBigDownCol() {
        return bigDownCol;
    }

    private static void setBigDownCol(int col) {
        bigDownCol = col + 2;
    }

    public static int getSmallLeftRow() {
        return smallLeftRow;
    }

    private static void setSmallLeftRow(int row) {
        smallLeftRow = row - 1;
    }

    public static int getSmallRightRow() {
        return smallRightRow;
    }

    private static void setSmallRightRow(int row) {
        smallRightRow = row + 1;
    }

    public static int getBigLeftRow() {
        return bigLeftRow;
    }

    private static void setBigLeftRow(int row) {
        bigLeftRow = row - 2;
    }

    public static int getBigRightRow() {
        return bigRightRow;
    }

    private static void setBigRightRow(int row) {
        bigRightRow = row + 2;
    }

}