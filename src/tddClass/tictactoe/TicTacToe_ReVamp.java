package tddClass.tictactoe;

import java.util.Scanner;

public class TicTacToe_ReVamp {
    public static void main(String[] args) {
        //initialize players
        System.out.println("""
                Welcome to Tic Tac Toe game""");
        System.out.println("Enter player one's name");
        Scanner scanner = new Scanner(System.in);
        String playerOneName = scanner.next();
        System.out.printf("Welcome %s, Choose your marker (X || O)", playerOneName);
        String playerOneMarker = scanner.next().toUpperCase();
        while (!(playerOneMarker.equals("X") || playerOneMarker.equals("O"))){
            System.out.println("Please choose a valid marker either `X or O` ");
            playerOneMarker = scanner.next().toUpperCase();
        }
        System.out.println("Enter player two's name");
        String playerTwoName = scanner.next();
        String playerTwoMarker;
        if (playerOneMarker.equals("X")){
            playerTwoMarker = "O";
        } else {
            playerTwoMarker = "X";
        }
        //create players
        Player playerOne = createPlayer(playerOneMarker, playerOneName);
        Player playerTwo = createPlayer(playerTwoMarker, playerTwoName);
        //create board
        Board board = createBoard();
        //start game
        GameEngine gameEngine = new GameEngine();
        String winningPlayer = gameEngine.run(playerOne, playerTwo, board.getBoard());
        if (winningPlayer.equals("")){
            System.out.println("Game is a draw");
        }
        else{
            System.out.printf("%s Wins", winningPlayer);
        }
    }

    private static Board createBoard() {
        Board board = new Board();
        return board;
    }

    private static Player createPlayer(String playerOneMarker, String playerName) {
        return new Player(playerOneMarker, playerName);
    }
}
