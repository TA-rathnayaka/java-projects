public class Printer {
    private int tonerLevel = -1;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel < 100 && tonerLevel > 0){
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }
    public void addToner(int tonerAmount){
        if ((tonerLevel + tonerAmount ) <= 100 && tonerAmount > 0) {
            System.out.println("Toner is filled up");
            tonerLevel += tonerAmount;
        }
        else if (tonerLevel + tonerAmount > 100) {
            System.out.println("Exceeds the maximum amount");
        }else {
            System.out.println("Invalid toner amount");
        }

    }
    public void printPages(int pages){
        System.out.println("Pages are printed");
        if (duplex) {
            pagesPrinted += Math.round(pages/2);
            System.out.println("printing in duplex mode");
        }
        else{
            pagesPrinted += pages;
        }



    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

}
