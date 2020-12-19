import Board.*;
import Pieces.*;

import java.util.Scanner;

public class Game {

    public static void startNew() {
        int moves = 0;
        boolean isFinished = false;
        Scanner sc = new Scanner(System.in);
        Board board = Board.getInstance();

        //Sets up the board with pieces.
        BoardConfigurator.setupBoard(Board.getBoard());
        board.printCurrentBoard();

        while (!isFinished) {
            moves++;

            System.out.println("Type coordinate:");
            String colrow = sc.nextLine();
            int asd = colrow.charAt(0);
            int dasd = Integer.parseInt(String.valueOf(colrow.charAt(1)));
            int row = colrow.charAt(0) - 97;
            int col = 8 - Integer.parseInt(String.valueOf(colrow.charAt(1)));


            Object obj = Board.getBoard()[col][row].getPieceOnSquare();

            if (obj instanceof Rook) {
                System.out.println("Rook");
                Move.getAvailableRookMoves();
            } else if (obj instanceof King) {
                System.out.println("King");
                Move.getAvailableKingMoves();
            } else if (obj instanceof Queen) {
                System.out.println("Queen");
                Move.getAvailableQueenMoves();
            } else if (obj instanceof Knight) {
                System.out.println("Knight");
                Move.getAvailableKnightMoves();
            } else if (obj instanceof Pawn) {
                System.out.println("Pawn");
                //pawn moves
            } else if (obj instanceof Bishop) {
                System.out.println("Bishop");
                Move.getAvailableBishopMoves();
            } else {
                System.out.println("No piece");
            }
        }

        while (!isFinished) {
            moves++;

            System.out.println("Select figure:");
            char whiteFigure = sc.nextLine().charAt(0);
            System.out.print("Legal moves for ");

            switch (whiteFigure) {
                case 'R':
                    System.out.print("rook:\n");
                    Move.getAvailableRookMoves();
                    break;
                case 'N':
                    System.out.print("knight:\n");
                    Move.getAvailableKnightMoves();
                    break;
                case 'B':
                    System.out.print("bishop:\n");
                    Move.getAvailableBishopMoves();
                    break;
                case 'Q':
                    System.out.print("queen:\n");
                    Move.getAvailableQueenMoves();
                    break;
                case 'K':
                    System.out.print("king:\n");
                    break;
            }

        }
    }
}