public class Static3 {
  int empId;
  String empName;
  static String company="TCS";
  Static3(int empId, String empName){
    this.empId=empId;
    this.empName=empName;
  }
  public void display(){
    System.out.println("Employee ID: "+empId);
    System.out.println("Employee Name: "+empName);
    System.out.println("Employee Company: "+company);
    System.out.println("");
  }
  public static void main(String[] args) {
    Static3 emp1=new Static3(101,"Rahul");
    Static3 emp2=new Static3(102,"Raj");
    emp1.display();
    emp2.display();
  }
}
