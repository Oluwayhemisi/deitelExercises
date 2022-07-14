package chapterFourteen;

public class StringValueOf {
    public static void main(String[] args) {
        char [] charArray = {'a','b','c','d','e','f'};
        boolean booleanValue = true;
        char characterValue = 'Z';
        int integerValue = 7;
        long longValue = 10000000000L;
        float floatValue = 2.5f;
        double doubleValue = 33.333;
        Object objectRef = "hello";

        System.out.println(String.valueOf(charArray));

    }
}
