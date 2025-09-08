package UNIT_3;

import java.util.Vector;

public class vector1 {
    public static void main(String[] args) {
        Vector<String> vt = new Vector<>();
        vt.add("first");
        vt.add("second");
        vt.add("third");
        vt.add("first");
        vt.add("second");
        vt.add(2,"forth");
        System.out.println(vt.capacity());
        System.out.println(vt.size());
        System.out.println(vt);
    }
}
