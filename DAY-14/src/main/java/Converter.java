public class Converter {

    public double unitConverter(double measurement,String fromUnit,String toUnit){
        if(measurement<=0){
            throw new IllegalArgumentException("Measurement should not be zero or negative");
        }
        else{
             switch (toUnit) {
                case "cm" :
                    return convertToCentimeter(measurement, fromUnit);
                case "m" :
                     return convertToMeter(measurement, fromUnit);
                case "km" :
                     return convertToKiloMeter(measurement, fromUnit);
                default :
                    throw new IllegalArgumentException("Invalid Unit");
            }
        }
    }

    public double convertToCentimeter(double measurement,String fromUnit){
         switch (fromUnit) {
             case "cm" :
                 return measurement;
             case "m" :
                 return measurement * 100;
             case "km" :
                 return measurement * 100000;
             default :
                 throw new IllegalArgumentException("Invalid Unit");
        }
    }

    public double convertToMeter(double measurement,String fromUnit){
         switch (fromUnit) {
             case "cm" :
                     return measurement / 100;
             case "m" :
                     return measurement;
             case "km" :
                    return measurement * 1000;
             default :
                    throw new IllegalArgumentException("Invalid Unit");
        }
    }

    public double convertToKiloMeter(double measurement,String fromUnit){
         switch (fromUnit) {
             case "cm" :
                    return measurement / 100000;
             case "m" :
                    return measurement / 1000;
             case "km" :
                    return measurement;
             default :
                 throw new IllegalArgumentException("Invalid Unit");
        }
    }

    public double addUnit(double measurement1, String unit1, double measurement2, String unit2 ){
        return unitConverter(measurement1,unit1,unit1) + unitConverter(measurement2,unit2,unit1);
    }

    public double subtractUnit(double measurement1, String unit1, double measurement2, String unit2 ){
        return unitConverter(measurement1,unit1,unit1) - unitConverter(measurement2,unit2,unit1);
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

