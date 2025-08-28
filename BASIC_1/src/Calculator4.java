import java.util.*;
import java.util.Scanner;
public class Calculator4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend , divisor;
        System.out.println("enter no. dividend");
        dividend = sc.nextInt() ;
        System.out.println("enter no. divisor");
        divisor = sc.nextInt() ;

        if(divisor == 0 ){
            throw new ArithmeticException("Division by zero ho rha ");
        }
        int result = dividend/divisor;
        System.out.println("RESULT: " + result);
    }
}
