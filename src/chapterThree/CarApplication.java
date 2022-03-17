package chapterThree;
import java.util.Scanner;


public class CarApplication {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CarClass toyota = new CarClass("camry", "2009", 1800000,0.05);
        CarClass benz = new CarClass("GLE205", "2020", 12.0, 0.07);
       System.out.printf("the model of the car is: %s%n and the year of the model is: %s%n and the price is: %.2f%n and the discount is %.2f%n  ", toyota.getModel(),toyota.getYear(),toyota.getPrice(),toyota.getPriceDiscount());
        //System.out.print("the model of the car is:"+toyota.getModel()+"\n the year of the model is:"+toyota.getYear()+"\n the price is:"+toyota.getPrice());


        System.out.printf("the model of the car is: %s%n and the year of the model is: %s%n and the price is %.2f%n and the discount is%.2f%n", benz.getModel(),benz.getYear(),benz.getPrice(),benz.getPriceDiscount() );

        System.out.println("Enter the model of toyota");
        String model = input.next();
        toyota.setModel(model);

        System.out.println("Enter the year of the car");
        String year = input.next();
        toyota.setYear(year);

        System.out.println("Enter the price of the car");
        double price = input.nextDouble();
        toyota.setPrice(price);
        System.out.printf("the model of the car is: %s%n and the year of the model is: %s%n and the price is: %.2f%n  ", toyota.getModel(),toyota.getYear(),toyota.getPrice());

        System.out.println("the percentage discount is: " +toyota.getPriceDiscount());

        System.out.println("Enter the model of benz");
        String benzModel = input.next();
        benz.setModel(benzModel);

        System.out.println("Enter the year of the car");
        String benzYear = input.next();
        benz.setYear(benzYear);

        System.out.println("Enter the price of the car");
        double benzPrice = input.nextDouble();
        benz.setPrice(benzPrice);
        System.out.printf("the model of the car is: %s%n and the year of the model is: %s%n and the price is %.2f%n", benz.getModel(),benz.getYear(),benz.getPrice());
    System.out.println("the percentage discount is:" +benz.getPriceDiscount());
    }


















}
