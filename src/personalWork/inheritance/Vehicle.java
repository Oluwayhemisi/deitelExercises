package personalWork.inheritance;

public class Vehicle {
    private String name;
    private int size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, int size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

        public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }


    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("vehicle.steer(): steering at "+currentDirection+ " degrees");

    }

    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("vehicle.move(): moving at "+currentVelocity+ " in direction"+currentDirection);
    }

    public void stop(){
    currentVelocity = 0;
    }

}
