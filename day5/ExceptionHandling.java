import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExceptionHandling {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int x;
        int y;
        Scanner scanner=new Scanner(System.in);
        try
        {
           
            x=scanner.nextInt();
            y=scanner.nextInt();
            System.out.println(x/y);
        
        } catch(ArithmeticException ae)
        {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
        catch(InputMismatchException ime)
        {
            System.out.println("java.util.InputMismatchException");
        }
        
    }
}