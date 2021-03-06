package turtle;

public class SketchPad {
    private final int[][] floor;


    public SketchPad(int floorRow, int floorColumn){
        floor = new int [floorRow][floorColumn];
    }
    @Override
    public String toString() {
        StringBuilder toBeReturned = new StringBuilder();
        for (int row = 0; row < floor.length; row++) {
            for (int column = 0; column < floor[row].length; column++) {
                if (floor[row][column] == 0) toBeReturned.append("  ");
                if (floor[row][column] == 1) toBeReturned.append("* ");
            }
            toBeReturned.append("\n");
        }
        return toBeReturned.toString();

    }

//        for (var row : floor){
//            for (var column : row){
//                if (column == 0) toBeReturned.append("  ");
//                if (column == 1) toBeReturned.append("* ");
//            }
//            toBeReturned.append("\n");
//        }
//       return toBeReturned.toString();



    public int[][] getFloor(){
        return floor;
    }
}
