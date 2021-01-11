package Pieces.LegalMoveEngine;

import Common.Coordinate;
import BoardEngine.*;
import Pieces.Piece;

import java.util.ArrayList;
import java.util.List;

public class LegalMoveEngine {
    public static void findKingLegalMoves(List<Coordinate> legalMoves,
                                          int col, int row) {
        //todo
    }

    public static void findBishopLegalMoves(List<Coordinate> legalMoves,
                                            int col, int row) {
        findDiagonalLegalMoves(legalMoves, col, row);
    }

    public static void findQueenLegalMoves(List<Coordinate> legalMoves,
                                           int col, int row) {
        findCrossLegalMoves(legalMoves, col, row);
        findDiagonalLegalMoves(legalMoves, col, row);

    }

    public static void findPawnLegalMoves(List<Coordinate> legalMoves,
                                          int col, int row, boolean hasMoved) {
        if (hasMoved) {
            //todo
        } else {
            //todo
        }
    }

    public static void findRookLegalMoves(List<Coordinate> legalMoves, int col, int row) {
        findCrossLegalMoves(legalMoves, col, row);
    }

    public static void findKnightLegalMoves(List<Coordinate> legalMoves,
                                            int col, int row) {
        KnightLegalMoveEngine.startEngine(col, row);
        //upLeft
        final boolean upLeftValid = KnightLegalMoveEngine.getBigUpCol() >= 0 &&
                KnightLegalMoveEngine.getSmallLeftRow() >= 0;
        if (upLeftValid) {
            addToLegalMovesIfFree(legalMoves, KnightLegalMoveEngine.getBigUpCol(),
                    KnightLegalMoveEngine.getSmallLeftRow());
        }

        //upRight
        final boolean upRightValid = KnightLegalMoveEngine.getBigUpCol() >= 0 &&
                KnightLegalMoveEngine.getSmallRightRow() < Board.SIZE;
        if (upRightValid) {
            addToLegalMovesIfFree(legalMoves, KnightLegalMoveEngine.getBigUpCol(),
                    KnightLegalMoveEngine.getSmallRightRow());
        }

        //rightUp
        final boolean rightUpValid = KnightLegalMoveEngine.getSmallUpCol() >= 0 &&
                KnightLegalMoveEngine.getBigRightRow() < Board.SIZE;
        if (rightUpValid) {
            addToLegalMovesIfFree(legalMoves, KnightLegalMoveEngine.getSmallUpCol(),
                    KnightLegalMoveEngine.getBigRightRow());
        }

        //rightDown
        final boolean rightDownValid = KnightLegalMoveEngine.getSmallDownCol() < Board.SIZE &&
                KnightLegalMoveEngine.getBigRightRow() < Board.SIZE;
        if (rightDownValid) {
            addToLegalMovesIfFree(legalMoves, KnightLegalMoveEngine.getSmallDownCol(),
                    KnightLegalMoveEngine.getBigRightRow());
        }

        //downRight
        final boolean downRightValid = KnightLegalMoveEngine.getBigDownCol() < Board.SIZE &&
                KnightLegalMoveEngine.getSmallRightRow() < Board.SIZE;
        if (downRightValid) {
            addToLegalMovesIfFree(legalMoves, KnightLegalMoveEngine.getBigDownCol(),
                    KnightLegalMoveEngine.getSmallRightRow());
        }

        //downLeft
        boolean downLeftValid = KnightLegalMoveEngine.getBigDownCol() < Board.SIZE &&
                KnightLegalMoveEngine.getSmallLeftRow() >= 0;
        if (downLeftValid) {
            addToLegalMovesIfFree(legalMoves, KnightLegalMoveEngine.getBigDownCol(),
                    KnightLegalMoveEngine.getSmallLeftRow());
        }

        //leftDown
        boolean leftDownValid = KnightLegalMoveEngine.getSmallDownCol() < Board.SIZE &&
                KnightLegalMoveEngine.getBigLeftRow() >= 0;
        if (leftDownValid) {
            addToLegalMovesIfFree(legalMoves, KnightLegalMoveEngine.getSmallDownCol(),
                    KnightLegalMoveEngine.getBigLeftRow());
        }

        //leftUp
        boolean leftUpInArray = KnightLegalMoveEngine.getSmallUpCol() >= 0 &&
                KnightLegalMoveEngine.getBigLeftRow() >= 0;
        if (leftUpInArray) {
            addToLegalMovesIfFree(legalMoves, KnightLegalMoveEngine.getSmallUpCol(),
                    KnightLegalMoveEngine.getBigLeftRow());
        }
    }

    private static void addToLegalMovesIfFree(List<Coordinate> legalMoves,
                                              int bigUpCol, int smallLeftRow) {
        if (Board.getBoard()[bigUpCol][smallLeftRow]
                .getPiece() == null) {
            legalMoves.add(new Coordinate(bigUpCol, smallLeftRow));
        }
    }

    private static void addCrossLegalMoves(int col, int row) {
        List<Coordinate> legalCrossMoves = new ArrayList<>();
        findCrossLegalMoves(legalCrossMoves, col, row);
    }

    private static void addDiagonalLegalMoves(int col, int row) {
        List<Coordinate> legalDiagonalMoves = new ArrayList<>();
        findDiagonalLegalMoves(legalDiagonalMoves, col, row);
    }

    private static void findCrossLegalMoves(List<Coordinate> legalMoves,
                                            int col, int row) {
        //up
        for (int upCol = col - 1; upCol >= 0; upCol--) {
            if (Board.getBoard()[upCol][row]
                    .getPiece() == null) {
                legalMoves.add(new Coordinate(upCol, row));
            } else {
                break;
            }
        }

        //down
        for (int downCol = col + 1; downCol < 8; downCol++) {
            if (Board.getBoard()[downCol][row]
                    .getPiece() == null) {
                legalMoves.add(new Coordinate(downCol, row));
            } else {
                break;
            }
        }

        //left
        for (int leftRow = row - 1; leftRow >= 0; leftRow--) {
            if (Board.getBoard()[col][leftRow]
                    .getPiece() == null) {
                legalMoves.add(new Coordinate(col, leftRow));
            } else {
                break;
            }
        }

        //right
        for (int rightRow = row + 1; rightRow < 8; rightRow++) {
            if (Board.getBoard()[col][rightRow]
                    .getPiece() == null) {
                legalMoves.add(new Coordinate(col, rightRow));
            } else {
                break;
            }
        }
    }

    private static void findDiagonalLegalMoves(List<Coordinate> legalDiagonalMoves,
                                               int col, int startRow) {
        int legalRow = startRow - 1;

        // Up Left
        for (int legalCol = col - 1; legalCol >= 0; legalCol--) {
            if (noAvailableLeftDiagonal(legalDiagonalMoves, legalCol, legalRow)) {
                break;
            }
            legalRow--;
        }

        legalRow = startRow - 1;
        // Down Left
        for (int legalCol = col + 1; legalCol < 8; legalCol++) {
            if (noAvailableLeftDiagonal(legalDiagonalMoves, legalCol, legalRow)) {
                break;
            }
            legalRow--;
        }

        legalRow = startRow + 1;

        // Down Right
        for (int legalCol = col + 1; legalCol < Board.SIZE; legalCol++) {
            if (noAvailableRightDiagonal(legalDiagonalMoves, legalCol, legalRow)) {
                break;
            }
            legalRow++;
        }

        legalRow = startRow + 1;
        //Up Right
        for (int legalCol = col - 1; legalCol >= 0; legalCol--) {
            if (noAvailableRightDiagonal(legalDiagonalMoves, legalCol, legalRow)) {
                break;
            } else legalRow++;
        }
    }

    private static boolean noAvailableLeftDiagonal(List<Coordinate> legalDiagonalMoves,
                                                   int legalCol, int legalRow) {
        if (legalRow < 0) {
            return true;
        }
        if (Board.getBoard()[legalCol][legalRow]
                .getPiece() == null) {
            legalDiagonalMoves
                    .add(new Coordinate(legalCol, legalRow));
            return false;
        }
        return true;
    }

    private static boolean noAvailableRightDiagonal(List<Coordinate> legalDiagonalMoves,
                                                    int legalCol, int legalRow) {
        if (legalRow > 7) {
            return true;
        }
        if (Board.getBoard()[legalCol][legalRow]
                .getPiece() == null) {
            legalDiagonalMoves
                    .add(new Coordinate(legalCol, legalRow));
            return false;
        }
        return true;
    }

    public static void getPieceLegalMoves(int colFrom, int rowFrom) {
        if (Board.getBoard()[colFrom][rowFrom]
                .getPiece() != null) {
            Piece piece = Board.getBoard()[colFrom][rowFrom]
                    .getPiece();
            piece.printLegalMoves();
            BoardPrinter.printBoardWithLegalMoves(Board.getBoard(), piece.getLegalMoves());
        }
    }
}