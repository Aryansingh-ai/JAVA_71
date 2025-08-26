class Parent {
    void greet() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    void sayHi() {
        System.out.println("Hi from Child");
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.greet();  // from Parent
        obj.sayHi();  // from Child
    }
}
