package UNIT_3;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;
public class Array_List_3 {
    public static void main(String[] args) {
        ArrayList<String> products=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of products");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the product "+(i+1)+" ");
            products.add(sc.next());
        }
        Iterator itr=products.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        Collections.sort(products);

        System.out.println("Products in Sorted order: ");
        System.out.println(products);

        System.out.println("Smallest Products: "+products.getFirst());
        System.out.println("largest Products: "+products.getLast());

        products.addLast("lichi"); // to add element in last
        products.addFirst("tuktuk"); //to add element in 1st
        products.add(3,"sona"); //to add element in any place

        System.out.println("all products are: " + products);
    }
}