package ArraySolutions;

public class SearchTwo {
    public static void main(String[] args) {


        System.out.println(search("u__hello_world123"));
    }
    public  static String search(String str){
        if(str.length()  < 4 || str.length() > 25){
            return "false";
        }
        if(!Character.isLetter(str.charAt(0))){
            return "false";
        }
        for (int i = 0; i < str.length(); i++) {
            if(!(Character.isDigit(str.charAt(i)) || Character.isLetter(str.charAt(i)) || str.charAt(i) == '_')){
                return "false";
            }
        }
        char length =(str.charAt(str.length()-1));
        if(length == '_'){
            return "false";
        }
        return  "true";
    }
}
