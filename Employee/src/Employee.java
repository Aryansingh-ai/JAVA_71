public class Employee {
    int emp_id;
    String name;
    double salary;
    static String Emp_org = "KHUD KI DUKAN";
    public Employee(int emp_id, String name, double salary) {
        this.emp_id = emp_id;
        this.name = name;
        this.salary = salary;
    }
    public void display() {
        System.out.println("emp_id: " + emp_id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
    protected static void emp_info(){
        System.out.println(Emp_org);
    }

}