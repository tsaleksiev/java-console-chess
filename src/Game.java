import Board.*;
import Pieces.*;

import java.util.Scanner;

public class Game {

    public static void startNew() {
        int movesCounter = 0;
        boolean isFinished = false;
        Scanner sc = new Scanner(System.in);
        Board board = Board.getInstance();

        //Sets up the board with pieces.
        BoardConfigurator.setupBoard(Board.getBoard());
        board.printCurrentBoard();

        while (!isFinished) {
            movesCounter++;

            System.out.println("Type coordinate:");
            String colrow = sc.nextLine();
            int upDownIndex = 8 - Integer.parseInt(String.valueOf(colrow.charAt(1)));
            int leftRightIndex = colrow.charAt(0) - 97;


            Object objOrigin = Board.getBoard()[upDownIndex][leftRightIndex].getPieceOnSquare();

            if (objOrigin instanceof Piece) {
                if (((Piece) objOrigin).getSymbol() == null) {
                    System.out.println("No piece\nNo legal moves");
                    continue;
                }
                System.out.println(((Piece) objOrigin).getSymbol());
                ((Piece) objOrigin).printLegalMoves(upDownIndex, leftRightIndex);

                String destination = sc.nextLine();
                upDownIndex = 8 - Integer.parseInt(String.valueOf(destination.charAt(1)));
                leftRightIndex = destination.charAt(0) - 97;
                Object objDest = Board.getBoard()[upDownIndex][leftRightIndex].getPieceOnSquare();
                ((Piece) objOrigin).findLegalMoves(upDownIndex, leftRightIndex);

                if (objDest instanceof LegalMove) {
                    ((Piece) objOrigin).movePiece(upDownIndex, leftRightIndex);
                }
            }
        }
    }
}