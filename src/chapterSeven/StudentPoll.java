package chapterSeven;

public class StudentPoll {
    public static void main(String[] args) {
        int  [] responses ={1,2,5,4,3,4,5,2,1,3,3,3,2,4,2,4,3,12,1};
        int [] frequency=new int[6];

        for(int answer = 0; answer < responses.length; answer++){
            try{
                ++frequency[responses[answer]];
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.printf("responses[%d] = %d%n%n",answer,responses[answer]);
            }

        }
        System.out.printf("%s%10s%n", "Rating", "frequency");
        for (int rating = 1; rating < frequency.length; rating++) {
            System.out.printf("%6d%10d%n", rating,frequency[rating]);

        }
    }
}
