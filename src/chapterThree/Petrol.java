package chapterThree;

import java.util.Scanner;

public class Petrol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PetrolPurchase user1 = new PetrolPurchase("lagos", "crude", 20,147.30,0.20);
        // PetrolPurchase user2 = new PetrolPurchase("lagos", "crude", 20,147.30,20);
        System.out.printf("the location is %s\n and the type of petrol is %s\n and the quantity is %d\n and the price per litre is %.2f\n and the percentage discount is %.2f\n the net purchase is %.2f\n",
                user1.getStationLocation(),user1.getTypeOfPetrol(),user1.getQuantity(),user1.getPricePerLitre(),user1.getPercentageDiscount(), user1.getPurchase());

       System.out.println("Enter location ");
        String location = input.next();
        user1.setLocation(location);

        System.out.println("Enter type of petrol  ");
        String typeOfPetrol = input.next();
        user1.setTypeOfPetrol(typeOfPetrol);

        System.out.println("Enter amount of quantity  ");
        int quantity = input.nextInt();
        user1.setQuantity(quantity);

        System.out.println("Enter type of pricePerLitre  ");
        double price = input.nextDouble();
        user1.setPricePerLitre(price);

        System.out.println("Enter percentage discount  ");
        double discount = input.nextDouble();
        user1.setPercentageDiscount(discount);

        System.out.print(user1.getPurchase());

        System.out.printf("the location is %s\n and the type of petrol is %s\n and the quantity is %d\n and the price per litre is %.2f\n and the percentage discount is %.2f\n the net purchase is %.2f\n",
                user1.getStationLocation(),user1.getTypeOfPetrol(),user1.getQuantity(),user1.getPricePerLitre(),user1.getPercentageDiscount(), user1.getPurchase());





    }
}
