import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinTossTest {

    CoinToss coinToss= new CoinToss();

    @Nested // heads=tail
    public class HeadsEqualToTails{

        @Test
        public void checkIfProbabilityOfHeadsAndTailsIsPointFive(){
            assertEquals(coinToss.probabilityOfHead(),coinToss.probabilityOfTail());

        }

    }

    @Nested //  probability of two events occurring together
    public class TwoCoinEventsOccurringTogether{

        @Test
        public void checkIfProbabilityOfHeadIsPointTwoFive(){
            assertEquals(0.25,coinToss.probabilityOfTwoEvents());
        }

        @Test
        public void checkIfProbabilityOfTailIsPointTwoFive(){
            assertEquals(0.25,coinToss.probabilityOfTwoEvents());
        }

        @Test
        public void checkIfProbabilityOfHeadAndProbabilityOfTailIsPointTwoFive(){
            assertEquals(0.25,coinToss.probabilityOfTwoEvents());
        }

        @Test
        public void checkIfProbabilityOfTailAndProbabilityOfHeadIsPointTwoFive(){
            assertEquals(0.25,coinToss.probabilityOfTwoEvents());
        }

    }

    @Nested // probability of an event not occurring
    public class TwoCoinsEventsNotOccurringTogether{

        @Test
        public void checkIfProbabilityOfTwoCoinSEventsNotOccurringTogether(){
            assertEquals(0.75, coinToss.probabilityOfNotGettingTwoEventsTogether());
        }
    }

    @Nested // probability of either two events occurring
    public class EitherTwoCoinsEventsOccurring{

        @Test
        public void checkIfProbabilityOfEitherTwoCoinsEventsOccurring(){
            assertEquals(0.75,coinToss.probabilityOfGettingEitherTwoEvents());
        }

        @Test
        public void throwsIllegalArgumentExceptionWhenProbabilityIsNegative(){
            assertThrows(IllegalArgumentException.class, () -> coinToss.whenProbabilityIsNegative(-1.6));
        }
    }
}










//    As a statistician, I want to be able to know that the probability of a heads in a coin toss is equal to the probability of a tails in a coin toss.
//        As a statistician, I want to be able to know the probability of two events occurring together.
//        As a statistician, I want to be able to know the probability of an event not occurring.
//        As a statistician, I want to be able to know the probability of either two events occurring.
