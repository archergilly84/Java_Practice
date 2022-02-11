import java.util.Scanner;

public class ReadingUserInput {

    public static void sumTenNumbers() {

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while (count <= 10){
            System.out.println("Enter Number #" + count);
            if(scanner.hasNextInt()) {
                count++;
                sum += scanner.nextInt();
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Sum = " + sum);
    }
}
