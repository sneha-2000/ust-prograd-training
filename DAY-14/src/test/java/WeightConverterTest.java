import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeightConverterTest {
    WeightConverter weightConverter=new WeightConverter();

    @Nested
    class GramToGramTest{
        @Test
        public void checkIfOneGramIsEqualToOneGram(){
            double actualWeight=weightConverter.gramToGram(1);
            double expectedWeight=1;
            assertEquals(expectedWeight,actualWeight);

        }


    }
    @Nested
    class KilogramToGramTest{
        @Test
        public void checkIfZeroPointOneKilogramIsEqualToHundredGram(){
            double actualWeight=weightConverter.kilogramToGram(0.1);
            double expectedWeight=100;
            assertEquals(expectedWeight,actualWeight);
        }

    }
    @Nested
    class AdditionOfWeights{
        @Test
        public void checkIfAdditionOfTenGramAndOneKilogramGivesThousandAndTenGrams(){
//          double actualWeight=weightConverter.addingGramAndKilogramToGram(10,1);
            double actualWeight=10+weightConverter.kilogramToGram(1);
            double expectedWeight=1010;
            assertEquals(expectedWeight,actualWeight);
        }

    }

    @Nested
    class SubtractionOfWeights{
        @Test
        public void checkIfSubtractionOfOneAndHalfKilogramAndFiveHundredGramGivesOneKilogram(){
            double actualWeight=1.5-weightConverter.gramToKilogram(500);
            double expectedWeight=1;
            assertEquals(expectedWeight,actualWeight);
        }
    }

}
