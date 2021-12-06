import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calc;

    @BeforeEach
    public void setup() {
        calc = new Calculator();
    }

    @Nested
    class TestingAddFunction {
        @BeforeEach
        public void setup() {
            calc = new Calculator();
        }

        @Test
        public void additionOfFiveAndThreeGivesEight() {
            setup();
            double answer = calc.add(5, 3);
            double expected = 8;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void additionOfFiveAndFiveGivesTen() {
            setup();
            double answer = calc.add(5, 5);
            double expected = 10;
            Assertions.assertEquals(answer, expected);

        }

        @Test
        public void additionOfFiveAndFourGivesNine() {
            setup();
            double answer = calc.add(5, 4);
            double expected = 9;
            Assertions.assertEquals(answer, expected);

        }

    }

    @Nested
    class TestingSubFunction {
        @BeforeEach
        public void setup() {
            calc = new Calculator();
        }

        @Test
        public void subtractionOfFiveAndThreeGivesTwo() {
            setup();
            double answer = calc.sub(5, 3);
            double expected = 2;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void subtractionOfNineAndThreeGivesSix() {
            setup();
            double answer = calc.sub(9, 3);
            double expected = 6;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void subtractionOfNineAndFiveGivesFour() {
            setup();
            double answer = calc.sub(9, 4);
            double expected = 5;
            Assertions.assertEquals(answer, expected);
        }
    }

    @Nested
    class TestingMulFunction {
        @BeforeEach
        public void setup() {
            calc = new Calculator();
        }

        @Test
        public void multiplicationOfThreeAndTwoGivesSix() {
            setup();
            double answer = calc.mul(3, 2);
            double expected = 6;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void multiplicationOfThreeAndThreeGivesNine() {
            setup();
            double answer = calc.mul(3, 3);
            double expected = 9;
            Assertions.assertEquals(answer, expected);
        }


        @Test
        public void multiplicationOfFourAndTwoGivesEight() {
            setup();
            double answer = calc.mul(4, 2);
            double expected = 8;
            Assertions.assertEquals(answer, expected);
        }
    }

    @Nested
    class TestingDivFunction {
        @BeforeEach
        public void setup() {
            calc = new Calculator();
        }

        @Test
        public void divisionOfThreeAndThreeGives1() {
            setup();
            double answer = calc.div(3, 3);
            double expected = 1;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void divisionOfFourAndTwoGivesTwo() {
            setup();
            double answer = calc.div(4, 2);
            double expected = 2;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void throwsExceptionWhenDividedByZero() {
            Assertions.assertThrows(ArithmeticException.class,() -> calc.div(10,0));
        }
    }
}




