public class Truck extends Car {

    private int trailer;
    public Truck(String name, int speed, int weight, int cost, String colour, int wheels, int seats, int trailer) {
        super(name, speed, weight, cost, colour, wheels, seats);
        this.trailer=trailer;
    }

}
