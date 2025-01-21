// Super keyword is used to invoke the parent class method.
class main {
    void m1() {
        System.out.println("I'm in class A");
    }
}

public class Super2 extends Main {
    void m1() {
        System.out.println("I'm in class B");
    }

    void show() {
        m1(); // calling the current class method
        super.m1(); // calling the parent class method
    }

    public static void main(String[] args) {
        Super2 obj = new Super2();
        obj.show();
    }
}
