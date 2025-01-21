// Method Over Loading Lecture
class OverLoading {
    int Num1, Num2;
    float Num3, Num4;
    double Num5, Num6;

    public void call(int a, int b) {
        Num1 = a;
        Num2 = b;
    }

    public void call(float a, float b) {
        Num3 = a;
        Num4 = b;
    }

    public void call(double a, double b) {
        Num5 = a;
        Num6 = b;
    }

    // Overloaded method to print the numbers
    public void print() {
        System.out.println(Num1 + Num2);
        System.out.println(Num3 + Num4);
        System.out.println(Num5 + Num6);
    }
}

public class MethodOverLoading {
    public static void main(String[] args) {
        OverLoading call = new OverLoading();
        call.call(10, 20);
        call.call(10.10f, 20.20f);
        call.call(10.10, 20.20);
        call.print();
    }
}
