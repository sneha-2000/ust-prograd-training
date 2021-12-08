public class Square extends Rectangle {
    public Square(double side) {
        super(side,side);
    }
}

//    double length;
//
//    Square(double length){
//        if(length<=0){
//            throw new IllegalArgumentException("Side should not be less than or equal to zero");
//        }
//        this.length= length;
//    }
//
//    public double area(){
//        return length*length;
//    }
//
//    public double perimeter(){
//        return 4*length;
//    }
//}
