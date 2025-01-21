// Static method only access static data and static methods.
public class Static4 {
    int i = 0;
    static void display()
    {
        System.out.println(i);
    }
}
class Static5
{
    static void display()
    {
        display1()
        System.out.println("Static Method");
    }
    void display1()
    {
        System.out.println("Non Static Method")
    }
}