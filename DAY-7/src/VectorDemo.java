import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> vector= new Vector<String>(8);
        vector.add("BMW");
        vector.add("Benz");
        vector.add("Toyota");
        vector.addElement("Maruti Suzuki");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.forEach(cars -> System.out.println(cars));
    }
}
