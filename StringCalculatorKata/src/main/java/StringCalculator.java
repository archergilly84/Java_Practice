public class StringCalculator {

    public int add(String numbers) {
        int sum = 0;
        String[] numberArray;
        if(numbers.contains("/")){
            String[] numbersAndSeperator = numbers.split("\n");
            String seperator = numbersAndSeperator[0].substring(2);
            numberArray = numbersAndSeperator[1].split(seperator);
        } else {
            numberArray = numbers.split("[\n,]");
        }
        if(numbers.isEmpty()) return sum;
        if(numberArray.length == 1) return Integer.parseInt(numberArray[0]);
        for(String number : numberArray){
            sum += Integer.parseInt(number);
        }

        return sum;
    }


}
