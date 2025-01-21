// this keyword Assignment
public class Job {
    String name;
    String jobTitle;
    double salary;
    public void Imp(String name, String jobTitle, double salary ){
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public void show(){
        System.out.println("Employee Details: ");
        System.out.println(name + "\t" + jobTitle + "\t" + salary);
        System.out.println("Updated Salary: ");
        final double Bonus = 800;
        System.out.println(Bonus + salary);
    }
}

public class Employee {
    public static void main(String[] args) {
        Job j1 = new Job();
        j1.Imp("Soyab", "Manager", 100000);
        j1.show(); 

    }
}
