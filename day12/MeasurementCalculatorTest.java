import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MeasurementCalculatorTest {
    private MeasurementCalculator calculator;
    @BeforeEach
    public void setup(){
       calculator=new MeasurementCalculator();
    }

        @Nested
        class TestingAddFunction{
            @Test
            public void verifyOneMeterPlusHundredCentimeterIsTwoMeter(){

                double actualSum=calculator.addMeter(1,100);
                double expectedSum=2;
                assertEquals(expectedSum,actualSum);
            }

            @Test
            public void verifyTwoHundredCentimeterPlusOneKilometerIsOneLakhAndTwoHundredCentimeter(){

                double actualSum=calculator.addCentimeter(200,1);
                double expectedSum=100200;
                assertEquals(expectedSum,actualSum);
            }

            @Test
            public void throwExceptionWhenMeasurementIsNegative(){

                assertThrows(IllegalArgumentException.class,()->{
                    calculator.addCentimeter(1,-1);
                });
            }

        }


        @Nested
        class TestingSubFunction{
            @Test
            public void verifyOneMeterMinusFiftyCentimeterIsZeroPointFiveMeter(){
                double actualDifference=calculator.subMeter(1,50);
                double expectedDifference=0.5;
                assertEquals(expectedDifference,actualDifference);
            }

            @Test
            public void verifyTwoThousandCentimeterMinusOneMeterIsOneThousandAndNineHundredCentimeter(){
                double actualDifference=calculator.subCentimeter(2000,1);
                double expectedDifference=1900;
                assertEquals(expectedDifference,actualDifference);
            }


        }

}