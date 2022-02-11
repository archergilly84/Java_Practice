public class FactorPrinter {

    public static void printFactors (int number){
        if(number < 1){
            System.out.println("Invalid Value");
        } else {
            String output = "";
            for(int i = 1; i <= number; i++){
               if(number % i == 0) output = output + i + " " ;
            }
            System.out.println(output);
        }
    }
}
