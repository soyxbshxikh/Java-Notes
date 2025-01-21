// Constuctor Lecture
import java.util.*;

class student {
    int roll;
    String name;
    double fee;

    public student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll number : ");
        roll = sc.nextInt();
        System.out.println("Enter name : ");
        name = sc.next();
        System.out.println("Enter fee : ");
        fee = sc.nextInt();
        sc.close();
    }

    public void show() {
        System.out.println("Details are");
        System.out.println(roll + "\t" + name + "\t" + fee);
    }
}

public class Constuctor {
    public static void main(String[] args) {
        student s = new student();
        s.show();

    }

}
