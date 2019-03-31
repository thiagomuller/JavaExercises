package EncapsulatedPrinterChallenge;

public class Main {
    public static void main(String[] args){
        Printer printer  = new Printer(true);

        printer.printPage();
        printer.printPage();
        printer.pagesPrinted();
    }
}
