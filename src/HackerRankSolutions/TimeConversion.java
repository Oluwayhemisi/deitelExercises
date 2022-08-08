package HackerRankSolutions;

import java.util.Objects;

public class TimeConversion {
    public static void main(String[] args) {

        System.out.println(timeConversion("12:01:00AM"));
    }
    public static String timeConversion(String s){
        String condition = null;
        String[] tokens = s.split(":");

        if (Objects.equals(tokens[0], "12") && Objects.equals(tokens[2].charAt(2), 'A')){
            tokens[0] = "00";
            condition = tokens[0] +":"+tokens[1]+":"+ tokens[2].substring(0,2);


        }
         if(Objects.equals(tokens[0],"12") && Objects.equals(tokens[2].charAt(2), 'P')){
             condition = tokens[0]+ ":" +tokens[1] + ":" +tokens[2].substring(0,2);

        }
          if( (!Objects.equals(tokens[0],"12"))  && Objects.equals(tokens[2].charAt(2),'P')){
            int val = Integer.parseInt(tokens[0]);
            int sum = val + 12;
            String result = Integer.toString(sum);
             condition = result+ ":" +tokens[1]+ ":" + tokens[2].substring(0,2);
        }
          else{
              condition = tokens[0] + ":" +tokens[1]+ ":" + tokens[2].substring(0,2);
          }
        return condition;
    }

}
