// Inheritance Lecture
class AA {
    public int a, b;

    public void getdata(int x, int y) {
        a = x;
        b = y;
    };
}

class BB extends AA {
    public void show() {
        System.out.println("Addition is " + (a + b));
    }
}

public class Inheritance {
    public static void main(String[] args) {

        BB b = new BB();
        b.getdata(23, 7);
        b.show();
    }
}
