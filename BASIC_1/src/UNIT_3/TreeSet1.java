package UNIT_3;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        SortedSet<Integer> ts =  new TreeSet<>();
        System.out.println("Enter the no. of elements in the tree");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println("Enter the " + (i+1)  + " in the tree ");
            ts.add(sc.nextInt());
        }
        System.out.println(ts);
        System.out.println(ts.subSet(2,5));
    }
}
