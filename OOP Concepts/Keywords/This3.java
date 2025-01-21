// This keyword is used to invoke current class constructor
class Main
{
    Main()
    {
        System.out.println("Test1 class constructor");
    }
    Main(int i)
    {
        this();
        System.out.println("Test2 class constructor");
    }
}

public class This3 {
    public static void main(String[] args)
    {
        Main t=new Main(10);
    }
}
