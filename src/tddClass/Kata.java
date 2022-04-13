package tddClass;

public class Kata {

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        int result = 0;
        if (secondNumber > firstNumber) {
            result = secondNumber - firstNumber;
        }
        if (firstNumber > secondNumber) {
            result = firstNumber - secondNumber;
        }
        return result;
    }

    public double findAreaWith(int radius) {
        return (22 * radius * radius) / 7.0;
    }

    public int flip(int number1) {
        int result = 0;

        if (number1 == 0) result = 1;
        if (number1 == 1) result = 0;
        return result;
    }


    public boolean compareParl(int fiveNumbers) {
        return true;


    }

    public int setPrice(int copies) {
        int result = 0;
        if (copies >= 1 && copies <= 4) {
            result = copies * 2000;
        } else if (copies >= 5 && copies <= 9) {
            result = copies * 1800;
        } else if (copies >= 10 && copies <= 29) {
            result = copies * 1600;
        } else if (copies >= 30 && copies <= 49) {
            result = copies * 1500;
        } else if (copies >= 50 && copies <= 99) {
            result = copies * 1300;
        } else if (copies >= 100 && copies <= 199) {
            result = copies * 1200;
        } else if (copies >= 200 && copies <= 499) {
            result = copies * 1100;
        } else if (copies >= 500) {
            result = copies * 1000;
        }
        return result;


    }


    public int quotientTest(int number1, int number2) {
        return number1 / number2;
    }


    public boolean isEven(int number1) {
        if (number1 % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }


    public int greaterThan(int number1, int number2, int number3, int number4, int number5) {
        int result = 0;

        if (number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5) {
            return number1;
        } else if (number2 > number1 && number2 > number3 && number2 > number4 && number2 > number5) {
            return number2;
        } else if (number3 > number1 && number3 > number2 && number3 > number4 && number3 > number5) {
            return number3;
        } else if (number4 > number1 && number4 > number2 && number4 > number3 && number1 > number5) {
            return number4;
        } else {
            return number5;
        }
    }


    public int divisibleNumber(int number) {

        int counter = 0;
        for (int numb = 1; numb <= number; numb++) {
            if (number % numb == 0) counter++;
        }
        return counter;

    }


    public boolean getNumbers(int number) {
        int counter = 0;
        for (int num = 1; num <= number; num++) {
            if (number % num == 0) counter++;
        }
        if (counter == 2) {

            return true;

        } else{ return false;}
    }

    public int returnNumberOfFactors(int number) {
        int count = 2;
        for (int i = 2; i <= (number/2); i++) {
            if (number%i==0  && !((number / i) < i)){
                count += 2;
            }
        }
        return count;
    }

    public int testMax(int [] number) {
        int largest = 0;
        for (int i = 0; i < 10; i++) {
        if (number[i] >= largest ) {
            largest = number[i];
        }
        }
         return largest;

    }

    public int findMinimum(int[] number) {
        int minimum =0;
        for (int i = 0; i < 10; i++) {
            if (number[i] < minimum) {
                minimum = number[i];
            }

        }
        return minimum;
    }

    public int findAverage(int[] number) {
        int sum = 0;
        int average = 0;
        for (int i = 0; i < 10; i++){
            sum += number[i];
            average = sum / 10;
        }
        return average;
    }

    public String win(int dice1, int dice2) {
        String total= "";
        int add = dice1 + dice2;
        if ((add == 7) || (add == 11)){
            total = "you win";

        }
        return total;
    }

    public String lose(int dice1, int dice2) {
        String total= "";
        int add = dice1 + dice2;
        if ((add == 2) || (add == 3) || (add == 12)){
            total = "you lose";

        }
        return total;
    }
}


