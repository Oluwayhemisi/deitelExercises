package ChapterEight;

public class Main {
    public static void main(String[] args) {
//        Car benz = new Car();
//        benz.setModel("GLE");
//        System.out.print("The model of the car is: "+benz.getModel());

//        Animal animal = new Animal("Animal",1,1,5,1);
//        Dog dog = new Dog("Bingo",4,10,15,1,2,"fur");
//        dog.eat();
//        dog.walk();
//        dog.run();

Door door = new Door("Slide",15,8);
Toilet toilet = new Toilet(1,1,1);


Furniture furniture = new Furniture(1,1,1);
Room room = new Room(1,2,2,furniture);

Kitchen kitchen = new Kitchen("Table gas",1,1,1);

House theHouse = new House(room,toilet,kitchen);
//theHouse.getTheKitchen().cook("Rice and stew");
//theHouse.getTheroom().sleep("waterbed");
//theHouse.getTheToilet().bathe("shower");

        theHouse.houseActivities();













    }
}
