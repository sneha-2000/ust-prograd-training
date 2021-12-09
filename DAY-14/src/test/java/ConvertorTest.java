import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertorTest {
    private Convertor convertor;

    @BeforeEach
    public void setup(){
        convertor = new Convertor();
    }

    @Nested
    public class ConversionOfUnits{
        @Test
        public void checkIfOneCentimeterIsOneCentimeter(){
            double actualMeasurement= convertor.unitConvertor(1,"cm","cm");
            double expectedMeasurement = 1;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void checkIfOneMeterIsHundredCentimeter(){
            double actualMeasurement= convertor.unitConvertor(1,"m","cm");
            double expectedMeasurement = 100;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void checkIfHundredCentimeterIsPointZeroZeroOneKilometer(){
            double actualMeasurement= convertor.unitConvertor(100,"cm","km");
            double expectedMeasurement = 0.001;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void checkIfOneKilometerIsThousandMeter(){
            double actualMeasurement= convertor.unitConvertor(100,"cm","m");
            double expectedMeasurement = 1;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void checkIfTwoMeterIsPointZeroZeroTwoKilometer(){
            double actualMeasurement= convertor.unitConvertor(2,"m","km");
            double expectedMeasurement = 0.002;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void checkIfTenCentimeterIsPointZeroOneMeter(){
            double actualMeasurement= convertor.unitConvertor(10,"cm","m");
            double expectedMeasurement = 0.1;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void throwsIllegalArgumentExceptionIfMeasurementIsNegative(){
            assertThrows(IllegalArgumentException.class,() -> {
                convertor.unitConvertor(-1,"cm","cm");});
        }

        @Test
        public void throwsIllegalArgumentExceptionIfMeasurementIsZero(){
            assertThrows(IllegalArgumentException.class,() -> {
                convertor.unitConvertor(0,"cm","cm");});
        }

        @Test
        public void throwsIllegalArgumentExceptionIfMeasurementIsInvalid(){
            assertThrows(IllegalArgumentException.class,() -> {
                convertor.unitConvertor(10,"mm","cm");});
        }

    }

    @Nested
    public class ArithmeticOperationsOnUnits{
        @Test
        public void checkIfOneMeterPlusHundredCentimeterIsTwoMeter(){
            double actualMeasurement= convertor.addUnit(1,"m",100,"cm");
            double expectedMeasurement = 2;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void checkIfOneMeterMinusFiftyCentimeterIsZeroPointFiveMeterMeter(){
            double actualMeasurement= convertor.subtractUnit(1,"m",50,"cm");
            double expectedMeasurement = 0.5;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public  void checkIfTwoHundredCentimeterPlusOneKilometerIsHundredThousandTwoHundredCentimeter(){
            double actualMeasurement = convertor.addUnit(200,"cm",1,"km");
            double expectedMeasurement = 100200;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void checkIfTwoThousandCentimeterMinusOneMeterIsNineteenHundredCentimeter(){
            double actualMeasurement= convertor.subtractUnit(2000,"cm",1,"m");
            double expectedMeasurement = 1900;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void checkIfSixThousandMeterMinusTwoMeterIsFourThousandMeter(){
            double actualMeasurement= convertor.subtractUnit(6000,"m",2,"km");
            double expectedMeasurement = 4000;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void checkIfFiveKilometerMinusTwoKilometerIsThreeKilometer(){
            double actualMeasurement= convertor.subtractUnit(5,"km",3,"km");
            double expectedMeasurement = 2;
            assertEquals(expectedMeasurement,actualMeasurement);
        }
    }
}
