package personalWork.inheritance;

public class Car extends Vehicle {
    private int door;
    private int wheels;
    private int gears;
    private boolean isManual;

    private int currentGears;

    public Car(String name, int size, int door, int wheels, int gears, boolean isManual) {
        super(name, size);
        this.door = door;
        this.wheels = wheels;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGears = 0;
    }

    public void changeGear(int currentGear){
        this.currentGears = currentGear;
        System.out.println("Car.setCurrentGear(): changed to "+this.currentGears+" gear");

    }
    public void changeVelocity(int speed, int direction){
        move(speed,direction);
        System.out.println("Car.changeVelocity(): velocity "+speed+ " direction"+direction);

    }

}
