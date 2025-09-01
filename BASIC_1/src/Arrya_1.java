import java.util.Scanner;

public class Arrya_1 {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            System.out.println("Enter number for index "+ i +":");
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < a.length; i++){
            System.out.println("element at "+i+" " + a[i]);
        }

    }
}
