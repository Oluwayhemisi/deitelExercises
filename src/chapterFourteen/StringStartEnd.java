package chapterFourteen;

public class StringStartEnd {
    public static void main(String[] args) {
        String[] strings = {"started", "started", "ended", "ending"};
        for (String string : strings) {
            if (string.startsWith("st")) {
                System.out.printf("\"%s\" starts with \"st\" %n", string);
            }
        }
        for (String string : strings) {
            if (string.startsWith("art", 2)) {
                System.out.printf("\"%s\" starts with \"art\" at position 2%n %n", string);
            }
        }
    }
}