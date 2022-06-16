package turtle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TurtleTest {
    private Turtle turtle;
    private SketchPad sketchPad;

    @BeforeEach
    public void setUp() {
        turtle = new Turtle();
    }

    @Test
    public void testThatTurtleExist() {
        Turtle ijapa = new Turtle();
        assertNotNull(ijapa);
    }

    @Test
    public void testThatTurtlePenIsUpByDefault() {
         turtle.isPenDown();
        assertFalse(turtle.isPenDown());
    }

    @Test
    public void turtleCanMovePenDownTest(){
        turtle.penDown();
        boolean isPenDown = turtle.isPenDown();
        assertTrue(isPenDown);
    }
    @Test
    public void turtleCanMovePenUpTest(){
        turtle.penDown();
        turtle.penUp();
        assertFalse(turtle.isPenDown());
    }
    @Test
    public void turtleDefaultPositionIsEast(){
        Direction result = turtle.getCurrentDirection();
        assertEquals(Direction.EAST,result);

    }
    @Test
    public void testRightThatTurtleCanMovePenOnceFromEast(){
        turtle.moveRight();
        Direction result = turtle.getCurrentDirection();
        assertEquals(Direction.SOUTH,result);
    }
    @Test
    public  void testRightThatTurtleCanMovePenTwiceFromEast(){
        turtle.moveRight();
        turtle.moveRight();
        Direction result = turtle.getCurrentDirection();
        assertEquals(Direction.WEST,result);

    }
    @Test
    public void testRightThatTurtleCanMovePenThriceFromEast(){
        turtle.moveRight();
        turtle.moveRight();
        turtle.moveRight();
        Direction result = turtle.getCurrentDirection();
        assertEquals(Direction.NORTH,result);
    }
    @Test
    public void testRightThatTurtleCanMovePenFourTimesFromEast(){
        turtle.moveRight();
        turtle.moveRight();
        turtle.moveRight();
        turtle.moveRight();
        Direction result = turtle.getCurrentDirection();
        assertEquals(Direction.EAST,result);
    }
    @Test
    public void testRightThatTurtleCanMovePenFiveTimesFromEast(){
        turtle.moveRight();
        turtle.moveRight();
        turtle.moveRight();
        turtle.moveRight();
        turtle.moveRight();
        Direction result = turtle.getCurrentDirection();
        assertEquals(Direction.SOUTH,result);
    }
    @Test
    public void testLeftThatTurtleCanMovePenOnceFromEast(){
        turtle.moveLeft();
        Direction result = turtle.getCurrentDirection();
        assertEquals(Direction.NORTH,result);
    }
    @Test
    public void testLeftThatTurtleCanMovePenTwiceFromEast(){
        turtle.moveLeft();
        turtle.moveLeft();
        Direction result = turtle.getCurrentDirection();
        assertEquals(Direction.WEST,result);
    }
    @Test
    public void testLeftThatTurtleCanMovePenThriceFromEast(){
        turtle.moveLeft();
        turtle.moveLeft();
        turtle.moveLeft();
        Direction result = turtle.getCurrentDirection();
        assertEquals(Direction.SOUTH,result);
    }
    @Test
    public void testLeftThatTurtleCanMovePenFourTimesFromEast(){
        turtle.moveLeft();
        turtle.moveLeft();
        turtle.moveLeft();
        turtle.moveLeft();
        Direction result = turtle.getCurrentDirection();
        assertEquals(Direction.EAST,result);
    }
    @Test
    public void testThatTheTurtleCanMoveForwardToTheEast(){
        turtle.move(5, sketchPad);
        assertEquals(new Position(0,4), turtle.getCurrentPosition());
    }

    @Test
    public void testThatTurtleCanMoveForwardToTheSouth(){

        turtle.move(5, sketchPad);
        turtle.moveRight();
        turtle.move(5, sketchPad);

        assertEquals(new Position(4,4),turtle.getCurrentPosition());
    }
    @Test
    public  void testThatTurtleCanMoveForwardToTheWest(){
        turtle.move(5, sketchPad);
        turtle.moveRight();
        turtle.move(5, sketchPad);
        turtle.moveRight();
        turtle.move(5, sketchPad);
        assertEquals(new Position(4,0),turtle.getCurrentPosition());
    }
    @Test
    public  void testThatTurtleCanMoveForwardToTheNorth(){
        turtle.move(5, sketchPad);
        turtle.moveRight();
        turtle.move(5, sketchPad);
        turtle.moveRight();
        turtle.move(5, sketchPad);
        turtle.moveRight();
        turtle.move(5, sketchPad);
        assertEquals(new Position(0,0),turtle.getCurrentPosition());
    }
    @Test
    public void testThatTurtleCanMoveBackwardToTheWest(){
        turtle.move(5, sketchPad);
        turtle.moveRight();
        turtle.moveRight();
        turtle.move(5, sketchPad);
        assertEquals(new Position(0,0),turtle.getCurrentPosition());
    }
    @Test
    public void testThatTurtleCanMoveBackwardToNorth(){
        turtle.move(5, sketchPad);
        turtle.moveRight();
        turtle.move(5, sketchPad);
        turtle.moveRight();
        turtle.moveRight();
        turtle.move(5, sketchPad);
        assertEquals(new Position(0,4),turtle.getCurrentPosition());
        turtle.moveLeft();
        turtle.move(5, sketchPad);
        assertEquals(new Position(0, 0), turtle.getCurrentPosition());
    }
    @Test
    public void testThatTurtleCanMoveBackwardToEast(){
        turtle.move(5, sketchPad);
        turtle.moveRight();
        turtle.move(5, sketchPad);
        turtle.moveRight();
        turtle.move(5, sketchPad);
        turtle.moveRight();
        turtle.moveRight();
        turtle.move(5, sketchPad);
        turtle.moveLeft();
        turtle.move(5, sketchPad);
        turtle.moveLeft();
        turtle.move(5, sketchPad);
        assertEquals(new Position(0,0),turtle.getCurrentPosition());
    }
    @Test
    public void testThatTurtleCanMoveForwardAndBackward(){
        turtle.move(5, sketchPad);
        turtle.moveRight();
        turtle.move(5, sketchPad);
        turtle.moveRight();
        turtle.move(5, sketchPad);
        turtle.moveRight();
        turtle.move(5, sketchPad);
        turtle.moveRight();
        turtle.moveRight();
        turtle.move(5, sketchPad);
        turtle.moveLeft();
        turtle.move(5, sketchPad);
        turtle.moveLeft();
        turtle.move(5, sketchPad);
        turtle.moveLeft();
        turtle.move(5, sketchPad);
        assertEquals(new Position(0,0),turtle.getCurrentPosition());
    }
    @Test
    public void whenPenIsDDown_turtleWritesFacingEastTest(){
        turtle.penDown();
        SketchPad sketchPad = new SketchPad(5,5);
        turtle.move(5, sketchPad);
        String expected = """
                * * * * *\s
                         \s
                         \s
                         \s
                         \s
                """;
        assertEquals(expected, sketchPad.toString());
        assertEquals(new Position(0, 4), turtle.getCurrentPosition());
    }

    @Test
    public void whenPenIsDDown_turtleWritesFacingSouthTest(){
        turtle.penDown();
        SketchPad sketchPad = new SketchPad(5,5);
        turtle.move(5, sketchPad);
        turtle.moveRight();
        turtle.move(5, sketchPad);
        String expected = """
                * * * * *\s
                        *\s
                        *\s
                        *\s
                        *\s
                """;
        assertEquals(expected, sketchPad.toString());
        assertEquals(new Position(4, 4), turtle.getCurrentPosition());
    }
    @Test
    public void whenPenIsDDown_turtleWritesFacingWestTest(){
        turtle.penDown();
        SketchPad sketchPad = new SketchPad(5,5);
        turtle.move(5, sketchPad);
        turtle.moveRight();
        turtle.move(5, sketchPad);
        turtle.moveRight();
        turtle.move(5,sketchPad);
        String expected = """
                * * * * *\s
                        *\s
                        *\s
                        *\s
                * * * * *\s
                """;
        assertEquals(expected, sketchPad.toString());
        assertEquals(new Position(4, 0), turtle.getCurrentPosition());
    }

}
