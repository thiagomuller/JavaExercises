package EncapsulatedPrinterChallenge;

public class Printer {
    private int tonerLevel = 100;
    private int numberOfPagesPrinted = 0;
    private boolean isADuplexPrinter;

    public Printer(boolean isADuplexPrinter) {
        this.isADuplexPrinter = isADuplexPrinter;
    }

    private void fillUpToner(){
        if(tonerLevel < 20){
            tonerLevel = 100;
        }
        else{
            System.out.println("Tonner is still usable, use it a little bit more before filling it");
        }
    }

    public void printPage(){
        if(isADuplexPrinter){
            numberOfPagesPrinted ++;
            tonerLevel -= 20;
            System.out.println("Just printed on both sides of the page, and your current toner level is: " + tonerLevel);
            System.out.println("You can still print " + tonerLevel/20 + " times");
        }
        else{
            numberOfPagesPrinted ++;
            tonerLevel -= 10;
            System.out.println("Just printed on one side of the page only, and your current toner level is : " + tonerLevel);
            System.out.println("You can still print " + tonerLevel/10 + " times");
        }

        if(tonerLevel <= 10 && !isADuplexPrinter){
            fillUpToner();
        }
        else if(tonerLevel <= 20 && isADuplexPrinter){
            fillUpToner();
        }
    }

    public void pagesPrinted(){
        System.out.println("The number of pages printed so far is : " + numberOfPagesPrinted);
    }
}
