package chapterFourteen;

public class StringBuildersConstructor {
    public static void main(String[] args) {
        StringBuilder buffer1 = new StringBuilder();
        StringBuilder buffer2 = new StringBuilder(10);
        StringBuilder buffer3 = new StringBuilder("Hello");


        StringBuilder buffer = new StringBuilder("Hello, how are you?");
        System.out.println(buffer.toString());
        System.out.println(buffer.length());
        System.out.println(buffer.capacity());
        System.out.println(buffer.charAt(4));

        char[] charArray = new char[buffer.length()];
        buffer.getChars(0,buffer.length(),charArray,0);

        for(char character: charArray){
            System.out.print(character);

        }
        buffer.setCharAt(0,'H');
        System.out.println(buffer.toString());


        buffer.reverse();
        System.out.println(buffer.toString());
    }
}
