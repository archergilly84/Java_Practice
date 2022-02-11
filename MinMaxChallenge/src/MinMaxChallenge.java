import java.util.Scanner;

public class MinMaxChallenge {

    public static void minAndMax() {

        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean isFirst = true;

        while (true){
            System.out.println("Enter Number:");
            if(scanner.hasNextInt()){

                int num = scanner.nextInt();

                if(isFirst){
                    isFirst = false;
                    min = num;
                    max = num;
                }

                if(num > max)
                    max = num;

               if (num < min)
                    min = num;

            } else {
                System.out.println("Invalid Number");
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Min = " + min + " and " + "Max = " + max);
        scanner.close();
    }
}
