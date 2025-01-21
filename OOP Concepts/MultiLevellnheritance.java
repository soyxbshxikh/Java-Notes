// MultiLevellnheritance Lecture
class studentinfo {
    public int roll;
    String name;

    public void info(int x, String y) {
        roll = x;
        name = y;
    }
}

class studentmarks extends studentinfo {
    int english, history, math;

    public void marks(int a, int b, int c) {
        english = a;
        history = b;
        math = c;
    }
}

class studentdata extends studentmarks {
    public void data() {
        System.out.println("Roll No : " + roll);
        System.out.println("Student Name : " + name);
        System.out.println("English : " + english);
        System.out.println("History : " + history);
        System.out.println("Math : " + math);
    }
}

public class MultiLevellnheritance {
    public static void main(String[] args) {
        studentdata d = new studentdata();
        d.marks(77, 88, 99);
        d.info(1, "Soyab Shaikh");
        d.data();

    }

}
