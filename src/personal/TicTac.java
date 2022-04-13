package personal;


public class TicTac {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        String [][] tasks = new String[3][3];
        tasks [0][0] = "x";
        tasks [0][1] = "o";
        tasks [0][2] = "x";
        tasks [1][0] = "x";
        tasks [1][1] = "x";
        tasks [1][2] = "x";
        tasks [2][0] = "o";
        tasks [2][1] = "x";
        tasks [2][2] = "o";

        System.out.printf("%s  %s  %s%n",tasks[0][0],tasks[0][1],tasks[0][2]);
        System.out.printf("%s  %s  %s%n",tasks[1][0],tasks[1][1],tasks[1][2]);
        System.out.printf("%s  %s  %s%n",tasks[2][0],tasks[2][1],tasks[2][2]);



    }
}
