import java.sql.SQLOutput;
import java.util.*;
public class Calculator2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y,z=0;
        System.out.print("Enter the first number: ");
        x=sc.nextInt();
        System.out.print("Enter the second number: ");
        y=sc.nextInt();
        try
        {
            z=x/y;
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println(z);
        }
    }
}