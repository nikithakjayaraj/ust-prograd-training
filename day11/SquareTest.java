import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {


    @Nested
    class TestingAreaFunction{

        @Test
        public void squareAreaOFSideTwoISFour(){
            Square square=new Square(2);
            double area=square.area();
            double expectedArea=4;
            assertEquals(expectedArea,area);
        }

        @Test
        public void squareAreaOFSideTwoPointFiveIsSixPointTwoFive(){
            Square square=new Square(2.5);
            double area=square.area();
            double expectedArea=6.25;
            assertEquals(expectedArea,area);
        }

        @Test
        public void throwExceptionAreaIfTheSideIsZero(){
            assertThrows(IllegalArgumentException.class,()->new Square(0));
        }

        @Test
        public void throwExceptionAreaIfTheSideIsNegative(){
            assertThrows(IllegalArgumentException.class,()->new Square(-4));
        }

    }



    @Nested
    class TestingPerimeterFunction{

        @Test
        public void squarePerimeterIfSideTwoIsEight(){
            Square square=new Square(2);
            double perimeter=square.perimeter();
            double expectedPerimeter=8;
            assertEquals(expectedPerimeter,perimeter);
        }

        @Test
        public void squarePerimeterIfSideTwoPointFiveIsTen(){
            Square square=new Square(2.5);
            double perimeter= square.perimeter();
            double expectedPerimeter=10;
            assertEquals(expectedPerimeter,perimeter);
        }

        @Test
        public void throwExceptionPerimeterIfSideIsZero(){
           assertThrows(IllegalArgumentException.class,()->new Square(0)) ;
        }

        @Test
        public void throwExceptionPerimeterIfSideIsNegative(){
            assertThrows(IllegalArgumentException.class,()->new Square(-4));
        }
    }


}