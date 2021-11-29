import java.util.Scanner;

interface Polygon{
    void side();
    void area();
}
class Rectangle implements Polygon{
    double length;
    double breadth;
    public Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public void side(){
        System.out.println("Length of rectangle:"+this.length+" Breadth of rectangle:"+this.breadth);
    }
    public void area(){
        System.out.println("Area:"+(length*breadth));
    }
}
class Square implements Polygon{
    double length;
    public Square(double length){
        this.length=length;
    }
    public void side(){
        System.out.println("Length of square:"+this.length);
    }
    public void area(){
        System.out.println("Area:"+(length*length));
    }
}

public class TestInterface {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(4,6);
        Square square=new Square(6);

        rectangle.side();
        rectangle.area();
        
        square.side();
        square.area();
    }

}
