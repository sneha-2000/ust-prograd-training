 public class MagnitudeConverter{

        public double centiToCenti(double magnitudeInCenti){
                return magnitudeInCenti;
        }
        //Base can be metre or gram
        public double centiToBase(double magnitudeInCenti){
            return magnitudeInCenti/100;
        }
        public double baseToCenti(double magnitudeInBase){
                return magnitudeInBase*100;
        }
        public double centiToKilo(double magnitudeInCenti){
                return magnitudeInCenti/100000;
        }
        public double baseToBase(double magnitudeInMeterOrInGram){
                return magnitudeInMeterOrInGram;
        }
        public double baseToKilo(double magnitudeInKilo){
                return magnitudeInKilo/1000;
        }
        public double kiloToBase(double magnitudeInKilo){
                return magnitudeInKilo*1000;
        }
        public double kiloToCenti(double magnitudeInKilo){
                return magnitudeInKilo*100000;
        }


    }



//    public double unitConvertor(double measurement, String fromUnit, String toUnit){
//        if(measurement<= 0){
//            throw new IllegalArgumentException("Measurement can't be less than or equal to zero");
//        }
//
//        else {
//            if(toUnit=="cm"){
//                return   convertToCentimeter(measurement, fromUnit);
//            }
//            else if(toUnit=="km"){
//                return  convertToKilometer(measurement, fromUnit);
//            }
//            else {
//                throw new IllegalArgumentException("Not a valid unit");
//            }
//        }
//
//
//    }
//
//    public double convertToCentimeter(double measurement, String fromUnit) {
//        if (fromUnit == "cm") {
//
//            return measurement;
//
//        }
//        else if(fromUnit=="m"){
//            return measurement * 100;
//        }
//        else {
//            throw new IllegalArgumentException("Not a valid unit");
//        }
//
//    }
//
//    public double convertToKilometer(double measurement, String fromUnit) {
//        if (fromUnit == "cm") {
//
//            return measurement / 100000;
//
//        }
//
//        else {
//            throw new IllegalArgumentException("Not a valid unit");
//        }
//
//    }

