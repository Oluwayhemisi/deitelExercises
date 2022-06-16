package tddClass.tictactoe;

public class Board {
    private Marker[][] board;

    public Board() {
        board = new Marker[3][3];
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = Marker.EMPTY;
            }
        }
    }

    public Marker[][] getBoard() {
        return board;
    }
}
