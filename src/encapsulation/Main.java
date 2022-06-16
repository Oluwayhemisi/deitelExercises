package encapsulation;

public class Main {
    public static void main(String[] args) {
    Printer printer = new Printer(50,true);
        System.out.println("initial page count = "+printer.getPagesPrinted());
        int numberOfPages = printer.printPages(5 );
        System.out.println("pages printed was "+numberOfPages+ " new total print count for printer = "+numberOfPages);
    }
}
