import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.w3c.dom.css.Rect;

public class RectangleTest {

    @Nested
    class TestingAreaFunction {


        @Test
        public void rectangleAreaOfFiveAndTwoIsTen() {

            Rectangle rectangle = new Rectangle(5, 2);
            double area = rectangle.area();
            double expectedArea = 10;
            Assertions.assertEquals(area, expectedArea);

        }

        @Test
        public void rectangleAreaOfFiveAndTwoPointTwoIsEleven() {

            Rectangle rectangle = new Rectangle(5, 2.2);
            double area = rectangle.area();
            double expectedArea = 11;
            Assertions.assertEquals(area, expectedArea);

        }

        @Test
        public void throwExceptionAreaIfSidesAreZero() {

            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                Rectangle rectangle = new Rectangle(0, 0);
                rectangle.area();
            });

        }

        @Test
        public void rectangleAreaOfTwoPointTwoAndTwoPointFiveIsFivePointFive() {

            Rectangle rectangle = new Rectangle(2.2, 2.5);
            double area = rectangle.area();
            double expectedArea = 5.5;
            Assertions.assertEquals(area, expectedArea);

        }

        @Test
        public void throwExceptionAreaIfTheSidesAreNegative() {

            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                Rectangle rectangle = new Rectangle(-2, -2);
                rectangle.area();
            });

        }

        @Test
        public void throwExceptionAreaIfTheLengthIsNegative() {

            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                Rectangle rectangle = new Rectangle(-2, 2);
                rectangle.area();
            });

        }

        @Test
        public void throwExceptionAreaIfTheBreadthIsNegative() {

            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                Rectangle rectangle = new Rectangle(2, -2);
                rectangle.area();
            });

        }

    }

    @Nested
    class TestingPerimeterFunction{

        @Test
        public void rectanglePerimeterOfFiveAndTwoIsFourteen(){

            Rectangle rectangle=new Rectangle(5,2);
            double perimeter=rectangle.perimeter();
            double expectedPerimeter=14;
            Assertions.assertEquals(perimeter,expectedPerimeter);

        }

        @Test
        public void rectanglePerimeterOfFiveAndTwoPointTwoIsFourteenPointFour(){

            Rectangle rectangle=new Rectangle(5,2.2);
            double perimeter=rectangle.perimeter();
            double expectedPerimeter=14.4;
            Assertions.assertEquals(perimeter,expectedPerimeter);

        }

        @Test
        public void rectanglePerimeterOfTwoPointTwoAndTwoPointFiveIsNinePointFour() {

            Rectangle rectangle = new Rectangle(2.2, 2.5);
            double perimeter = rectangle.perimeter();
            double expectedPerimeter = 9.4;
            Assertions.assertEquals(perimeter,expectedPerimeter);

        }

        @Test
        public void throwExceptionPerimeterIfSidesAreZero(){

            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                Rectangle rectangle = new Rectangle(0, 0);
                rectangle.perimeter();
            });

        }

        @Test
        public void throwExceptionPerimeterIfTheSidesAreNegative() {

            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                Rectangle rectangle = new Rectangle(-2, -2);
                rectangle.perimeter();
            });

        }

        @Test
        public void throwExceptionPerimeterIfTheLengthIsNegative() {

            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                Rectangle rectangle = new Rectangle(-2, 2);
                rectangle.perimeter();
            });

        }

        @Test
        public void throwExceptionPerimeterIfTheBreadthIsNegative() {

            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                Rectangle rectangle = new Rectangle(2, -2);
                rectangle.perimeter();
            });

        }



    }

}
