package chapterSeven;

public class ArrayCalculation {
    public static void main(String[] args) {
        int largest = 0;
        int sum = 0;
        int average = 0;
        int[] numbers = {3,6,8,1,0,5,4,2,9,0};

//        for(int i = 0; i < 10; i++ ){
//            numbers[i] =
//
//        }
        for (int i = 0; i < 10; i++ ){
            System.out.print(numbers[i]+ " ");
        }
        for (int i = 0; i < 10; i++ ){

            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }
        System.out.println();
        System.out.print("The largest is: " +largest);


        for (int i = 0; i < 10; i++ ){
            sum += numbers[i];
        }
        System.out.println();
        System.out.print("The sum is: " +sum);

        for (int i = 0; i < 10; i++ ){
            average = sum / 10;
        }
        System.out.println();
        System.out.print("The average is: "+average);
    }


}
