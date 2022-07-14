package chapterFourteen;

public class QuestionOne {
    public void appendAndDelete(){
//        String[] s1 ={"hackerhappy"};
//        String[] s2 = {"hackerrank"};
//
//        String s1 = "hackerbaby";
//        String s2 = "hackerrank";
//        char [] charArray = s1.toCharArray();

        StringBuilder buffer1 = new StringBuilder("hackerhappy");
        StringBuilder buffer2 = new StringBuilder("hackerrank");

        buffer1.delete(6,10);

    }

    public static void main(String[] args) {
        StringBuilder buffer1 = new StringBuilder("hackerhappy");
        StringBuilder buffer2 = new StringBuilder("hackerrank");

        buffer1.delete(6,11);
        System.out.println(buffer1.toString());

//        buffer2.delete()

        buffer1.append("r").append("a").append("n").append("k");
        System.out.println(buffer1.toString());

    }
}
