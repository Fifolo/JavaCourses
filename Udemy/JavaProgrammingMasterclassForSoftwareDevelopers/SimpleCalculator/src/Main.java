public class Main {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(50.0);
        calculator.setSecondNumber(5);
        System.out.println("First number = "+calculator.getFirstNumber());
        System.out.println("Second number = "+calculator.getSecondNumber());
        System.out.println("Addition = " +calculator.getAdditionResult());
        System.out.println("Subtraction = "+calculator.getSubtractionResult());
        System.out.println("Multiplication = "+calculator.getMultiplicationResult());
        System.out.println("Division = "+calculator.getDivisionResult());
    }
}
