import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Square square;
    @Nested
    class TestingAreaFunction{

        @Test
        public void areaOfSquareWithSideTenIsHundred(){
            square= new Square(10);
            double actualArea= square.area();
            double expectedArea= 100;
            assertEquals(actualArea,expectedArea);
        }

        @Test
        public void areaOfSquareWithSideFourIsSixteen(){
            square= new Square(4);
            double actualArea= square.area();
            double expectedArea= 16;
            assertEquals(actualArea, expectedArea);
        }

        @Test
        public void areaOfSquareWithSideThreePointZeroIsNinePointZero(){
            square= new Square(3.0);
            double actualArea= square.area();
            double expectedArea= 9.0;
            assertEquals(actualArea, expectedArea);
        }

        @Test
        public void areaOfSquareWithSideMinusThreePointZeroIsError() {
            assertThrows(IllegalArgumentException.class, () -> new Square(-3.0));
        }

        @Test
        public void areaOfSquareWithSideZeroIsError() {
            assertThrows(IllegalArgumentException.class, ()-> new Square(0));
        }
    }

    @Nested
    class TestingPerimeterFunction{

        @Test
        public void perimeterOfSquareWithSideTwoPointZeroIsEightPointZero(){
            square= new Square(2.0);
            double actualPerimeter= square.perimeter();
            double expectedPerimeter= 8.0;
            assertEquals(actualPerimeter, expectedPerimeter);
        }

        @Test
        public void perimeterOfSquareWithSideEightIsThirtyTwo(){
            square= new Square(8);
            double actualPerimeter= square.perimeter();
            double expectedPerimeter= 32;
            assertEquals(actualPerimeter, expectedPerimeter);
        }

        @Test
        public void perimeterOfSquareWithSideSixIsTwentyFour(){
            square= new Square(8);
            double actualPerimeter= square.perimeter();
            double expectedPerimeter= 32;
            assertEquals(actualPerimeter, expectedPerimeter);
        }

        @Test
        public void perimeterOfSquareWithSideMinusOnePointZeroIsError() {
            assertThrows(IllegalArgumentException.class, () -> new Square(-1.0));
        }

        @Test
        public void perimeterOfSquareWithSideZeroIsError() {
            assertThrows(IllegalArgumentException.class, () -> new Square(0));
        }
    }

}