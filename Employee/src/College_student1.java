public class College_student1 extends STUDENT1{
    public int roll_no;

    public College_student1(String address , int roll_no) {
        super(address);
        this.roll_no = roll_no;
    }

    public void show_roll(){
        System.out.println("i am in show_roll()" + roll_no);
    }


}
