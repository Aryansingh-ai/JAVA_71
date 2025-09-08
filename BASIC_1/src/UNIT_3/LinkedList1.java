package UNIT_3;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList1 {

    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the list:");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            ll1.add(sc.nextInt());
        }

        // Descending order traversal
        System.out.println("Elements in descending order:");
        Iterator<Integer> itr = ll1.descendingIterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        // Sorting in ascending order
        Collections.sort(ll1);
        System.out.println("List after sorting in ascending order:");
        System.out.println(ll1);

        sc.close();
    }
}
