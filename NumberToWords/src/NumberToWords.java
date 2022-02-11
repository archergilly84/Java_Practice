public class NumberToWords {
    public static void numberToWords (int number){
        String output = "";
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int reverseNumber = reverse(number);
            for (int i = 0; i < getDigitCount(number); i++) {

                switch (reverseNumber % 10) {
                    case 0:
                        output += "Zero ";
                        break;
                    case 1:
                        output += "One ";
                        break;
                    case 2:
                        output += "Two ";
                        break;
                    case 3:
                        output += "Three ";
                        break;
                    case 4:
                        output += "Four ";
                        break;
                    case 5:
                        output += "Five ";
                        break;
                    case 6:
                        output += "Six ";
                        break;
                    case 7:
                        output += "Seven ";
                        break;
                    case 8:
                        output += "Eight ";
                        break;
                    case 9:
                        output += "Nine ";
                        break;
                }
                reverseNumber /= 10;
            }
            System.out.println(output);
        }
    }

    public static int reverse (int number){
            int reverseNumber = 0;

            while (number != 0) {
                reverseNumber = (reverseNumber * 10) + (number % 10);
                number /= 10;
            }
            return reverseNumber;
    }


    public static int getDigitCount (int number){
        if (number < 0 ) return -1;
        int count = 1;
        while (number > 9){
            number /= 10;
            count++;
        }
        return count;
    }

}
