package UNIT_3;
import  java.util.HashSet;
import java.util.Set;
import java.util.*;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements: ");
        int x = sc.nextInt();
        for(int i=0;i<x;i++){
            System.out.println("Enter product no." + (i+1) );
            String product = sc.next();
            hs.add(product);
            System.out.println(hs.size());
        }
    }
}
