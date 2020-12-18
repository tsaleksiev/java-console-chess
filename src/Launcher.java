public class Launcher {
    public static void run() {

        System.out.println("Welcome to console chess.");

        //Setups the board with pieces.
        BoardInitialConfigurator.setupBoard(Board.getEmptyBoard());

        System.out.println("Press start to start.");
    }
}
