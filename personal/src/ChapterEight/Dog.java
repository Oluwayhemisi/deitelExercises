package ChapterEight;

public class Dog extends Animal{
    private int teeth;
    private int tail;
    private String coat;
    private int eyes;

    public Dog(String name, int size, int weight,int teeth,int tail, int eyes,String coat) {
        super(name, size, 1, weight, 1);
        this.teeth = teeth;
        this.tail = tail;
        this.eyes = eyes;
        this.coat =coat;

    }
    private void chew(){
        System.out.println("Dog.chew() was called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat was called");
        chew();
        super.eat();
    }
    public void walk(){
        System.out.println("Dog.walk is called");
        move(5);
    }

    public void run(){
        System.out.println("Dog.run is called");
        move(10);
    }
}
