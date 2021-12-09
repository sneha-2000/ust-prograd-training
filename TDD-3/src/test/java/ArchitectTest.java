import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArchitectTest {

    @Test
    public void checkForOneCentimeterIsOneCentimeter(){
        Architect architect= new Architect(1, "cm");
        double actualMeasurement= architect.centimeter();
        double expectedMeasurement= 1;
        assertEquals(expectedMeasurement, actualMeasurement);
    }

    @Test
    public void checkForOneMeterIsHundredCentimeters(){
        Architect architect= new Architect(1,"m");
        double actualMeasurement= architect.centimeter();
        double expectedMeasurement= 100;
        assertEquals(expectedMeasurement, actualMeasurement);
    }

    @Test
    public void checkForHundredCentimeterIsZeroPointZeroZeroOneKilometers(){
        Architect architect= new Architect(100,"cm");
        double actualMeasurement= architect.kilometer();
        double expectedMeasurement= 0.001;
        assertEquals(expectedMeasurement, actualMeasurement);
    }

    @Test
    public void throwsExceptionWhenCentimeterIsLessThanOrEqualToZero(){
        assertThrows(IllegalArgumentException.class, ()-> {
            Architect architect =new Architect(-1,"cm");
            architect.centimeter();
        });
    }

    @Test
    public void throwsExceptionWhenKilometerIsLessThanOrEqualToZero(){
        assertThrows(IllegalArgumentException.class, ()-> {
            Architect architect =new Architect(-1,"km");
            architect.kilometer();
        });
    }

    @Test
    public void throwsExceptionWhenUnitIsMillimeter(){
        assertThrows(IllegalArgumentException.class, ()-> {
            Architect architect =new Architect(1,"mm");
            architect.kilometer();
        });
    }
}