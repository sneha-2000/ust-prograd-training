public class Architect {

    private double measurement;
    private String unit;
    public Architect(double measurement, String unit){
        if(measurement<= 0){
            throw new IllegalArgumentException("Measurement can't be less than or equal to zero");
        }
         this.measurement= measurement;

        if (!unit.equals("cm") && !unit.equals("m")){
            throw new IllegalArgumentException("Unit can't be other than centimeter or meter");
        }
         this.unit=unit;
    }

    public double centimeter() {
        if (unit == "cm") {

            return measurement;

        }

        else if(unit=="m"){
            return measurement * 100;
        }

//        else if(unit =="km"){
//            return measurement * 1000;
//        }
      return 0;
    }

    public double kilometer() {
        if (unit == "cm") {

            return measurement / 100000;

        }

        return 0;
    }

}
