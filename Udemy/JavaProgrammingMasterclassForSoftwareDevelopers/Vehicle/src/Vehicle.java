public class Vehicle {
    private String name;
    private int speed;
    private int weight;
    private int cost;
    private String colour;

    public Vehicle(String name, int speed, int weight, int cost, String colour) {
        this.name = name;
        this.speed = speed;
        this.weight = weight;
        this.cost = cost;
        this.colour = colour;
    }
    public void move(){
        System.out.println("Vehicle.move called");
    }
    public void steer(){
        System.out.println("Vehicle.steer called");
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public int getCost() {
        return cost;
    }

    public String getColour() {
        return colour;
    }
}
