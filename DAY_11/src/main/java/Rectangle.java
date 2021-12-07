import java.io.IOException;
import java.io.InvalidClassException;

public class RectangleArea {
    public double Area(double l, double b){
        if((l<1) || (b<1)){
            throw new ArithmeticException("Not a valid length and breadth");
        }
        return l*b ;
    }
}
