import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {
    private Converter converter;

    @BeforeEach
    public void setup(){
        converter = new Converter();
    }

    @Nested
    public class ConversionOfUnits{
        @Test
        public void checkIfOneCentimeterIsOneCentimeter(){
            double actualMeasurement= converter.unitConverter(1,"cm","cm");
            double expectedMeasurement = 1;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void checkIfOneMeterIsHundredCentimeter(){
            double actualMeasurement= converter.unitConverter(1,"m","cm");
            double expectedMeasurement = 100;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void checkIfHundredCentimeterIsPointZeroZeroOneKilometer(){
            double actualMeasurement= converter.unitConverter(100,"cm","km");
            double expectedMeasurement = 0.001;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void checkIfOneKilometerIsThousandMeter(){
            double actualMeasurement= converter.unitConverter(100,"cm","m");
            double expectedMeasurement = 1;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void checkIfTwoMeterIsPointZeroZeroTwoKilometer(){
            double actualMeasurement= converter.unitConverter(2,"m","km");
            double expectedMeasurement = 0.002;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void checkIfTenCentimeterIsPointZeroOneMeter(){
            double actualMeasurement= converter.unitConverter(10,"cm","m");
            double expectedMeasurement = 0.1;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void throwsIllegalArgumentExceptionIfMeasurementIsNegative(){
            assertThrows(IllegalArgumentException.class,() -> {
                converter.unitConverter(-1,"cm","cm");});
        }

        @Test
        public void throwsIllegalArgumentExceptionIfMeasurementIsZero(){
            assertThrows(IllegalArgumentException.class,() -> {
                converter.unitConverter(0,"cm","cm");});
        }

        @Test
        public void throwsIllegalArgumentExceptionIfMeasurementIsInvalid(){
            assertThrows(IllegalArgumentException.class,() -> {
                converter.unitConverter(10,"mm","cm");});
        }

    }

    @Nested
    public class ArithmeticOperationsOnUnits{
        @Test
        public void checkIfOneMeterPlusHundredCentimeterIsTwoMeter(){
            double actualMeasurement= converter.addUnit(1,"m",100,"cm");
            double expectedMeasurement = 2;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void checkIfOneMeterMinusFiftyCentimeterIsZeroPointFiveMeterMeter(){
            double actualMeasurement= converter.subtractUnit(1,"m",50,"cm");
            double expectedMeasurement = 0.5;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public  void checkIfTwoHundredCentimeterPlusOneKilometerIsHundredThousandTwoHundredCentimeter(){
            double actualMeasurement = converter.addUnit(200,"cm",1,"km");
            double expectedMeasurement = 100200;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void checkIfTwoThousandCentimeterMinusOneMeterIsNineteenHundredCentimeter(){
            double actualMeasurement= converter.subtractUnit(2000,"cm",1,"m");
            double expectedMeasurement = 1900;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void checkIfSixThousandMeterMinusTwoMeterIsFourThousandMeter(){
            double actualMeasurement= converter.subtractUnit(6000,"m",2,"km");
            double expectedMeasurement = 4000;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void checkIfFiveKilometerMinusTwoKilometerIsThreeKilometer(){
            double actualMeasurement= converter.subtractUnit(5,"km",3,"km");
            double expectedMeasurement = 2;
            assertEquals(expectedMeasurement,actualMeasurement);
        }
    }
}
