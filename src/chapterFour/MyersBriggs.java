package chapterFour;

import java.util.Scanner;

public class MyersBriggs {
    private static Scanner input = new Scanner(System.in);
    private static int countA1;
    private static int countB1;
    private static int countA2;
    private static int countB2;
    private static int countA3;
    private static int countB3;
    private static int countA4;
    private static int countB4;
    private  static String pick;


    public static void main(String[] args) {
      questionnaire();
      questionnaireResult();
    }

    private static void questionnaireResult() {
        if(countA1 > countB1){
            System.out.println("E");
        }
        else{
            System.out.println("I");
        }
        if(countA2 > countB2){
            System.out.println("S");
        }
        else {
            System.out.println("N");
        }
        if(countA3 > countB3){
            System.out.println("T");
        }
        else System.out.println("F");
        if(countA4 > countB4){
            System.out.println("J");
        }
        else{
            System.out.println("P");
        }
    }

    private static void questionnaire() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("Enter A or B");
            switch (i) {
                case 1 -> {
                    System.out.println("""
                            1.
                            A.-> Expend energy, enjoy groups 
                            B.-> Conserve Energy, enjoy one on one""");
                    pick = input.nextLine();
                    if (pick.toUpperCase().equals("A")) {
                        countA1++;
                    } else countB1++;
                }
                case 2 -> {
                    System.out.println("""
                            2.
                            A.-> Interpret literally
                            B.-> look for meaning and possibilities
                            """);
                    pick = input.nextLine();
                    if (pick.toUpperCase().equals("A")) {
                        countA2++;
                    } else countB2++;
                }
                case 3 -> {
                    System.out.println("""
                            3.
                            A.-> Logical,Thinking,Questioning
                            B.-> Empathetic,feeling,accomodation
                            """);
                    pick = input.nextLine();
                    if (pick.toUpperCase().equals("A")) {
                        countA3++;
                    } else countB3++;
                }
                case 4 -> {
                    System.out.println("""
                            4.
                            A.-> Organized,Logically
                            B.-> Flexible, Adaptable
                            """);
                    pick = input.nextLine();
                    if (pick.toUpperCase().equals("A")) {
                        countA4++;
                    } else countB4++;
                }
                case 5 -> {
                    System.out.println("""
                            5.
                            A.-> More outgoing, thinking out loud 
                            B.-> more reserved,think to yourself
                            """);
                    pick = input.nextLine();
                    if (pick.toUpperCase().equals("A")) {
                        countA1++;
                    } else countB1++;
                }
                case 6 -> {
                    System.out.println("""
                            6.
                            A.-> Practical, realistic,experimental
                            B.-> imaginative, innovative, theoretical
                            """);
                    pick = input.nextLine();
                    if (pick.toUpperCase().equals("A")) {
                        countA2++;
                    } else countB2++;
                }
                case 7 -> {
                    System.out.println("""
                            7.
                            A.-> candid, straight forward, frank
                            B.-> tactful, kind, encouraging
                            """);
                    pick = input.nextLine();
                    if (pick.toUpperCase().equals("A")) {
                        countA3++;
                    } else countB3++;
                }
                case 8 -> {
                    System.out.println("""
                            8.
                            A.-> plan, schedule
                            B.-> unplanned, spontaneous
                            """);
                    pick = input.nextLine();
                    if (pick.toUpperCase().equals("A")) {
                        countA4++;
                    } else countB4++;
                }
                case 9 -> {
                    System.out.println("""
                            9.
                            A.-> seek many tasks, public activities, interaction with others
                            B.-> seek private, solitary activities with quiet to concentrate
                            """);
                    pick = input.nextLine();
                    if (pick.toUpperCase().equals("A")) {
                        countA1++;
                    } else countB1++;
                }
                case 10 -> {
                    System.out.println("""
                            10.
                            A.-> standard, usual, conventional
                            B.-> different,novel,unique
                            """);
                    pick = input.nextLine();
                    if (pick.toUpperCase().equals("A")) {
                        countA2++;
                    } else countB2++;
                }
                case 11 -> {
                    System.out.println("""
                            11.
                            A.-> firm, tend to criticize, hold the line
                            B.-> gentle, tend to appreciate, conciliate
                            """);
                    pick = input.nextLine();
                    if (pick.toUpperCase().equals("A")) {
                        countA3++;
                    } else countB3++;
                }
                case 12 -> {
                    System.out.println("""
                            12.
                            A.-> regulated,structured
                            B.-> easygoing, "live" and "let live"
                            """);
                    pick = input.nextLine();
                    if (pick.toUpperCase().equals("A")) {
                        countA4++;
                    } else countB4++;
                }
                case 13 -> {
                    System.out.println("""
                            13.
                            A.-> external, communicative, express yourself
                            B.-> internal, reticent, keep to yourself
                            """);
                    pick = input.nextLine();
                    if (pick.toUpperCase().equals("A")) {
                        countA1++;
                    } else countB1++;
                }
                case 14 -> {
                    System.out.println("""
                            14.
                            A.-> focus on here and now
                            B.-> look to the future, the global perspective, big picture 
                            """);
                    pick = input.nextLine();
                    if (pick.toUpperCase().equals("A")) {
                        countA2++;
                    } else countB2++;
                }
                case 15 -> {
                    System.out.println("""
                            15.
                            A.-> tough minded,just
                            B.-> tender hearted,merciful
                            """);
                    pick = input.nextLine();
                    if (pick.toUpperCase().equals("A")) {
                        countA3++;
                    } else countB3++;
                }
                case 16 -> {
                    System.out.println("""
                            16.
                            A.-> preparation plan ahead
                            B.-> go with the flow, adapt as you go
                            """);
                    pick = input.nextLine();
                    if (pick.toUpperCase().equals("A")) {
                        countA4++;
                    } else countB4++;
                }
                case 17 -> {
                    System.out.println("""
                            17.
                            A.-> active, initiate
                            B.-> relective, deliberate
                            """);
                    pick = input.nextLine();
                    if (pick.toUpperCase().equals("A")) {
                        countA1++;
                    } else countB1++;
                }
                case 18 -> {
                    System.out.println("""
                            18.
                            A.-> facts, things,"what is"
                            B.-> ideas, dreams, "what could be,"philosophical
                            """);
                    pick = input.nextLine();
                    if (pick.toUpperCase().equals("A")) {
                        countA2++;
                    } else countB2++;
                }
                case 19 -> {
                    System.out.println("""
                            A.->matter of fact, people oriented
                            B.-> sensitive, people oriented
                            """);
                    pick = input.nextLine();
                    if (pick.toUpperCase().equals("A")) {
                        countA3++;
                    } else countB3++;
                }
                case 20 -> {
                    System.out.println("""
                            20.
                            A.-> control govern
                            B.-> latitude freedom
                            """);
                    pick = input.nextLine();
                    if (pick.toUpperCase().equals("A")) {
                        countA4++;
                    } else countB4++;
                }
            }
        }
    }

}
