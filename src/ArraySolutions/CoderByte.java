package ArraySolutions;

import java.util.HashMap;
import java.util.Map;

public class CoderByte {
    public static String returnDistinct(String str){

        Map<Integer, String> chars = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            int duplicateCount = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if(chars.containsValue(String.valueOf(str.charAt(i)))){
                    duplicateCount++;
                }
                else{
                    if(String.valueOf(str.charAt(i)).equals(String.valueOf(str.charAt(j)))){
                    duplicateCount++;}
                }
            }
            if(duplicateCount == 1){
                return String.valueOf(str.charAt(i));
            }
            chars.put(duplicateCount, String.valueOf(str.charAt(i)));
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(returnDistinct("jdkjlfjw mn,h"));
    }
}
