public class Printer {
    private int tonerLevel;
    private int pagesPrinted;

    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel < 0 || tonerLevel > 100) ? -1 : tonerLevel;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount < 1 || tonerAmount > 100){return -1;}

        if(tonerAmount + tonerLevel < 1 || tonerAmount + tonerLevel > 100){
            return -1;
        }
        else{
            tonerLevel += tonerAmount;
            return tonerLevel;
        }
    }  
    
    public int printPages(int pagesToBePrinted){
        int pagesToPrint;
        if(duplex){
            pagesToPrint = pagesToBePrinted / 2 + pagesToBePrinted % 2;
            System.out.println("Printing in duplex mode");
        }
        else{
            pagesToPrint = pagesToBePrinted;
        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
