// employee details Assignment
package Assignment;

public class Employee {
  private String name;
  private String jobTitle;
  private double salary;

  public Employee(String name, String jobTitle, double salary) {
      this.name = name;
      this.jobTitle = jobTitle;
      this.salary = salary;
  }

  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public String getJobTitle() {
      return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
      this.jobTitle = jobTitle;
  }

  public double getSalary() {
      return salary;
  }

  public void setSalary(double salary) {
      this.salary = salary;
  }

  public void printEmployeeDetails() {
      System.out.println("Name: " + name);
      System.out.println("Job Title: " + jobTitle);
      System.out.println("Salary: " + salary);
  }
}

public class Main {
  public static void main(String[] args) {
      Employee employee1 = new Employee("Franziska Waltraud", "HR Manager", 40000);
      System.out.println("\nEmployee Details:");
      employee1.printEmployeeDetails();
  }
}
