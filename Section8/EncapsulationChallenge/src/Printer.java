public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount + tonerLevel < 0 || tonerAmount + tonerLevel > 100){
            return -1;
        }
        else{
            tonerLevel += tonerAmount;
            return tonerLevel;
        }
    }  
    
    public int printPages(int pagesToBePrinted){
        int pages;
        if(duplex){
            pages = pagesToBePrinted / 2 + pagesToBePrinted % 2;
            System.out.println("it's a duplex printer");
        }
        else{
            pages = pagesToBePrinted;
        }
        pagesPrinted += pages;
        return pages;
    }
}
