// MultipleInharitance Lecture
interface square {
    public void soyab(int a);
}

interface circle {
    final double v = 3.14;

    public void sadiya(double b);
}

interface rectangle {
    public void sultana(int c, int d);
}

class area implements square, circle, rectangle {
    @Override
    public void soyab(int a) {
        System.out.println("Area of square is " + (a * a));
    }

    @Override
    public void sadiya(double b) {
        System.out.println("Area of circle is " + (v * b * b));
    }

    @Override
    public void sultana(int c, int d) {
        System.out.println("Area of rectangle is " + (c * d));
    }

}

public class MultipleInharitance {

    public static void main(String[] args) {
        area a = new area();
        a.soyab(10);
        a.sadiya(20);
        a.sultana(30, 40);
    }
}