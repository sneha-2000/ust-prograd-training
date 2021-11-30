import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class ExceptionSolution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
            Scanner input =new Scanner(System.in);
            int x= input.nextInt();
            int y= input.nextInt();
            int d= (x/y);
            System.out.println(d);
        } catch(InputMismatchException ie){
            System.out.println("java.util.InputMismatchException");
        }


        catch(ArithmeticException ae){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }


    }

}

