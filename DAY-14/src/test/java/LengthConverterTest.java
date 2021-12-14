import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class LengthConverterTest {
    MagnitudeConverter lengthConverter=new MagnitudeConverter();



    @Nested
    class CentimeterToCentimeter {
        @Test
        public void checkIfOneCentimeterEqualToOneCentimeter() {
            //architect = new Architect(1);
            double actualLength = lengthConverter.centiToCenti(1);
            double expectedLength = 1;
            assertEquals(expectedLength, actualLength);
        }
    }

    @Nested
    class MeterToCentimeterTest {
        @Test
        public void checkIfOneMeterEqualToHundredCentimeter() {
            //architect = new Architect(1);
            double actualLength = lengthConverter.baseToCenti(1);
            double expectedLength = 100;
            assertEquals(expectedLength, actualLength);
        }

        @Nested
        class CentimeterToKilometerTest {
            @Test
            public void checkIfHundredCentimeterEqualToPointZeroZeroOneKilometer() {
                //architect = new Architect(100);
                double actualLength = lengthConverter.centiToKilo(100);
                double expectedLength = 0.001;
                assertEquals(expectedLength, actualLength);
            }
        }
        @Nested
        class AdditionOfMagnitudesFunction{
            @Test
            public void sumOfOneMeterAndHundredCentimeterGivesTwoMeter()
            {
                //Architect architect=new Architect(1,100);
                double actualLength = 1+lengthConverter.centiToBase(100);
                double expectedLength = 2;
                assertEquals(expectedLength, actualLength);
            }
            @Test
            public void sumOfTwoHundredCentimeterAndOneKilometerIsOneLakhAndTwoHundredCentimeter()
            {
                //Architect architect=new Architect(200,1);
                double actualLength = 200+lengthConverter.kiloToCenti(1);
                double expectedLength = 100200;
                assertEquals(expectedLength, actualLength);
            }

        }

        @Nested
        class SubtractionOfMagnitudeFunction{
            @Test
            public void subtractionOfOneMeterAndFiftyCentimeterGivesZeroPointFiveMeter()
            {
                //Architect architect=new Architect(1,50);
                double actualLength = 1-lengthConverter.centiToBase(50);
                double expectedLength = 0.5;
                assertEquals(expectedLength, actualLength);
            }
            @Test
            public void subtractionOfTwoThousandCentimeterAndOneMeterGivesOneThousandAndNineHundredCentimeter()
            {
                //Architect architect=new Architect(2000,1);
                double actualLength = 2000-lengthConverter.baseToCenti(1);
                double expectedLength = 1900;
                assertEquals(expectedLength, actualLength);
            }

        }
    }

}






//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Nested;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class MagnitudeConverterTest {
//    private MagnitudeConverter magnitudeConverter;
//
//    @BeforeEach
//    public void setup(){
//        magnitudeConverter = new MagnitudeConverter();
//    }
//
//    @Nested
//    public class ConversionOfUnits{
//        @Test
//        public void checkIfOneCentimeterIsOneCentimeter(){
//            double actualMeasurement= magnitudeConverter.unitConverter(1,"cm","cm");
//            double expectedMeasurement = 1;
//            assertEquals(expectedMeasurement,actualMeasurement);
//        }
//
//        @Test
//        public void checkIfOneMeterIsHundredCentimeter(){
//            double actualMeasurement= magnitudeConverter.unitConverter(1,"m","cm");
//            double expectedMeasurement = 100;
//            assertEquals(expectedMeasurement,actualMeasurement);
//        }
//
//        @Test
//        public void checkIfHundredCentimeterIsPointZeroZeroOneKilometer(){
//            double actualMeasurement= magnitudeConverter.unitConverter(100,"cm","km");
//            double expectedMeasurement = 0.001;
//            assertEquals(expectedMeasurement,actualMeasurement);
//        }
//
//        @Test
//        public void checkIfOneKilometerIsThousandMeter(){
//            double actualMeasurement= magnitudeConverter.unitConverter(100,"cm","m");
//            double expectedMeasurement = 1;
//            assertEquals(expectedMeasurement,actualMeasurement);
//        }
//
//        @Test
//        public void checkIfTwoMeterIsPointZeroZeroTwoKilometer(){
//            double actualMeasurement= magnitudeConverter.unitConverter(2,"m","km");
//            double expectedMeasurement = 0.002;
//            assertEquals(expectedMeasurement,actualMeasurement);
//        }
//
//        @Test
//        public void checkIfTenCentimeterIsPointZeroOneMeter(){
//            double actualMeasurement= magnitudeConverter.unitConverter(10,"cm","m");
//            double expectedMeasurement = 0.1;
//            assertEquals(expectedMeasurement,actualMeasurement);
//        }
//
//        @Test
//        public void throwsIllegalArgumentExceptionIfMeasurementIsNegative(){
//            assertThrows(IllegalArgumentException.class,() -> {
//                magnitudeConverter.unitConverter(-1,"cm","cm");});
//        }
//
//        @Test
//        public void throwsIllegalArgumentExceptionIfMeasurementIsZero(){
//            assertThrows(IllegalArgumentException.class,() -> {
//                magnitudeConverter.unitConverter(0,"cm","cm");});
//        }
//
//        @Test
//        public void throwsIllegalArgumentExceptionIfMeasurementIsInvalid(){
//            assertThrows(IllegalArgumentException.class,() -> {
//                magnitudeConverter.unitConverter(10,"mm","cm");});
//        }
//
//    }
//
//    @Nested
//    public class ArithmeticOperationsOnUnits{
//        @Test
//        public void checkIfOneMeterPlusHundredCentimeterIsTwoMeter(){
//            double actualMeasurement= magnitudeConverter.addUnit(1,"m",100,"cm");
//            double expectedMeasurement = 2;
//            assertEquals(expectedMeasurement,actualMeasurement);
//        }
//
//        @Test
//        public void checkIfOneMeterMinusFiftyCentimeterIsZeroPointFiveMeterMeter(){
//            double actualMeasurement= magnitudeConverter.subtractUnit(1,"m",50,"cm");
//            double expectedMeasurement = 0.5;
//            assertEquals(expectedMeasurement,actualMeasurement);
//        }
//
//        @Test
//        public  void checkIfTwoHundredCentimeterPlusOneKilometerIsHundredThousandTwoHundredCentimeter(){
//            double actualMeasurement = magnitudeConverter.addUnit(200,"cm",1,"km");
//            double expectedMeasurement = 100200;
//            assertEquals(expectedMeasurement,actualMeasurement);
//        }
//
//        @Test
//        public void checkIfTwoThousandCentimeterMinusOneMeterIsNineteenHundredCentimeter(){
//            double actualMeasurement= magnitudeConverter.subtractUnit(2000,"cm",1,"m");
//            double expectedMeasurement = 1900;
//            assertEquals(expectedMeasurement,actualMeasurement);
//        }
//
//        @Test
//        public void checkIfSixThousandMeterMinusTwoMeterIsFourThousandMeter(){
//            double actualMeasurement= magnitudeConverter.subtractUnit(6000,"m",2,"km");
//            double expectedMeasurement = 4000;
//            assertEquals(expectedMeasurement,actualMeasurement);
//        }
//
//        @Test
//        public void checkIfFiveKilometerMinusTwoKilometerIsThreeKilometer(){
//            double actualMeasurement= magnitudeConverter.subtractUnit(5,"km",3,"km");
//            double expectedMeasurement = 2;
//            assertEquals(expectedMeasurement,actualMeasurement);
//        }
//    }
//}
