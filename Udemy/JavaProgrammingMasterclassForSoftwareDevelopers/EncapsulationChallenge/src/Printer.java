public class Printer {

    private int tonerLevel = 100;
    private int pagesPrinted = 0;
    private boolean isDuplex;

    public Printer(int tonerLever, boolean isDuplex) {
        if (tonerLever >= 0 && tonerLever <= 100) {
            this.tonerLevel = tonerLever;
        } else {
            this.tonerLevel = -1;
        }
        this.isDuplex = isDuplex;
    }

    public void fillUpToner(int amount) {
        if (amount <= 0) {
            System.out.println("Wrong amount, nothing happened");
        } else {
            this.tonerLevel = (this.tonerLevel + amount > 100) ? 100 : this.tonerLevel+amount;
            System.out.println("Toner level = "+this.tonerLevel);
        }
    }

    public void printingPages(int pages) {
        if (this.isDuplex) {
            pages = (pages / 2) + pages % 2;
            System.out.println("It is a duplex printer");
        }
        this.pagesPrinted += pages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
