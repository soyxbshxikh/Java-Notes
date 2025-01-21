// ConstAndInharitance Lecture
class empdata {
      public int empno;
      public String name;

      public empdata(int x, String y) {
            empno = x;
            name = y;
      }
}

class empdetails extends empdata {
      public int age, salary;
      long ctcNo;

      public empdetails(int x, String y, int a, int s, long n) {
            super(x, y);
            age = a;
            salary = s;
            ctcNo = n;
      }

}

class showEmp extends empdetails {
      public showEmp(int x, String y, int a, int s, long n) {
            super(x, y, a, s, n);
      }

      public void show() {
            System.out.println("Employee Id : " + empno);
            System.out.println("Employee Name : " + name);
            System.out.println("Age : " + age);
            System.out.println("Contact Number : " + ctcNo);
            System.out.println("Salary : " + salary);
      }
}

public class ConstAndInharitance {

      public static void main(String[] args) {
            showEmp s = new showEmp(39, "Soyab", 20, 20000, 8830422747L);
            s.show();

      }
}
