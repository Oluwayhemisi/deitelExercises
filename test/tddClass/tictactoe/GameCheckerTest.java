package tddClass.tictactoe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameCheckerTest {

    @Test
    void assertThatPlayerOneCanWinGame(){
        //given
        GameChecker gameChecker = new GameChecker();
        Player playerOne = new Player("X", "Player One");
        Player playerTwo = new Player("O", "Player Two");
        Marker[][] board = new Marker[3][3];
        board[1][0] = Marker.X;
        board[0][0] = Marker.O;
        board[1][1] = Marker.X;
        board[0][2] =  Marker.O;
        board[1][2] = Marker.X;
        Result result = gameChecker.checkForWin(board, playerOne, playerTwo);
        assertTrue(result.isWon());
        assertEquals(result.getWinningPlayer(), "Player One");
    }
    @Test
    void assertThatPlayerTwoCanWinGame(){
        //given
        GameChecker gameChecker = new GameChecker();
        Player playerOne = new Player("X", "Player One");
        Player playerTwo = new Player("O", "Player Two");
        Marker[][] board = new Marker[3][3];
        //when board is in player two winning position
        board[1][0] = Marker.X;
        board[0][0] = Marker.O;
        board[0][1] = Marker.X;
        board[1][1] =  Marker.O;
        board[2][1] = Marker.X;
        board[2][2] = Marker.O;
        // when gamechecker checks for win
        Result result = gameChecker.checkForWin(board, playerOne, playerTwo);
        // assertThat game is won
        assertTrue(result.isWon());
        // assert that winning player is player two
        assertEquals(result.getWinningPlayer(), "Player Two");
    }

    @Test
    void assertThatGameCanBeADraw(){
        //given
        GameChecker gameChecker = new GameChecker();
        Player playerOne = new Player("X", "Player One");
        Player playerTwo = new Player("O", "Player Two");
        Marker[][] board = new Marker[3][3];
        //when board is in player two winning position
        board[0][1] = Marker.X;
        board[1][1] = Marker.O;
        board[1][2] = Marker.X;
        board[1][0] =  Marker.O;
        board[2][2] = Marker.X;
        board[2][1] = Marker.O;
        board[2][0] = Marker.X;
        board[0][2] = Marker.O;
        board[0][0] = Marker.X;
        // when gamechecker checks for win
        Result result = gameChecker.checkForWin(board, playerOne, playerTwo);
        // assertThat game is won
        assertFalse(result.isWon());
        // assert that winning player is player two
        assertEquals(result.getWinningPlayer(), "");
    }

    @Test
    void assertWhenGameIsInANonWinningPosition(){
        //given
        GameChecker gameChecker = new GameChecker();
        Player playerOne = new Player("X", "Player One");
        Player playerTwo = new Player("O", "Player Two");
        Marker[][] board = new Marker[3][3];
        //when board is in player two winning position
        board[0][1] = Marker.X;
        board[1][1] = Marker.O;
        board[1][2] = Marker.X;
        board[1][0] =  Marker.O;
        board[2][2] = Marker.X;
        board[2][1] = Marker.O;
        // when gamechecker checks for win
        Result result = gameChecker.checkForWin(board, playerOne, playerTwo);
        // assertThat game is won
        assertFalse(result.isWon());
        // assert that winning player is player two
        assertEquals(result.getWinningPlayer(), "");
    }

    @Test
    void testThatPlayerCanPlay() {
        //given
        Player player = new Player("X", "Player One");
        Board board = new Board();
        int[] playCoordinates = new int[]{1, 2};
        //when
        player.play(playCoordinates, board.getBoard());
        assertEquals(board.getBoard()[1][2], Marker.X);
    }
    @Test
    void testBaseThreeConverter(){
        GameEngine gameEngine = new GameEngine();
        int[] gamePosition = gameEngine.convertToBaseThree(5);
        assertEquals(gamePosition[0], 1);
        assertEquals(gamePosition[1], 2);
    }

}