import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> LinkedList= new LinkedList<>();
        LinkedList.add("UST");
        LinkedList.add("Oracle");
        LinkedList.add("TCS");
        LinkedList.add("IBM");
        LinkedList.add("Accenture");
        LinkedList.add(1,"Amazon");
        LinkedList.remove(3);
        LinkedList.addLast("TCS");
        LinkedList.forEach(company ->System.out.println(company));
    }
}

