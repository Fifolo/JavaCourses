import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner= new Scanner(System.in);
        int count=0;
        int sum=0;
        int number=0;
        boolean isFirst=true;
        while (true){
            boolean isInt=scanner.hasNextInt();
            if(isInt) {
                number = scanner.nextInt();
                count++;
                if (isFirst) {
                    sum = number;
                    isFirst = false;
                } else {
                    sum += number;

                }
            }else{
                System.out.println("SUM = "+sum+" AVG = "+Math.round((double)sum/count));
                break;
            }

        }
        scanner.close();
    }
}
