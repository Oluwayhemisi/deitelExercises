package turtle;

import static turtle.Direction.*;

public class Turtle {
    private Pen biro = new Pen();
    private Direction currentDirection = EAST;
    private Position currentPosition = new Position(0,0);



    public boolean isPenDown() {

        return  biro.isDown();
    }

    public void penDown() {

        biro.penDown();
    }
    public void penUp() {
        biro.penUp();
    }

    public void moveRight() {
        if(currentDirection == EAST) {currentDirection = SOUTH ;}
        else if(currentDirection == SOUTH) {currentDirection = Direction.WEST;}
        else if(currentDirection == Direction.WEST) {currentDirection = Direction.NORTH;}
        else if(currentDirection == Direction.NORTH) {currentDirection = EAST;}


    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void moveLeft() {
        if(currentDirection == EAST) {currentDirection = Direction.NORTH ;}
        else if(currentDirection == Direction.NORTH) {currentDirection = Direction.WEST ;}
        else if(currentDirection == Direction.WEST) {currentDirection = SOUTH ;}
        else if(currentDirection == SOUTH) {currentDirection = EAST ;}
    }

    public void move(int noOfSteps, SketchPad sketchPad) {

        if (isPenDown()){
            if (currentDirection == EAST) {writeOnColumn(noOfSteps, sketchPad);}
            else if (currentDirection == SOUTH) {writeOnRow(noOfSteps, sketchPad);}
            else if (currentDirection == WEST){writeOnColumn(noOfSteps,sketchPad);}
        }

        moveWithoutWriting(noOfSteps);
    }

    private void writeOnRow(int noOfSteps, SketchPad sketchPad) {
        int[][] floor = sketchPad.getFloor();
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();
        noOfSteps = noOfSteps + row;
        for (int i = row; i < noOfSteps; i++) {
            floor[i][column] = 1;
        }
    }

    private void writeOnColumn(int noOfSteps,SketchPad sketchPad ) {
        int[][] floor = sketchPad.getFloor();
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();
        for (int i = column; i < column + noOfSteps; i++) {
            floor[row][i] = 1;
        }
    }
    private void writeOnColumnBackward(int noOfSteps, SketchPad sketchPad){
        int[][] floor = sketchPad.getFloor();
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();
        for (int i = column; i < column + noOfSteps; i++) {

        }
        }

    private void moveWithoutWriting(int noOfSteps) {
        if (currentDirection == EAST){
            increaseColumn(noOfSteps);}
        else if(currentDirection == SOUTH){
            increaseRow(noOfSteps);
        }
        else if(currentDirection == Direction.WEST){
            decreaseColumn(noOfSteps);
        }
        else if(currentDirection == Direction.NORTH){
            decreaseRow(noOfSteps);
        }
    }
    public void increaseColumn(int noOfSteps){
        int currentColumnPosition = currentPosition.getColumn();
            currentPosition.setColumn(currentColumnPosition + (noOfSteps -1));

    }
    public void increaseRow(int noOfSteps){
        int currentRowPosition = currentPosition.getRow();
        currentPosition.setRow(currentRowPosition + (noOfSteps -1));
    }
    public void decreaseColumn(int noOfSteps){
        int currentColumnPosition = currentPosition.getColumn();
        currentPosition.setColumn(currentColumnPosition - (noOfSteps - 1));
    }
    public void decreaseRow(int noOfSteps){
        int currentRowPosition = currentPosition.getRow();
        currentPosition.setRow(currentRowPosition - (noOfSteps -1));
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

}
