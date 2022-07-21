package chapterFourteen;

public class RegularExpression {
    public static void main(String[] args) {
    String alphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(alphanumeric.replaceAll(".","y"));
        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY"));

        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abcDeee"));


        System.out.println(alphanumeric.replaceAll("ijkl99z$", "THE END"));
        System.out.println(alphanumeric.replaceAll("[aei]","X"));
        System.out.println(alphanumeric.replaceAll("[aei][Fj]","X"));
        System.out.println(alphanumeric.replaceAll("[^e]", "X"));
        System.out.println(alphanumeric.replaceAll("[abcdef345678]","X"));
        System.out.println(alphanumeric.replaceAll("[a-fA-F3-8]","X"));
        System.out.println(alphanumeric.replaceAll("[\\d]","X"));
        System.out.println(alphanumeric.replaceAll("[\\D]","X"));


        String whitespace = "i have blanks and tab\t, and also a newline\n";
        System.out.println(whitespace.replaceAll("\\s",""));
        System.out.println(alphanumeric.replaceAll("\\w","x"));
        System.out.println(whitespace.replaceAll("\\w", "X "));
        System.out.println(alphanumeric.replaceAll("\\b","X"));
        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY"));
        System.out.println(alphanumeric.replaceAll("^abcDe{3}", "YYY"));
        System.out.println(alphanumeric.replaceAll("^abcDe+", "YYY"));
    }
}
