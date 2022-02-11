import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    @Test
    void emptyStringShouldReturnZero() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0,stringCalculator.add(""));
    }

    @Test
    void addOneNumberTenItShouldReturnTen() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(10,stringCalculator.add("10"));
    }

    @Test
    void addOneNumberTwentyFiveItShouldReturnTwentyFive() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(25,stringCalculator.add("25"));
    }

    @Test
    void addTwoNumbersFourAndFiveItShouldReturnNine() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(9,stringCalculator.add("4,5"));
    }

    @Test
    void addTwoNumbers9AndSixShouldReturnFifteen() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(15,stringCalculator.add("9,6"));
    }

    @Test
    void addThreeNumbersTogetherItShouldReturnTwenty() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(20,stringCalculator.add("5,5,10"));
    }

    @Test
    void addFourNumbersTogetherItShouldReturnTen() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(10,stringCalculator.add("1,7,1,1"));
    }

    @Test
    void addTenNumbersTogetherItShouldReturnOneHundred() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(100,stringCalculator.add("10,10,10,10,10,10,10,10,10,10"));
    }

    @Test
    void addThreeNumbersTogetherWithCommasAndOneNewlineItShouldReturnNine() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(9,stringCalculator.add("1,7\n1"));
    }

    @Test
    void addFourNumbersTogetherWithCommasAndTwoNewlinesItShouldReturnNineteen() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(19,stringCalculator.add("1,7\n1\n10"));
    }

    @Test
    void addTwoNumbersTogetherWithSemicolonSeperatorItShouldReturnThree() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3,stringCalculator.add("//;\n1;2"));
    }


}
