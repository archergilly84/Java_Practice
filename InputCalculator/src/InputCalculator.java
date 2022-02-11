import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage () {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int average = 0;


        while (true){
            //System.out.println("Enter a Number: ");
            if (scanner.hasNextInt()){
                sum += scanner.nextInt();
                average++;
            } else {
                System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum/average));
                break;
            }
            scanner.nextLine();
        }
    scanner.close();
    }
}
