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
            //White Turn
            System.out.println("White figure:");
            char whiteFigure = sc.nextLine().charAt(0);

            Move.showAvailablePawnMoves(Board.getBoard(), whiteFigure);

            //Black Turn
            System.out.println("Black:");
            String blackTurn = sc.nextLine();


        }


    }
}
