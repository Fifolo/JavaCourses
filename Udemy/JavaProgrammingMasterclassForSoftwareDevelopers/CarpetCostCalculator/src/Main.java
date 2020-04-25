public class Main {
    public static void main(String[] args) {
        Carpet carpet= new Carpet(28);
        Floor floor = new Floor(2.0,3.0);
        Calculator calculator = new Calculator(floor, carpet);

        System.out.println("Total cost = " +calculator.getTotalCost());
    }
}
