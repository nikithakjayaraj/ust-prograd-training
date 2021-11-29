abstract class Figure {
    abstract void area();

}
class Square extends Figure {
    double length;
    public Square(double length){
        this.length=length;
    }
    public void area()
    {
        System.out.println("Area of Square:"+length*length);
    }

}
class Triangle extends Figure{
    double length;
    double breadth;
    public Triangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public void area()
    {
        System.out.println("Area of Triangle:"+(length*breadth)/2);
    }
}
class TestAbstract{
    public static void main(String[] args) {
        Square square= new Square(10);
        Triangle triangle=new Triangle(6,2);
        square.area();
        triangle.area();
    }
}