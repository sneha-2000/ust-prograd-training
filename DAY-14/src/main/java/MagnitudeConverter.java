public class LengthConverter {

    public double unitConverter(double magnitude,String fromUnit,String toUnit){
        if(magnitude<=0){
            throw new IllegalArgumentException("Measurement should not be zero or negative");
        }
        else{
             switch (toUnit) {
                case "centi" :
                    return convertCentiToCenti(magnitude, fromUnit);
                case "base" :
                     return convertToBase(magnitude, fromUnit);
                case "kilo" :
                     return convertKiloToKilo(magnitude, fromUnit);
                default :
                    throw new IllegalArgumentException("Invalid Unit");
            }
        }
    }

    public double convertCentiToCenti(double magnitude,String fromUnit){
         switch (fromUnit) {
             case "centi" :
                 return magnitude;
             case "base" :
                 return magnitude * 100;
             case "kilo" :
                 return magnitude * 100000;
             default :
                 throw new IllegalArgumentException("Invalid Unit");
        }
    }
// Base can be metre or gram
    public double convertToBase(double magnitude,String fromUnit){
         switch (fromUnit) {
             case "centi" :
                     return magnitude / 100;
             case "base" :
                     return magnitude;
             case "kilo" :
                    return magnitude * 1000;
             default :
                    throw new IllegalArgumentException("Invalid Unit");
        }
    }

    public double convertKiloToKilo(double magnitude,String fromUnit){
         switch (fromUnit) {
             case "centi" :
                    return magnitude / 100000;
             case "base" :
                    return magnitude / 1000;
             case "kilo" :
                    return magnitude;
             default :
                 throw new IllegalArgumentException("Invalid Unit");
        }
    }

    public double addUnit(double magnitude1, String unit1, double magnitude2, String unit2 ){
        return unitConverter(magnitude1,unit1,unit1) + unitConverter(magnitude2,unit2,unit1);
    }

    public double subtractUnit(double magnitude1, String unit1, double magnitude2, String unit2 ){
        return unitConverter(magnitude1,unit1,unit1) - unitConverter(magnitude2,unit2,unit1);
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

