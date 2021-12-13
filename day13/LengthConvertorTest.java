import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthConvertorTest {
    LengthConvertor lengthConvertor=new LengthConvertor();

    @Nested
    class CentimeterToCentimeterTest{
        @Test
        public void checkForOneCentimeterIsOneCentimeter(){
            double actualMeasurement=lengthConvertor.centimeterToCentimeter(1);
            double expectedMeasurement=1;
            assertEquals(expectedMeasurement,actualMeasurement);
        }
    }

    @Nested
    class MeterToCentimeterTest{
        @Test
        public void checkForOneMeterIsHundredCentimeter(){
            double actualMeasurement=lengthConvertor.meterToCentimeter(1);
            double expectedMeasurement=100;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

    }

    @Nested
    class CentimeterToKilometer{
        @Test
        public void checkForHundredCentimeterIsZeroPointZeroZeroOneKilometer(){
            double actualMeasurement=lengthConvertor.centimeterToKilometer(100);
            double expectedMeasurement=0.001;
            assertEquals(expectedMeasurement,actualMeasurement);
        }
    }


    @Nested
    class TestingAddingFunction{

        @Test
        public void verifyOneMeterPlusHundredCentimeterIsTwoMeter(){
            double actualSum=1+lengthConvertor.centimeterToMeter(100);
            double expectedSum=2;
            assertEquals(expectedSum,actualSum);

        }


        @Test
        public void verifyTwoHundredCentimeterPlusOneKilometerIsOneLakhAndTwoHundredCentimeter(){

            double actualSum=200+lengthConvertor.kilometerToCentimeter(1);
            double expectedSum=100200;
            assertEquals(expectedSum,actualSum);
        }

    }
    @Nested
    class TestingSubFunction{
        @Test
        public void verifyOneMeterMinusFiftyCentimeterIsZeroPointFiveMeter(){
            double actualDifference=1-lengthConvertor.centimeterToMeter(50);
            double expectedDifference=0.5;
            assertEquals(expectedDifference,actualDifference);
        }

        @Test
        public void verifyTwoThousandCentimeterMinusOneMeterIsOneThousandAndNineHundredCentimeter(){
            double actualDifference=2000-lengthConvertor.meterToCentimeter(1);
            double expectedDifference=1900;
            assertEquals(expectedDifference,actualDifference);
        }

    }


}