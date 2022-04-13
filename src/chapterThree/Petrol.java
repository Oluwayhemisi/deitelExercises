package chapterThree;

import java.util.Scanner;

public class Petrol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PetrolPurchase cabdriver = new PetrolPurchase("lagos", "crude", 20,147.30,0.20);
        // PetrolPurchase user2 = new PetrolPurchase("lagos", "crude", 20,147.30,20);
        System.out.printf("the location is %s\n and the type of petrol is %s\n and the quantity is %d\n and the price per litre is %.2f\n and the percentage discount is %.2f\n the net purchase is %.2f\n",
                cabdriver.getStationLocation(),cabdriver.getTypeOfPetrol(),cabdriver.getQuantity(),cabdriver.getPricePerLitre(),cabdriver.getPercentageDiscount(), cabdriver.getPurchase());

       System.out.println("Enter location ");
        String location = input.next();
        cabdriver.setLocation(location);

        System.out.println("Enter type of petrol  ");
        String typeOfPetrol = input.next();
        cabdriver.setTypeOfPetrol(typeOfPetrol);

        System.out.println("Enter amount of quantity  ");
        int quantity = input.nextInt();
        cabdriver.setQuantity(quantity);

        System.out.println("Enter type of pricePerLitre  ");
        double price = input.nextDouble();
        cabdriver.setPricePerLitre(price);

        System.out.println("Enter percentage discount  ");
        double discount = input.nextDouble();
        cabdriver.setPercentageDiscount(discount);

        System.out.print(cabdriver.getPurchase());

        System.out.printf("the location is %s\n and the type of petrol is %s\n and the quantity is %d\n and the price per litre is %.2f\n and the percentage discount is %.2f\n the net purchase is %.2f\n",
                cabdriver.getStationLocation(),cabdriver.getTypeOfPetrol(),cabdriver.getQuantity(),cabdriver.getPricePerLitre(),cabdriver.getPercentageDiscount(), cabdriver.getPurchase());





    }
}
