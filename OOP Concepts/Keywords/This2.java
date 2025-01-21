// This keyword is used to invoke the current class method
class Main {
    void m1() {
        System.out.println("m1 method");
    }

    void m2() {
        this.m1(); // this.m1() -> m1()
    }
}

public class This2 {
    public static void main(String[] args) {
        Main t = new Main();
        t.m2();
    }
}