// Super keyword is used to invoke parent class instance variable.
class Main {
    int a = 30;
}

public class Super1 extends Main {
    int a = 20;

    void m(int a) {
      //System.out.println(a);              10
      //System.out.println(this.a);         20
        System.out.println(super.a);     // 30
    }

    public static void main(String[] args) {
        Super1 m = new Super1();
        m.m(10);
    }
}
