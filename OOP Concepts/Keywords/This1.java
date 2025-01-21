// This keyword is used to refer the current class instance variable.
class Main {
    int i;

    void setValue(int i) {
        this.i = i;
    }

    void show() {
        System.out.println(i);
    }
}

public class This1 {
    public static void main(String[] args) {
        Main t = new Main();
        t.setValue(10);
        t.show();
    }
}