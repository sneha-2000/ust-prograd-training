import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


public class RectangleAreaTest {
    @Nested
    class TestingAreaOfRectangle {
        private RectangleArea area;
        //  @BeforeEach
        // public void setup(){
        // RectangleArea area = new RectangleArea();
    }

    @Test
    public void areaOfRectangleWithSidesFiveAndThreeIsFifteen() {
        RectangleArea area = new RectangleArea();
        double answer = area.Area(5, 3);
        double expected = 15;
        Assertions.assertEquals(answer, expected);
    }

    @Test
    public void areaOfRectangleWithSidesTwoAndFourIsEight() {
        RectangleArea area = new RectangleArea();
        double answer = area.Area(2, 4);
        double expected = 8;
        Assertions.assertEquals(answer, expected);
    }

    @Test
    public void throwsExceptionWhenAnyOfTheSideIsZeroOrNegative() {
        RectangleArea area = new RectangleArea();
        Assertions.assertThrows(ArithmeticException.class, () -> area.Area(-2, 3));
    }
}






