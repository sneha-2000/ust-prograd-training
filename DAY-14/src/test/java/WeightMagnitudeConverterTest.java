import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeightLengthConverterTest {
    WeightConverter weightConverter=new WeightConverter();

    @Nested
    class BaseToBaseTest{
        @Test
        public void checkIfOneGramIsEqualToOneGram(){
           // double actualWeight=weightConverter.gramToGram(1);
            double actualWeight= weightConverter.unitConverter(1,"g","g");
            double expectedWeight=1;
            assertEquals(expectedWeight,actualWeight);

        }


    }
    @Nested
    class KilogramToGramTest{
        @Test
        public void checkIfZeroPointOneKilogramIsEqualToHundredGram(){
           // double actualWeight=weightConverter.kilogramToGram(0.1);
            double actualWeight= weightConverter.unitConverter(0.1,"kg","g");
            double expectedWeight=100;
            assertEquals(expectedWeight,actualWeight);
        }

    }
    @Nested
    class AdditionOfWeights{
        @Test
        public void checkIfAdditionOfTenGramAndOneKilogramGivesThousandAndTenGrams(){
//          double actualWeight=weightConverter.addingGramAndKilogramToGram(10,1);
          //  double actualWeight=10+weightConverter.kilogramToGram(1);
            double actualWeight= weightConverter.addUnit(10,"g",1,"kg");
            double expectedWeight=1010;
            assertEquals(expectedWeight,actualWeight);
        }

    }

    @Nested
    class SubtractionOfWeights{
        @Test
        public void checkIfSubtractionOfOneAndHalfKilogramAndFiveHundredGramGivesOneKilogram(){
           // double actualWeight=1.5-weightConverter.gramToKilogram(500);
            double actualWeight= weightConverter.subtractUnit(1.5,"kg",500,"g");
            double expectedWeight=1;
            assertEquals(expectedWeight,actualWeight);
        }
    }

}
