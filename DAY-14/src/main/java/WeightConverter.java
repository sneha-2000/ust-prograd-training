//public class WeightConverter extends MagnitudeConverter {
//    @Override
//    public double unitConverter(double magnitude, String fromUnit, String toUnit) {
//        return super.unitConverter(magnitude, fromUnit, toUnit);
//    }
//
//    @Override
//    public double convertCentiToCenti(double magnitude, String fromUnit) {
//        return super.convertCentiToCenti(magnitude, fromUnit);
//    }
//
//    @Override
//    public double convertToBase(double magnitude, String fromUnit) {
//        return super.convertToBase(magnitude, fromUnit);
//    }
//
//    @Override
//    public double convertKiloToKilo(double magnitude, String fromUnit) {
//        return super.convertKiloToKilo(magnitude, fromUnit);
//    }
//
//    @Override
//    public double addUnit(double magnitude1, String unit1, double magnitude2, String unit2) {
//        return super.addUnit(magnitude1, unit1, magnitude2, unit2);
//    }
//
//    @Override
//    public double subtractUnit(double magnitude1, String unit1, double magnitude2, String unit2) {
//        return super.subtractUnit(magnitude1, unit1, magnitude2, unit2);
//    }
//}
//
//
////        public double unitConverter(double weight,String fromUnit,String toUnit){
////            if(weight<=0){
////                throw new IllegalArgumentException("weight should not be zero or negative");
////            }
////            else{
////                switch (toUnit) {
////                    case "cg" :
////                        return convertToCentigram(weight, fromUnit);
////                    case "g" :
////                        return convertToGram(weight, fromUnit);
////                    case "kg" :
////                        return convertToKilogram(weight, fromUnit);
////                    default :
////                        throw new IllegalArgumentException("Invalid Unit");
////                }
////            }
////        }
////
////        public double convertToCentigram(double weight,String fromUnit){
////            switch (fromUnit) {
////                case "cg" :
////                    return weight;
////                case "g" :
////                    return weight * 100;
////                case "kg" :
////                    return weight* 100000;
////                default :
////                    throw new IllegalArgumentException("Invalid Unit");
////            }
////        }
////
////        public double convertToGram(double weight,String fromUnit){
////            switch (fromUnit) {
////                case "cg" :
////                    return weight / 100;
////                case "g" :
////                    return weight;
////                case "kg" :
////                    return weight* 1000;
////                default :
////                    throw new IllegalArgumentException("Invalid Unit");
////            }
////        }
////
////        public double convertToKilogram(double weight,String fromUnit){
////            switch (fromUnit) {
////                case "cg" :
////                    return weight / 100000;
////                case "g" :
////                    return weight / 1000;
////                case "kg" :
////                    return weight;
////                default :
////                    throw new IllegalArgumentException("Invalid Unit");
////            }
////        }
////
////        public double addUnit(double weight1, String unit1, double weight2, String unit2 ){
////            return unitConverter(weight1,unit1,unit1) + unitConverter(weight2,unit2,unit1);
////        }
////
////        public double subtractUnit(double weight1, String unit1, double weight2, String unit2 ){
////            return unitConverter(weight1,unit1,unit1) - unitConverter(weight2,unit2,unit1);
////        }
////    }
//
//
//
////    public double gramToGram(double weightInGram){
////        return weightInGram;
////
////    }
////
////    public double kilogramToGram(double weightInKilogram) {
////        return weightInKilogram*1000;
////    }
////    public double gramToKilogram(double weightInGram) {
////        return weightInGram/1000;
////    }
//
////}