package chapterFive;

import java.security.SecureRandom;

public class Password {
    public static void main(String[] args) {

        char[] lettersAndNumbers = {'a','b', 'c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J',
        'K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9'};

        String password = "";
        // do all 12 times
        //get a random number
        //fetch the letter that corresponds with number
        //add letter to password

        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < 12; i++) {
            int number = secureRandom.nextInt(62);
            password += lettersAndNumbers[number];

        }

        System.out.println(password);
        //output password


    }

}
