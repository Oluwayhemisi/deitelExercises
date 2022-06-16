package tddClass;

public class HugeIntegers {
    private int numberOfElement;
    private int[] array = new int[40];


    public void parse(String value) {
        for (int i = 0; i < value.length(); i++) {
            switch (value.charAt(i)) {
                case '0' -> array[i] = 0;
                case '1' -> array[i] = 1;
                case '2' -> array[i] = 2;
                case '3' -> array[i] = 3;
                case '4' -> array[i] = 4;
                case '5' -> array[i] = 5;
                case '6' -> array[i] = 6;
                case '7' -> array[i] = 7;
                case '8' -> array[i] = 8;
                case '9' -> array[i] = 9;
            }
            numberOfElement++;
        }
    }
    public int getSize(){
        return numberOfElement;
    }

    public int[] getArrayItem() {
        return array;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
        }

        return sb.toString();
    }
    public static String add(HugeIntegers hugeIntegers1, HugeIntegers hugeIntegers2){
        int huge1size = hugeIntegers1.getSize();
        int huge2size = hugeIntegers2.getSize();

        String result;
        if(huge1size > huge2size ){
            result = implementAdd(hugeIntegers1, hugeIntegers2,huge2size).toString();
        }
        else{
            result = implementAdd(hugeIntegers2, hugeIntegers1,huge1size).toString();
        }
        return result;
    }
    private static HugeIntegers implementAdd(HugeIntegers hugeIntegers1, HugeIntegers hugeIntegers2, int huge2Size){
        int remainder = 0;
        for (int i = huge2Size-1; i > 0 ; i--) {
            int x = hugeIntegers1.getArrayItem()[i] + hugeIntegers2.getArrayItem()[i];
            if( x >= 10){
                hugeIntegers1.getArrayItem()[i] = x - 10;
                remainder = 1;
            }
            else{
                hugeIntegers1.getArrayItem()[i] = x;

            }
            if (remainder != 0){
                throw new RuntimeException ("sum of first integers is not equal to zero");
            }

        }
        return hugeIntegers1;
    }

    public static String subtract(HugeIntegers hugeIntegers1, HugeIntegers hugeIntegers2) {
        int h1Size = hugeIntegers1.getSize();
        int h2Size = hugeIntegers2.getSize();
        String result = "";
        if(h1Size > h2Size){
            result = implementSubtraction(hugeIntegers1,hugeIntegers2, h2Size);
        }
        else {
            result = implementSubtraction(hugeIntegers2,hugeIntegers1,h1Size);
        }
        return result;
    }
    private static String implementSubtraction(HugeIntegers hugeIntegers1, HugeIntegers hugeIntegers2, int huge2size){
        int borrow = 0;
        for (int i = huge2size-1; i > 0 ; i--) {
            int h1 = hugeIntegers1.getArrayItem()[i];
            int h2 = hugeIntegers2.getArrayItem()[i];

            if(h1 > h2){
                hugeIntegers1.getArrayItem()[i] = h1 - h2 + borrow;
                borrow =0;
            }
            else
                hugeIntegers1.getArrayItem()[i] = h1 + 10 - h2 + borrow;
            borrow = -1;
        }
        if (borrow == -1){
            throw new ArithmeticException("the output of calculation is invalid");
        }
        return hugeIntegers1.toString();
    }
    public boolean isEqualTo(HugeIntegers otherHugeInteger) {
        int counter = 0;
        if(array.length != otherHugeInteger.getSize()){
            return false;
        }
        else{
            for (int i = 0; i < array.length; i++) {
                if (array[i] == otherHugeInteger.getArrayItem().length){
                    counter++;
                }

            }
            return counter == array.length;
        }
    }
    public boolean isGreaterThan(HugeIntegers anotherHugeInteger) {
        if(array.length > anotherHugeInteger.getSize()){
            return true;
        }
        else if(array.length == anotherHugeInteger.getSize()){
            if (array[0] > anotherHugeInteger.getArrayItem()[0]){
                return true;
            }
        }
        return false;
    }

    public boolean isLessThan(HugeIntegers anotherHugeInteger) {
        if (array.length < anotherHugeInteger.getArrayItem().length) {
            return true;
        } else if (array.length == anotherHugeInteger.getSize()) {
            if (array[0] < anotherHugeInteger.getArrayItem()[0]) {
                return true;
            }
        }
        return false;
    }

    public boolean isGreaterThanOrEqualTo(HugeIntegers anotherHugeInteger) {
        if (array.length >= anotherHugeInteger.getSize()) {
            return true;
        } else if (array.length == anotherHugeInteger.getSize()) {
            if (array[0] >= anotherHugeInteger.getArrayItem()[0]) {
                return true;
            }
        }
        return false;
    }

    public boolean isLessThanOrEqualTo(HugeIntegers hugeInteger2) {
        return !isGreaterThanOrEqualTo(hugeInteger2);
    }


}
