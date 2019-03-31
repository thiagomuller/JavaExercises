package MyLinkedList;

public class Main {
    public static void main(String[] args){
        ListItem newListItem = new ListItem("Thiago");

        int result = newListItem.compareTo("Patricia");

        System.out.println(result);
    }
}
