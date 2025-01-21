// Abstract Class Lecture
abstract class Vehical {
    int tyres;
    abstract public void start();
    public void body(){
        System.out.println("Hello Word");
    }
}

class Car extends Vehical {
    public void start() {
        tyres = 4;
        System.out.println("Car's have "+tyres+" tyres");
        System.out.println("Car Started");
    }
}

class Bike extends Vehical {
    public void start() {
        tyres = 2;
        System.out.println("Bike's have "+tyres+" tyres");
        System.out.println("Bike Started");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        Bike b = new Bike();
        b.start();
    }
}
