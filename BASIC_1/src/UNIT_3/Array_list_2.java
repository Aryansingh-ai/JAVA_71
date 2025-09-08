package UNIT_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array_list_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("no. of products");
        int n = sc.nextInt();
        ArrayList<String> products = new ArrayList<>();
        for(int i=0;i<n;i++) {
            System.out.println("enter product #"+(i+1));
            products.add(sc.next());
        }
        System.out.println("products are "+products);
        System.out.println("products are in sorted manner ");
        Collections.sort(products);
        System.out.println(products);
        System.out.println("product at no. 3 is "+ products.get(3));
    }
}
