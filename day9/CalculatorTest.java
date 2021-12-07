import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

public class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    public void setup(){
        calc = new Calculator();
    }

    @Nested
    class TestingAddFunction{
        @BeforeEach
        public void setup(){
            calc = new Calculator();
        }

        @Test
        public void AdditionOfFiveAndThreeIsEight(){
            double answer = calc.add(5,3);
            double expected=8;
            Assertions.assertEquals(answer,expected);
        }

        @Test
        public void AdditionOfFiveAndZeroIsFive(){
            double answer = calc.add(5,0);
            double expected=5;
            Assertions.assertEquals(answer,expected);
        }

        @Test
        public void AdditionOfFiveAndFiveIsTen(){
            double answer = calc.add(5,5);
            double expected=10;
            Assertions.assertEquals(answer,expected);
        }

    }


    @Nested
    class TestingSubFunction{
        @BeforeEach
        public void setup(){
            calc = new Calculator();
        }

        @Test
        public void SubtractionOfFiveAndThreeIsTwo(){
            double answer = calc.sub(5,3);
            double expected=2;
            Assertions.assertEquals(answer,expected);
        }

        @Test
        public void SubtractionOfFiveAndFiveIsZero(){
            double answer = calc.sub(5,5);
            double expected=0;
            Assertions.assertEquals(answer,expected);
        }

        @Test
        public void SubtractionOfFiveAndEightIsNegativeThree(){
            double answer = calc.sub(5,8);
            double expected=-3;
            Assertions.assertEquals(answer,expected);
        }

    }


    @Nested
    class TestingDivFunction{
        @BeforeEach
        public void setup(){
            calc = new Calculator();
        }

        @Test
        public void DivisionOfFourAndTwoIsTwo(){
            double answer = calc.div(4,2);
            double expected=2;
            Assertions.assertEquals(answer,expected);
        }

        @Test
        public void multiplicationOfFiveAndFiveIsOne(){
            double answer = calc.div(5,5);
            double expected=1;
            Assertions.assertEquals(answer,expected);
        }

        @Test
        public void throwsExceptionWhenDividedByZero(){

            Assertions.assertThrows(ArithmeticException.class, ()->calc.div(5,0));
        }

    }


    @Nested
    class TestingMulFunction{
        @BeforeEach
        public void setup(){
            calc = new Calculator();
        }

        @Test
        public void multiplicationOfFiveAndTwoIsTen(){
            double answer = calc.mul(5,2);
            double expected=10;
            Assertions.assertEquals(answer,expected);
        }

        @Test
        public void multiplicationOfFiveAndZeroIsZero(){
            double answer = calc.mul(5,0);
            double expected=0;
            Assertions.assertEquals(answer,expected);
        }

        @Test
        public void multiplicationOfFiveAndNegativeTwoIsNegativeTen(){
            double answer = calc.mul(5,-2);
            double expected=-10;
            Assertions.assertEquals(answer,expected);
        }

    }



}

