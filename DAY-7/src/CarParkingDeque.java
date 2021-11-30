import java.util.ArrayDeque;
import java.util.List;

public class CarParkingDeque {
    public static void main(String[] args) {
        ArrayDeque<String> ParkCar= new ArrayDeque<String>();
        ArrayDeque<String> ParkCar1= new ArrayDeque<String>(List.of("Brown car","Black car"));
        ParkCar.add("red car");
        ParkCar.add("Orange car");
        ParkCar.addFirst("White car");

        System.out.println(ParkCar.size());
        System.out.println(ParkCar.isEmpty());

        ParkCar.addFirst("Blue Car");
        ParkCar.addLast("Grey Car");

        ParkCar.forEach(car -> System.out.println(car));
        ParkCar.addAll(ParkCar1);

        System.out.println(ParkCar);
        System.out.println(ParkCar.peekLast());
        System.out.println(ParkCar.poll());
        System.out.println(ParkCar.contains("White"));
    }
}
