public class PrintMegaBytesAndKiloBytes {

    public static void main(String[] args){
        int kiloBytes = 3000;

        printMegaBytesAndKiloBytes(kiloBytes);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else if(kiloBytes > 1024){
            int firstValue = (int) kiloBytes / 1024;
            System.out.println(kiloBytes + " = " + firstValue + " MB and " + kiloBytes % 1024 + "KB");
        }
    }
}
