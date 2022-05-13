package ChapterEight;

public class Animal {
    private String name;
    private int size;
    private int brain;
    private int weight;
    private int body;

    public Animal(String name, int size, int brain, int weight, int body) {
        this.name = name;
        this.size = size;
        this.brain = brain;
        this.weight = weight;
        this.body = body;
    }

    public void move(int speed){
        System.out.println("Animal.move called.Animal is moving at speed: "+speed);

    }

    public void eat(){
        System.out.println("Animal.eat was called");

    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getBrain() {
        return brain;
    }

    public int getWeight() {
        return weight;
    }

    public int getBody() {
        return body;
    }
}
