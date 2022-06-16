package encapsulation;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel,boolean duplexPrinter) {
        if (tonerLevel > -1 && tonerLevel <=100){
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = 0;
        this.duplexPrinter = duplexPrinter;
    }
    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int fillToner(int ink){
        if(ink > 0 && ink <=100){
            if(this.tonerLevel + ink > 100){
                return -1;
            }
            this.tonerLevel += ink;
            return this.tonerLevel;
        }
        else{
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.duplexPrinter){
            pagesToPrint = (pages/ 2) + (pages % 2);
            System.out.println("printing in duplex mode");
        }
        this.pagesPrinted += pages;
        return pagesToPrint;

    }
}
