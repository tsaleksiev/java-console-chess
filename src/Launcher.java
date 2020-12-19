public class Launcher {
    public static void run() {

        System.out.println("Welcome to console chess.");

        Board board = Board.getInstance();

        //Setups the board with pieces.
        BoardInitialConfigurator.setupBoard(board.getBoard());
        board.printCurrentBoard();

        System.out.println("Press start to start.");
    }
}
