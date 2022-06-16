package tddClass.tictactoe;

import java.util.Scanner;

public class GameEngine {
    private GameChecker gameChecker;
    public GameEngine() {
        gameChecker = new GameChecker();
    }

    public String run(Player playerOne, Player playerTwo, Marker[][] board) {
        int maxCountOfPlays = 5;
        Result result = gameChecker.checkForWin(board, playerOne, playerTwo);
        boolean isWon = result.isWon();
        while (!isWon && maxCountOfPlays  > 0){
            int[] boardPosition = promptPlayer(board, "Player One");
            playerOne.play(boardPosition, board);
            printBoard(board);
            maxCountOfPlays = maxCountOfPlays - 1;
            result = gameChecker.checkForWin(board, playerOne, playerTwo);

            if (maxCountOfPlays > 0){
                isWon = result.isWon();
                if (isWon){
                    return result.getWinningPlayer();
                }
                boardPosition = promptPlayer(board, "Player Two");
                playerTwo.play(boardPosition, board);
                printBoard(board);
            }

        }
        return result.getWinningPlayer();
    }

    private void printBoard(Marker[][] board) {
        System.out.println("\n".repeat(50));

        for (int i = 0; i < board.length; i++) {
            System.out.println("__________________________________");
            for (int j = 0; j < board[i].length; j++) {
                System.out.printf(" %7s  |", board[i][j]);
            }
            System.out.println();
        }
        System.out.println("__________________________________");

    }

    private int[] promptPlayer(Marker[][] board, String player) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("""
                %s - Enter play position:  """, player);
        int playerPosition = scanner.nextInt();
        while (playerPosition < 0 || playerPosition > 8){
            System.out.println("Please enter a valid position from 0-8: ");
            playerPosition = scanner.nextInt();
        }
        int[] boardPosition = convertToBaseThree(playerPosition);
        while (board[boardPosition[0]][boardPosition[1]] != Marker.EMPTY){
            System.out.printf("%d has already been taken.Please enter a valid position: ", playerPosition);
            playerPosition = scanner.nextInt();
            while (playerPosition < 0 || playerPosition > 8){
                System.out.println("Please enter a valid position from 0-8: ");
                playerPosition = scanner.nextInt();
            }
            boardPosition = convertToBaseThree(playerPosition);
        }
        return boardPosition;
    }

    public int[] convertToBaseThree(int playerPosition) {
        int xPosition = playerPosition/3;
        int yPosition = playerPosition%3;
        return new int[]{xPosition, yPosition};
    }
}
