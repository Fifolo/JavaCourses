public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(1, true);
        printer.printingPages(10);
        System.out.println(printer.getPagesPrinted() + " pages printed");
        printer.fillUpToner(80);

    }
}
