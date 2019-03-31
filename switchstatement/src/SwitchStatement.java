public class SwitchStatement {

    public static void main(String[] args){
        char character = 'B';

        switch(character){
            case 'A':
                System.out.println("Found A");
                break;
            case 'B':
                System.out.println("Found B");
                break;
            case 'C':
                System.out.println("Found C");
                break;
            case 'D':
                System.out.println("Found D");
                break;
            case 'E' : case 'F' : case 'G' :
                System.out.println("Found none of the first four letters");
                break;
        }
    }
}
