@FunctionalInterface
interface Addition{
    public int add(int a,int b);
}
interface Subtraction{
    public int sub(int a,int b);
}
interface Multiplication{
    public int mul(int a,int b);
}
public class LambdaExpression {
    public static void main(String[] args) {
        Addition addition=(int a,int b)->{
            return (a+b);
        };
        Subtraction subtraction=(int a,int b)->{
            return (a-b);
        };
        Multiplication multiplication=(int a,int b)->{
            return (a*b);
        };
        System.out.println("Addition:"+addition.add(6,4));
        System.out.println("Subtraction:"+subtraction.sub(6,4));
        System.out.println("Multiplication:"+multiplication.mul(6,4));
    }
}
