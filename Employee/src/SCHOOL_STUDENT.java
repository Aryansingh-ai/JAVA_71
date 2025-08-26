public class SCHOOL_STUDENT extends Student {
    SCHOOL_STUDENT(int rollno , String name) {
        super(rollno, name);
    }
    public void attend_class() {
        System.out.println(name+" is Attending class");
    }
    public void give_exam() {
        System.out.println(name+" is Giving exam");
    }
}