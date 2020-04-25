class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public void startEngige() {
        System.out.println("Car-> Engine started");
    }

    public void accelerate(int speed) {
        System.out.println(speed + " more speed in Car");
    }

    public void brake() {
        System.out.println("Car stopped");
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
class Porsche extends Car{
    public Porsche(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngige() {
        System.out.println("Porsche -> start engine");;
    }

    @Override
    public void accelerate(int speed) {
        System.out.println(speed + " more speed in Porsche");
    }

    @Override
    public void brake() {
        System.out.println("Porsche stopped");
    }
}
class Tico extends Car{
    public Tico(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngige() {
        System.out.println("Tico -> start engine");;
    }

    @Override
    public void accelerate(int speed) {
        System.out.println(speed + " more speed in Tico");
    }

    @Override
    public void brake() {
        System.out.println("Tico stopped");
    }
}
class Nissan extends Car{
    public Nissan(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngige() {
        super.startEngige();
    }

    @Override
    public void accelerate(int speed) {
        super.accelerate(speed);
    }

    @Override
    public void brake() {
        super.brake();
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Porsche(5,"my");
        car.accelerate(5);
        Car car2= new Tico(1,"my");
        car2.accelerate(5);


    }
}
