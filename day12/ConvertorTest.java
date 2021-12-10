import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertorTest {

    private Convertor convertor;

    @BeforeEach
    public void setUp(){
        convertor=new Convertor();
    }

    @Test
    public void checkForOneCentimeterIsOneCentimeter(){
        double actualMeasurement=convertor.unitConvertor(1,"cm","cm");
        double expectedMeasurement=1;
        assertEquals(expectedMeasurement,actualMeasurement);
    }

    @Test
    public void checkForOneMeterIsHundredCentimeter(){
        double actualMeasurement=convertor.unitConvertor(1,"m","cm");
        double expectedMeasurement=100;
        assertEquals(expectedMeasurement,actualMeasurement);
    }

    @Test
    public void checkForHundredCentimeterIsZeroPointZeroZeroOneKilometer(){
        double actualMeasurement=convertor.unitConvertor(100,"cm","km");
        double expectedMeasurement=0.001;
        assertEquals(expectedMeasurement,actualMeasurement);
    }

    @Test
    public void throwExceptionWhenMeasurementIsLessThanOrEqualToZero(){
        assertThrows(IllegalArgumentException.class,()->{
            convertor.unitConvertor(-1,"cm","cm");

        });

    }



    @Test
    public void throwExceptionWhenUnitIsMillimeter(){
        assertThrows(IllegalArgumentException.class,()->{
            convertor.unitConvertor(1,"mm","mm");

        });


    }

    @Test
    public void throwExceptionWhenUnitIsKilometer(){
        assertThrows(IllegalArgumentException.class,()->{
            convertor.unitConvertor(1,"km","km");

        });


    }


}