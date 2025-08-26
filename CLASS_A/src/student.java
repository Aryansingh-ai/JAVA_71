public class student {
    int roll_no;
    String name;
    student(int r,String n){
        name = n ;
        roll_no = r;
    }
    void display() {
        System.out.println("Roll no: " + roll_no);
        System.out.println("Name: " + name);
    }
}
