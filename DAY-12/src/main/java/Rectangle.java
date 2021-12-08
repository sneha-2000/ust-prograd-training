
public class Rectangle {
    private double length;
    private double breadth;


    Rectangle(double length, double breadth){
        setLength(length);
        setBreadth(breadth);
    }
    Rectangle(){
        setLength(1);
        setBreadth(1);
    }

    public double getBreadth() {
        return breadth;
    }

    public double getLength() {
        return length;
    }

    public void setBreadth(double breadth) {
        if(breadth<=0){
            throw new IllegalArgumentException("Breadth should be greater than zero");
        }
        this.breadth = breadth;

    }

    public void setLength(double length) {
        if(length<=0){
            throw new IllegalArgumentException("Length should be greater than zero");
        }
        this.length = length;
    }

    public double area(){

        return length*breadth ;
    }

    public double perimeter(){

        return (2 * (length + breadth));
    }
}
