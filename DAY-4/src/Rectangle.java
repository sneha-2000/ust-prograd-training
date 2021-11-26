public class Rectangle {
    public double length,breadth;
    public double area(){
        return length*breadth;
    }
}

class Cuboid extends Rectangle{
    public double height;
    public double volume(){
        return area()*height;
    }
}
class Main{
    public static void main(String[] args){
        Cuboid cuboid= new Cuboid();
        cuboid.length=5;
        cuboid.breadth=2;
        cuboid.height=4;
        System.out.println(cuboid.area());
        System.out.println(cuboid.volume());

    }
}
