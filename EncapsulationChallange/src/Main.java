public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, false);

        System.out.println("Initial page count " + printer.getPagesPrinted());
        printer.printPages(4);
        System.out.println("Total pages printed " + printer.getPagesPrinted());
        printer.printPages(2);
        System.out.println("Total pages printed " + printer.getPagesPrinted());
    }
}
