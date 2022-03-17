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
}



