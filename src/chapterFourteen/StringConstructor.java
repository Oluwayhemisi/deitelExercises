package chapterFourteen;

public class StringConstructor {
    public static void main(String[] args) {
        char[] charArray = {'b','i','r','t','h',' ','d','a','y'};
        String s = new String("Hello");

        String s1 = new String();
        String s2 = new String(s);
        String s3 = new String(charArray);
        String s4 = new String(charArray,6,3);

        System.out.printf("s1 = %s%ns2=  %s%ns3 = %s%ns4 = %s%n", s1,s2,s3,s4);

        String s5 = new String("hello");
        String s6 = "goodbye";
        String s7 = "Happy Birthday";
        String s8 = "happy birthday";

        if(s5.equals("Hello")){
            System.out.println("s5 is equal to \"Hello\"");
        }
        else{
            System.out.println("s5 is not equal to \"Hello\"");
        }

    }



}
