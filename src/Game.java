import BoardEngine.*;
import Pieces.LegalMoveEngine.LegalMoveEngine;
import Pieces.MoveEngine.MoveEngine;
import Pieces.Piece;

import java.util.Scanner;

public class Game {
    public static void startNew() {
        MoveCounter moveCounter = new MoveCounter();
        boolean isFinished = false;

        Scanner sc = new Scanner(System.in);

        //Sets up the board with pieces.
        BoardBuilder.setupBoard(Board.getBoard());
        BoardPrinter.printBoard(Board.getBoard());

        while (!isFinished) {
            moveCounter.increaseCount();
            System.out.println("Type coordinate or move:");
            String input = sc.nextLine();
            String[] tokens = input.split("-");
            String colrowFrom = tokens[0];
            int colFrom = 8 - Integer
                    .parseInt(String.valueOf(colrowFrom.charAt(1)));
            int rowFrom = colrowFrom.charAt(0) - 97;

            if (tokens.length == 1) {
                LegalMoveEngine.getPieceLegalMoves(colFrom, rowFrom);
            } else {
                String colrowTo = tokens[1];
                int colTo = 8 - Integer
                        .parseInt(String.valueOf(colrowTo.charAt(1)));
                int rowTo = colrowTo.charAt(0) - 97;
                MoveEngine.movePiece(colFrom, rowFrom, colTo, rowTo);
            }
        }
    }
}