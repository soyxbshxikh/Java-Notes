// Object And Class Lecture
class data {
    private int a, b;

    public void getdata(int x, int y) {
        a = x;
        b = y;
    }

    public void show() {
        System.out.println("Addition is" + (a + b));
    }
}

public class ObjectAndClass {
    public static void main(String[] args) {
        data d = new data();
        d.getdata(5, 7);
        d.show();
    }
}