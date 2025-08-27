import java.sql.SQLOutput;
import java.util.*;
public class Calculator3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y,z=0;
        System.out.print("Enter the two numbers: ");
        try
        {
            x=sc.nextInt();
            y=sc.nextInt();
            z=x/y;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println(z);
        }
    }
}