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
            int upDownCol = 8 - Integer.parseInt(String.valueOf(colrow.charAt(1)));
            int leftRightRow = colrow.charAt(0) - 97;



            Object obj = Board.getBoard()[upDownCol][leftRightRow].getPieceOnSquare();

            if (obj instanceof Rook) {
                System.out.println(((Rook) obj).getColor() + " rook");
                //TODO - leftRightRow, upDownCol constructor
                Move.printAvailableRookMoves(leftRightRow, upDownCol);
            } else if (obj instanceof King) {
                System.out.println("King");
                Move.printAvailableKingMoves();
            } else if (obj instanceof Queen) {
                System.out.println("Queen");
                Move.printAvailableQueenMoves();
            } else if (obj instanceof Knight) {
                System.out.println("Knight");
                Move.printAvailableKnightMoves();
            } else if (obj instanceof Pawn) {
                System.out.println("Pawn");
                //pawn movesCounter
            } else if (obj instanceof Bishop) {
                System.out.println("Bishop");
                Move.printAvailableBishopMoves();
            } else {
                System.out.println("No piece");
            }
        }

        while (!isFinished) {
            movesCounter++;

            System.out.println("Select figure:");
            char whiteFigure = sc.nextLine().charAt(0);
            System.out.print("Legal movesCounter for ");

            switch (whiteFigure) {
                case 'R':
                    System.out.print("rook:\n");
                    Move.printAvailableRookMoves(1, 1);
                    break;
                case 'N':
                    System.out.print("knight:\n");
                    Move.printAvailableKnightMoves();
                    break;
                case 'B':
                    System.out.print("bishop:\n");
                    Move.printAvailableBishopMoves();
                    break;
                case 'Q':
                    System.out.print("queen:\n");
                    Move.printAvailableQueenMoves();
                    break;
                case 'K':
                    System.out.print("king:\n");
                    break;
            }

        }
    }
}