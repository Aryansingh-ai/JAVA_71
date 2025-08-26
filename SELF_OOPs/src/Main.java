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
        // Inheritance example
        Child obj = new Child();
        obj.greet();  // from Parent
        obj.sayHi();  // from Child

        // Printing and loop example
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
