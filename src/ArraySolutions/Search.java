package ArraySolutions;

import java.util.HashSet;
import java.util.Set;

public class Search {

    public static String searchingChallenge(String str) {

        String last = " ";
        String distinct = " ";
        Set<String> letters = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = i + 1; j < str.length(); j++) {
                if(letters.contains(String.valueOf(str.charAt(i)))){
                    continue;
                }
                if (str.charAt(i) == str.charAt(j)) {
                    letters.add(String.valueOf(str.charAt(i)));
                    count++;
                }
            }

            if(count == 0){
                return String.valueOf(str.charAt(i));
            }
        }
            return null;


    }
    public static void main(String[] args) {
        String val = "agettkgaeee";
        System.out.println(searchingChallenge(val));
    }
}
