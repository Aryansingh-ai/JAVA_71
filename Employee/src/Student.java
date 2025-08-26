public abstract class Student {
    int rollno;
    public String name;
    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    abstract void attend_class();

    abstract void give_exam();



    void register() {
        System.out.println("Naam hai "+name+" Student is registering kr rha " + rollno);
    }
}
