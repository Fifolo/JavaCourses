public class Car extends Vehicle {
    private int wheels;
    private int seats;
    private int steeringWheel = 1;
    private int mirror = 3;

    public Car(String name, int speed, int weight, int cost, String colour, int wheels, int seats) {
        super(name, speed, weight, cost, colour);
        this.wheels = wheels;
        this.seats = seats;
    }

    public void riding(){
        super.move();
    }
    public void radio(){
        System.out.println("Car.radio called");
    }
}
