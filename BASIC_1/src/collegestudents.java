public class collegestudents extends student{
    collegestudents(int roll_no,String name){
        super(roll_no,name);
    }
    public void attend_class(){
        System.out.println(name+" is attending college classes online");
    }
    public void give_exam(){
        System.out.println(name+" is giving exam online");
    }
}

