package chapterFourteen;

public class StringBuilderAppend {
    public static void main(String[] args) {
        Object objectRef = "hello";
        String string = "goodbye";
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean booleanValue = true;
        char characterValue = 'Z';
        int integerValue = 7;
        long longValue = 10000000000L;
        float floatValue = 2.5f;
        double doubleValue = 33.333;
        String s = new StringBuilder().append("Hello").append("BC").append(22).toString();
        System.out.println(s.toString());


        StringBuilder buffer = new StringBuilder();
        buffer.insert(0,objectRef);
        System.out.println(buffer.toString());

        buffer.delete(0,0);
        System.out.println(buffer.toString());
    }
}
