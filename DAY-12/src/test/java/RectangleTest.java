import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


public class RectangleTest {
    private Rectangle rec;

    @BeforeEach
    public void setup() {
        rec = new Rectangle();
    }

    @Nested
    class TestingAreaFunction {
        @BeforeEach
        public void setup() {
            rec = new Rectangle();
        }

        @Test
        public void areaOfRectangleWithSidesFiveAndThreeIsFifteen() {
            rec.setLength(5);
            rec.setBreadth(3);
            double answer = rec.area();
            double expected = 15;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void areaOfRectangleWithSidesTwoAndFourIsEight() {
            rec.setLength(2);
            rec.setBreadth(4);
            double answer = rec.area();
            double expected = 8;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void areaOfRectangleWithSidesSevenPointZeroAndFourPointZeroIsTwentyEightPointZero() {
            rec.setLength(7.0);
            rec.setBreadth(4.0);
            double answer = rec.area();
            double expected = 28.0;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void areaOfRectangleWithSidesSevenPointTwoAndFourPointFourIsThirtyOnePointSixEight() {
            rec.setLength(7.2);
            rec.setBreadth(4.4);
            double answer = rec.area();
            double expected = 31.680000000000003;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void throwsExceptionWhenAnyOfTheSideIsZeroOrNegative() {
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                rec.setLength(-2);
                rec.setBreadth(3);
                rec.area();
            });
        }
    }

    @Nested
    class TestingPerimeterFunction {
        @BeforeEach
        public void setup() {
            rec = new Rectangle();

        }

        @Test
        public void perimeterOfRectangleWithSidesFiveAndFourIsEighteen(){
            rec.setLength(5);
            rec.setBreadth(4);
            double answer= rec.perimeter();
            double expected= 18;
            Assertions.assertEquals( answer, expected);
        }

        @Test
        public void perimeterOfRectangleWithSidesOneAndFourIsTen(){
            rec.setLength(1);
            rec.setBreadth(4);
            double answer= rec.perimeter();
            double expected= 10;
            Assertions.assertEquals( answer, expected);
        }


        @Test
        public void perimeterOfRectangleWithSidesOnePointOneAndFourIsTenPointTwo(){
            rec.setLength(1.1);
            rec.setBreadth(4);
            double answer= rec.perimeter();
            double expected= 10.2;
            Assertions.assertEquals( answer, expected);
        }

        @Test
        public void perimeterOfRectangleWithSidesTwoPointOneAndFourPointZeroIsTenPointTwelvePointTwo(){
            rec.setLength(2.1);
            rec.setBreadth(4.0);
            double answer= rec.perimeter();
            double expected= 12.2;
            Assertions.assertEquals( answer, expected);
        }

        @Test
        public void throwsExceptionWhenAnyOfTheSideIsNegativeOrZero() {
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                rec.setLength(-2);
                rec.setBreadth(0);
                rec.area();
            });
        }


    }
}


