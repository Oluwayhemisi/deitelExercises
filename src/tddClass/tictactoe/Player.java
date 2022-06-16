package tddClass.tictactoe;

public class Player {
    private final String name;
    private Marker marker;
    public Player(String marker, String playerName) {
        this.name = playerName;
        this.marker = Marker.valueOf(marker);
    }

    public void play(int[] coordinates, Marker[][] board) {
        board[coordinates[0]][coordinates[1]] = marker;
    }

    public Marker getMarker() {
        return marker;
    }

    public String getName() {
        return name;
    }
}
